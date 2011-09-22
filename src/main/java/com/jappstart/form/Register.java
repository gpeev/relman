
package com.jappstart.form;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

/**
 * The registration form bean.
 */
@SuppressWarnings("serial")
public class Register implements Serializable {

    /**
     * Display name.
     */
    @Pattern(regexp = ".+")
    private String displayName;

    /**
     * The username.
     */
    @Pattern(regexp = ".+")
    private String username;

    /**
     * The e-mail address.
     */
    @Pattern(regexp = ".+@.+\\.[a-z]+")
    private String email;

    /**
     * The password.
     */
    @Pattern(regexp = ".{5,}+")
    private String password;

    /**
     * Sets the display name.
     *
     * @param displayName the display name
     */
    /* CHECKSTYLE:OFF */
    public void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }
    /* CHECKSTYLE:ON */

    /**
     * Gets the display name.
     *
     * @return the display name
     */
    /* CHECKSTYLE:OFF */
    public String getDisplayName() {
        return displayName;
    }
    /* CHECKSTYLE:ON */

    /**
     * Sets the username.
     *
     * @param username the username
     */
    /* CHECKSTYLE:OFF */
    public void setUsername(final String username) {
        this.username = username;
    }
    /* CHECKSTYLE:ON */

    /**
     * Gets the username.
     *
     * @return the username
     */
    /* CHECKSTYLE:OFF */
    public String getUsername() {
        return username;
    }
    /* CHECKSTYLE:ON */

    /**
     * Sets the e-mail address.
     *
     * @param email the e-mail address
     */
    /* CHECKSTYLE:OFF */
    public void setEmail(final String email) {
        this.email = email;
    }
    /* CHECKSTYLE:ON */

    /**
     * Gets the e-mail address.
     *
     * @return the e-mail address
     */
    /* CHECKSTYLE:OFF */
    public String getEmail() {
        return email;
    }
    /* CHECKSTYLE:ON */

    /**
     * Sets the password.
     *
     * @param password the password
     */
    /* CHECKSTYLE:OFF */
    public void setPassword(final String password) {
        this.password = password;
    }
    /* CHECKSTYLE:ON */

    /**
     * Gets the password.
     *
     * @return the password
     */
    /* CHECKSTYLE:OFF */
    public String getPassword() {
        return password;
    }
    /* CHECKSTYLE:ON */

}
