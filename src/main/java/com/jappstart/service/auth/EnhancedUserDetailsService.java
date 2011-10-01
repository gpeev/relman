
package com.jappstart.service.auth;

import java.util.*;

import org.springframework.security.core.userdetails.*;

import com.jappstart.model.auth.UserAccount;

/**
 * The enhanced user details service interface.
 */
public interface EnhancedUserDetailsService extends UserDetailsService {

    /**
     * Adds a user.
     *
     * @param user the user
     * @param locale the locale
     */
    void addUser(final UserAccount user, final Locale locale);

    /**
     * Returns the user account for the given username.
     *
     * @param username the username
     * @return the user account
     */
    UserAccount getUser(final String username);

    /**
     * Activates the user with the given activation key.
     *
     * @param key the activation key
     * @return true if successful; false otherwise
     */
    boolean activateUser(final String key);

    /**
     * Indicates if the activation e-mail has been sent.
     *
     * @param username the username
     * @return true if sent; false otherwise
     */
    boolean isActivationEmailSent(final String username);

    /**
     * Updates the activation e-mail sent status.
     *
     * @param username the username
     */
    void activationEmailSent(final String username);

     List<UserDetails> loadUsers();

}
