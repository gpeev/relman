
package com.jappstart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.appengine.api.memcache.MemcacheService;

/**
 * The admin controller.
 */
@Controller
public class AdminController {

    /**
     * The memcache service.
     */
    private MemcacheService memcacheServiceUser;

    /**
     * Returns the memcache service.
     *
     * @return the memcache service
     */
    public final MemcacheService getMemcacheServiceUser() {
        return memcacheServiceUser;
    }

    /**
     * Sets the memcache service.
     *
     * @param memcacheServiceUser the user memcache service
     */
    @Autowired
    public final void setMemcacheServiceUser(
        final MemcacheService memcacheServiceUser) {
        this.memcacheServiceUser = memcacheServiceUser;
    }

    /**
     * Admin.
     *
     * @return the view name
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public final String create() {
        return "admin";
    }

    /**
     * Flushes memcache.
     *
     * @return the view name
     */
    @RequestMapping(value = "/admin/flush", method = RequestMethod.GET)
    public final String flushCache() {
        memcacheServiceUser.clearAll();
        return "admin";
    }

}
