
package com.jappstart.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jappstart.model.auth.UserAccount;
import com.jappstart.service.auth.EnhancedUserDetailsService;

/**
 * The login controller.
 */
@Controller
public class LoginController {

    /**
     * The user details service.
     */
    private EnhancedUserDetailsService userDetailsService;

    /**
     * Gets the user details service.
     *
     * @return the user details service
     */
    public final EnhancedUserDetailsService getUserDetailsService() {
        return userDetailsService;
    }

    /**
     * Sets the user details service.
     *
     * @param userDetailsService the user details service
     */
    @Autowired
    public final void setUserDetailsService(
        final EnhancedUserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    /**
     * Adds an identifier to the model map to indicate there was an error
     * logging in.
     *
     * @param modelMap the model map
     * @return the view name
     */
    @RequestMapping(value = "/login/error", method = RequestMethod.GET)
    public final String error(final ModelMap modelMap) {
        modelMap.put("error", true);
        return "login";
    }

    /**
     * Determines if an account with the given username exists or not.
     *
     * @param request the request
     * @return the response
     */
    @RequestMapping(value = "/login/validate", method = RequestMethod.POST)
    @ResponseBody
    public final Map<String, Boolean> validate(
        @RequestBody final Map<String, String> request) {
        final Map<String, Boolean> response = new HashMap<String, Boolean>();
        final UserAccount user =
            userDetailsService.getUser(request.get("username"));

        if (user == null) {
            response.put("found", false);
        } else {
            response.put("found", true);
        }

        return response;
    }

}
