package com.jappstart.controller;

import com.google.appengine.api.datastore.KeyFactory;
import com.jappstart.form.*;
import com.jappstart.model.vo.*;
import com.jappstart.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;
import com.google.appengine.api.datastore.*;
import javax.servlet.http.*;
import javax.validation.*;
import java.util.*;

/**
 * The add controller.
 */
@Controller
@RequestMapping("/viewDetails")
@SessionAttributes(ViewDetailsController.VIEWDETAILS)
public class ViewDetailsController
{

    protected static final String VIEWDETAILS = "viewDetails";

    private LocaleResolver localeResolver;

    private MessageSource messageSource;

    private ReleaseService releaseService;

    public ReleaseService getReleaseService()
    {
        return releaseService;
    }

    @Autowired
    public void setReleaseService(ReleaseService releaseService)
    {
        this.releaseService = releaseService;
    }

    public final LocaleResolver getLocaleResolver()
    {
        return localeResolver;
    }

    @Autowired
    public final void setLocaleResolver(final LocaleResolver localeResolver)
    {
        this.localeResolver = localeResolver;
    }

    public final MessageSource getMessageSource()
    {
        return messageSource;
    }

    @Autowired
    public final void setMessageSource(final MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @RequestMapping(value = "/viewDetails", method = RequestMethod.GET)
    public final String listUsers(HttpServletRequest req) {
    	Release rs = null;
    	
    	RelType filterType = null;
    	if (req.getParameter("type") != null) {
    		filterType = RelType.fromString(req.getParameter("type"));
    	}

    	Release temp = new Release("Shit Happened","TVSHOW","", new TVInfo());
    	
    	Key key = temp.getKey();
    	
    	rs = releaseService.viewReleaseDetails(key);
    	
    	if (rs != null ){
    		System.out.println("Release is not null");
    		req.setAttribute("releaseInfo", rs);
    		return "viewDetails";
    	}
    	
    	/**
    	 * Temporary to see if result returns to UI
    	 */

    	TVInfo tvinfo = new TVInfo();
    	tvinfo.setAdd_date(new Date());
    	tvinfo.setCast("Dharmesh & Shreya");
    	tvinfo.setDescription("We getting married");
    	tvinfo.setGenre("Comedy");
    	tvinfo.setImdbId("imdbNumber");
    	tvinfo.setNetwork("CBS");
    	tvinfo.setRating("G");
    	tvinfo.setTvDbId("TvDbNumber");
    	tvinfo.setUpdate_date(new Date());
    	tvinfo.setZapTvId("ZapTvNumber");	
    	tvinfo.setNetflixId("NetflixNumber");
    	
    	rs = new Release("Thundercats", "TV Show", "02/19/1982", tvinfo);
    	//End of Temporary Release
    	
        req.setAttribute("releaseInfo",rs);

        return "viewDetails";
    }

 
}
