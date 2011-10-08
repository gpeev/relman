package com.jappstart.controller;

import com.jappstart.exception.*;
import com.jappstart.form.*;
import com.jappstart.model.vo.*;
import com.jappstart.service.*;
import com.jappstart.service.auth.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.*;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.*;

import javax.servlet.http.*;
import javax.validation.*;
import java.util.*;

@Controller
public class ExampleController
{
    /**
     * The add form attribute name.
     */
    protected static final String ADD = "addExample";
    protected static final String UPDATE = "updateExample";
    protected static final String LIST = "listExample";


    /**
     * The locale resolver.
     */
    private LocaleResolver localeResolver;

    /**
     * The message source.
     */
    private MessageSource messageSource;

    private EnhancedUserDetailsService userDetailsService;

    private ReleaseService releaseService;

    public ReleaseService getReleaseService()
    {
        return releaseService;
    }

    @Autowired
    public final void setReleaseService(final ReleaseService releaseService)
    {
        this.releaseService = releaseService;
    }


    /**
     * Gets the user details service.
     *
     * @return the user details service
     */
    public final EnhancedUserDetailsService getUserDetailsService()
    {
        return userDetailsService;
    }

    /**
     * Sets the user details service.
     *
     * @param userDetailsService the user details service
     */
    @Autowired
    public final void setUserDetailsService(final EnhancedUserDetailsService userDetailsService)
    {
        this.userDetailsService = userDetailsService;
    }


    /**
     * Gets the locale resolver.
     *
     * @return the locale resolver
     */
    public final LocaleResolver getLocaleResolver()
    {
        return localeResolver;
    }

    /**
     * Sets the locale resolver.
     *
     * @param localeResolver the locale resolver
     */
    @Autowired
    public final void setLocaleResolver(final LocaleResolver localeResolver)
    {
        this.localeResolver = localeResolver;
    }

    /**
     * Gets the message source.
     *
     * @return the message source
     */
    public final MessageSource getMessageSource()
    {
        return messageSource;
    }

    /**
     * Sets the message source.
     *
     * @param messageSource the message source
     */
    @Autowired
    public final void setMessageSource(final MessageSource messageSource)
    {
        this.messageSource = messageSource;
    }

    /**
     * Display the create account form.
     *
     * @param model the model map
     * @return the view name
     */
    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public final String create(final ModelMap model)
    {
    	
        model.addAttribute(ADD, new Add());
        return "add";
    }


    /**
     * Handle the create account form submission.
     *
     * @param add     the add form bean
     * @param binding the binding result
     * @param request the HTTP servlet request
     * @return the path
     */
    @RequestMapping(value = "/add2", method = RequestMethod.POST)
    public final String submit(
            @ModelAttribute(ADD) @Valid final Add add,
            final BindingResult binding, final HttpServletRequest request)
    {
        final Locale locale = localeResolver.resolveLocale(request);

        if (binding.hasErrors())
        {
            return "add";
        }

        System.out.println("Inside the submit method");

        try
        {
            //userDetailsService.addUser(user, locale);
        }
        catch (DuplicateUserException e)
        {
            binding.addError(new FieldError(ADD, "title",
                    messageSource.getMessage("create.error.username", null, locale)));
            return "add";
        }

        return "";
    }


    @RequestMapping(value = "/listUsersExample", method = RequestMethod.GET)
    public final Map listUsers()
    {
        List<Release> rs = releaseService.loadReleases();
        System.out.println("Found Releases:"+ rs.size());
        for (int i = 0; i < rs.size(); i++)
        {
            Release r = rs.get(i);
            System.out.println(i+") "+r);
        }

        Map ret = new HashMap();
        ret.put("a","hi");
        ret.put("b","bye");


        return ret;
    }


}
