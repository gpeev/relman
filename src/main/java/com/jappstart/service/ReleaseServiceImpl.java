package com.jappstart.service;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.memcache.*;
import com.jappstart.form.*;
import com.jappstart.model.vo.*;
import com.jappstart.model.vo.Rating;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import javax.persistence.*;
import javax.persistence.Query;
import java.util.*;


@Service
public class ReleaseServiceImpl implements ReleaseService{

    //todo: move all of this common stuff into a CommonService that is inheritied.



    private static final int DEFAULT_EXPIRATION = 3600;

    @PersistenceContext
    private transient EntityManager entityManager;

    /**
     * The datastore service.
     */
    private DatastoreService datastoreService;

    /**
     * The memcache service.
     */
    private MemcacheService memcacheService;



    /**
     * Returns the datastore service.
     *
     * @return the datastore service
     */
    public final DatastoreService getDatastoreService()
    {
        return datastoreService;
    }

    /**
     * Sets the datastore service.
     *
     * @param datastoreService the datastore service
     */
    @Autowired
    public final void setDatastoreService(final DatastoreService datastoreService)
    {
        this.datastoreService = datastoreService;
    }

    /**
     * Returns the memcache service.
     *
     * @return the memcache service
     */

    public final MemcacheService getMemcacheService()
    {
        return memcacheService;
    }

    /**
     * Sets the memcache service.
     *
     * @param memcacheService the memcache service
     */
    @Autowired
    public final void setMemcacheService(final MemcacheService memcacheService)
    {
        this.memcacheService = memcacheService;
    }


    @Transactional
    public final void addRelease(final Add a, final Locale locale)
    {
    	Release r;
    	TVInfo rInfo = populateTVInfo(a);

        System.out.println("In ReleaseService");
        if(a==null) System.out.println("Add is NULL");
        if(memcacheService==null) System.out.println("memcache is null");
        System.out.println("Title:"+a.getTitle());
        System.out.println("Type:"+a.getType());
        if(memcacheService != null){
        	r = (Release) memcacheService.get(new Release(a.getTitle(), a.getType(), a.getReleaseDate(), rInfo).getKey());
        	
            //check the cache
            if (r != null)
            {
                throw new RuntimeException("Found Duplicate Release in cache");
            }
            
            
            
            Release temp = new Release(a.getTitle(), a.getType(), a.getReleaseDate(), rInfo);
            
        	if(temp.getReleaseInfo() != null){
        		System.out.println("temp != null && release = " + temp.getReleaseInfo());
        		System.out.println("Try to Cast:" + temp.getReleaseInfo());
        		System.out.println("Try to getDescription:" + temp.getReleaseInfo().getDescription());
        	}
        	
        	final Query query = entityManager.createQuery("SELECT u FROM Release u WHERE key = :key");
            query.setParameter("key", temp.getKey());
            
            final List<?> results = query.getResultList();
            if (results != null && !results.isEmpty())
            {
                throw new RuntimeException("Found Duplicate Release in datastore");
            }
        } 

        //todo: maybe extend Release with Add so we don't have to dup all that
        //todo: or it my be better to be specific - Movie, Book, etc.
        r = new Release(a.getTitle(), a.getType(), a.getReleaseDate(), rInfo);
        
       	if(r.getReleaseInfo() != null){
    		System.out.println("temp != null && release = " + r.getReleaseInfo());
    		System.out.println("Try to Cast:" + r.getReleaseInfo());
    		System.out.println("Try to Description:" +r.getReleaseInfo().getDescription());
    	}
    	
        
        if(r != null){
        	System.out.println("Release is not null " + r.getTitle());
        	entityManager.persist(r);
        }
   
        memcacheService.put(r.getKey(), r, Expiration.byDeltaSeconds(DEFAULT_EXPIRATION));
        System.out.println(r+" has been persisted.");
    }


    @SuppressWarnings("unchecked")
	@Transactional
    public List<Release> loadReleases(RelType type)
    {
        List<Release> r = null;
        Query query;
        if (type != null){
        	query = entityManager.createQuery("SELECT FROM Release u JOIN u.releaseInfo where u.type='" + type.name() +"'");
        } else {
        	query = entityManager.createQuery("SELECT FROM Release u");
        }
        
        try
        {
            r = query.getResultList();
            for (int i = 0; i < r.size(); i++)
            {
                Release release = r.get(i);
                System.out.println(i+") "+release);
                if(release.getReleaseInfo() != null){
                	TVInfo temp = release.getReleaseInfo();
                	System.out.println("Description from release = " + temp.getDescription());;
                }
            }
        }
        catch (NoResultException e)
        {
            throw new RuntimeException("No Release's found.", e);
        }
        return r;
    }
    
    private TVInfo populateTVInfo(Add a){
    	TVInfo tvinfo = new TVInfo();
    	
    	tvinfo.setAdd_date(new Date());
    	tvinfo.setCast(a.getCast());
    	tvinfo.setDescription(a.getDescription());
    	tvinfo.setGenre(a.getGenre());
    	tvinfo.setImdbId(a.getImdbId());
    	tvinfo.setNetwork(a.getNetwork());
    	tvinfo.setRating(a.getRating());
    	tvinfo.setTvDbId(a.getTvDbId());
    	tvinfo.setUpdate_date(new Date());
    	tvinfo.setZapTvId(a.getZapTvId());	
    	tvinfo.setNetflixId(a.getNetflixId());
    	
    	return tvinfo;
    }


    @SuppressWarnings("unchecked")
	@Transactional
	public Release viewReleaseDetails(String key) {
        Release release = null;
       
        Query query = entityManager.createQuery("SELECT FROM Release u JOIN u.releaseInfo where u.key=" + key);
        
        try
        {
            release = (Release)query.getSingleResult();            
        }
        catch (NoResultException e)
        {
            throw new RuntimeException("No Detail's found.", e);
        }
        return release;
	}
    
} 
