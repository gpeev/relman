
package com.jappstart.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.LocaleResolver;

import com.jappstart.exception.DuplicateUserException;
import com.jappstart.form.Add;


/**
 * The add controller.
 */
@Controller
@RequestMapping("/add")
@SessionAttributes(AddController.ADD)
public class AddController {

    /**
     * The add form attribute name.
     */
    protected static final String ADD = "add";


    /**
     * The locale resolver.
     */
    private LocaleResolver localeResolver;

    /**
     * The message source.
     */
    private MessageSource messageSource;



    /**
     * Gets the locale resolver.
     *
     * @return the locale resolver
     */
    public final LocaleResolver getLocaleResolver() {
        return localeResolver;
    }

    /**
     * Sets the locale resolver.
     *
     * @param localeResolver the locale resolver
     */
    @Autowired
    public final void setLocaleResolver(final LocaleResolver localeResolver) {
        this.localeResolver = localeResolver;
    }

    /**
     * Gets the message source.
     *
     * @return the message source
     */
    public final MessageSource getMessageSource() {
        return messageSource;
    }

    /**
     * Sets the message source.
     *
     * @param messageSource the message source
     */
    @Autowired
    public final void setMessageSource(final MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    /**
     * Display the create account form.
     *
     * @param model the model map
     * @return the view name
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public final String create(final ModelMap model) {
        model.addAttribute(ADD, new Add());
        return "add";
    }


    /**
     * Handle the create account form submission.
     *
     * @param add the add form bean
     * @param binding the binding result
     * @param request the HTTP servlet request
     * @return the path
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public final String submit(
        @ModelAttribute(ADD) @Valid final Add add,
        final BindingResult binding, final HttpServletRequest request) {
        final Locale locale = localeResolver.resolveLocale(request);

        if (binding.hasErrors()) {
            return "add";
        }

        System.out.println("Inside the submit method");

        try {
            //userDetailsService.addUser(user, locale);
        } catch (DuplicateUserException e) {
            binding.addError(new FieldError(ADD, "title",
                messageSource.getMessage("create.error.username", null,
                    locale)));
            return "add";
        }

        return "";
    }

}
