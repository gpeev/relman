package com.jappstart.service;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.memcache.*;
import com.jappstart.form.*;
import com.jappstart.model.vo.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import javax.persistence.*;
import javax.persistence.Query;
import java.util.*;


@Service
public class ReleaseServiceImpl implements ReleaseService
{

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
    public final void addRelease(final Add addForm, final Locale locale)
    {
        Release r;
        System.out.println("In ReleaseService");
        if (addForm == null) System.out.println("Add is NULL");
        if (memcacheService == null) System.out.println("memcache is null");
        System.out.println("Title:" + addForm.getTitle());
        System.out.println("Type:" + addForm.getType());

        if (memcacheService != null)
        {
            r = (Release) memcacheService.get(new Release(addForm.getTitle(), addForm.getType()).getKey());
            //check the cache
            if (r != null)
            {
                throw new RuntimeException("Found Duplicate Release in cache");
            }

            Release temp = new Release(addForm.getTitle(), addForm.getType());

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
        r = new Release(addForm.getTitle(), addForm.getType());
        if (r != null)
        {
            r.setImgKeys(addForm.getImageKeys());
            System.out.println("Release is not null " + r.getTitle());
            entityManager.persist(r);
        }

        memcacheService.put(r.getKey(), r, Expiration.byDeltaSeconds(DEFAULT_EXPIRATION));
        System.out.println(r + " has been persisted.");
    }


    @SuppressWarnings("unchecked")
    @Transactional
    public List<Release> loadReleases(RelType type)
    {
        List<Release> r = null;
        Query query;
        if (type != null)
        {
            query = entityManager.createQuery("SELECT u FROM Release u where u.type='" + type.name() + "'");
        }
        else
        {
            query = entityManager.createQuery("SELECT u FROM Release u");
        }

        try
        {
            r = query.getResultList();
            for (int i = 0; i < r.size(); i++)
            {
                Release release = r.get(i);
                System.out.println(i + ") " + release);
            }
        }
        catch (NoResultException e)
        {
            throw new RuntimeException("No Release's found.", e);
        }
        return r;
    }

} 
