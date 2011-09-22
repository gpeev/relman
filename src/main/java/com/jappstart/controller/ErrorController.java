
package com.jappstart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The error controller.
 */
@Controller
public class ErrorController {

    /**
     * Error code.
     *
     * @param errorCode the error code
     * @param modelMap the model map
     * @return the model and view
     */
    @RequestMapping(value = "/error/{errorCode}", method = RequestMethod.GET)
    public final String errorCode(
        @PathVariable("errorCode") final String errorCode,
        final ModelMap modelMap) {
        modelMap.put("statusCode", errorCode);
        return "error";
    }

}
