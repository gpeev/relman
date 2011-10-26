package com.jappstart.controller;

import com.google.appengine.api.blobstore.*;
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

import javax.servlet.http.*;
import javax.validation.*;
import java.util.*;

/**
 * The add controller.
 */
@Controller
@RequestMapping("/add")
@SessionAttributes(AddController.ADD)
public class AddController
{

    /**
     * The add form attribute name.
     */
    protected static final String ADD = "add";
    public Map<String, String> type = new LinkedHashMap<String, String>();

    /**
     * The locale resolver.
     */
    private LocaleResolver localeResolver;

    /**
     * The message source.
     */
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
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public final String create(final ModelMap model)
    {
        model.addAttribute(ADD, new Add());
        System.out.println("Inside the submit method");
        System.out.println("ADD Class has " + model.toString());
        return "add";
    }

    private BlobstoreService blobstoreService = BlobstoreServiceFactory.getBlobstoreService();


    /**
     * Handle the create account form submission.
     *
     * @param add     the add form bean
     * @param binding the binding result
     * @param request the HTTP servlet request
     * @return the path
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public final String submit(
            @ModelAttribute(ADD) @Valid final Add add,
            final BindingResult binding, final HttpServletRequest request)
    {
        final Locale locale = localeResolver.resolveLocale(request);

        if (binding.hasErrors())
        {
            System.out.println("Binding Error: " + binding.getErrorCount());
            System.out.println("Inside the Binding Errors block = " + binding.getAllErrors().toString());
            return "add";
        }


        System.out.println("AddControler about to add release");

        try
        {
            //TODO Implement saving of the release

        	/**
            System.out.println("Blobs -------------------------------------------- Start");
            Map<String, BlobKey> blobs = blobstoreService.getUploadedBlobs(request);

            Iterator bit = blobs.keySet().iterator();
            List<String> imgKeys = new ArrayList<String>();
            while (bit.hasNext())
            {
                String key = (String) bit.next();
                BlobKey blob = blobs.get(key);
                System.out.println(key + " : " + blob.getKeyString());
                imgKeys.add(blob.getKeyString());
            }
            System.out.println("Blobs -------------------------------------------- End");


            add.setImageKeys(imgKeys);
			**/
            releaseService.addRelease(add, locale);
        }
        catch (Exception e)
        {

            e.printStackTrace();

            binding.addError(new FieldError(ADD, "title",
                    messageSource.getMessage("add.error.release", null,
                            locale)));
            return "add";
        }

        return "add";
    }

    //TODO Not working, and can be removed if we can't set dropdown via referenceData method - Dharmesh

    protected Map<String, Map<String, String>> referenceData(HttpServletRequest request) throws Exception
    {

        System.out.println("RelType name= " + RelType.MOVIE.name());
        System.out.println("RelType name= " + RelType.MOVIE.toString());

        Map<String, Map<String, String>> referenceData = new HashMap<String, Map<String, String>>();

        type.put(RelType.TVSHOW.name(), RelType.TVSHOW.toString());
        type.put(RelType.MOVIE.name(), RelType.MOVIE.toString());
        type.put(RelType.MUSIC.name(), RelType.MUSIC.toString());
        type.put(RelType.GAME.name(), RelType.GAME.toString());
        type.put(RelType.BOOK.name(), RelType.BOOK.toString());
        type.put(RelType.GADGET.name(), RelType.GADGET.toString());
        referenceData.put("typeList", type);

        return referenceData;
    }

}
