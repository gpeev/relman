
package com.jappstart.form;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

/**
 * The registration form bean.
 */
@SuppressWarnings("serial")
public class Add implements Serializable {

    /**
     * Display name.
     */
    @Pattern(regexp = ".+")
    private String title;

    /**
     * The username.
     */
    @Pattern(regexp = ".+")
    private String releaseDate;

    /**
     * The e-mail address.
     */
    @Pattern(regexp = ".+@.+\\.[a-z]+")
    private String imageLocation;

    /**
     * The password.
     */
    @Pattern(regexp = ".{5,}+")
    private String description;

    /**
     * Sets the display name.
     *
     * @param displayName the display name
     */
    /* CHECKSTYLE:OFF */
    public void setTitle(final String title) {
        this.title = title;
    }
    /* CHECKSTYLE:ON */

    /**
     * Gets the display name.
     *
     * @return the display name
     */
    /* CHECKSTYLE:OFF */
    public String getTitle() {
        return title;
    }
    /* CHECKSTYLE:ON */

    /**
     * Sets the username.
     *
     * @param username the username
     */
    /* CHECKSTYLE:OFF */
    public void setReleaseDate(final String releaseDate) {
        this.releaseDate = releaseDate;
    }
    /* CHECKSTYLE:ON */

    /**
     * Gets the username.
     *
     * @return the username
     */
    /* CHECKSTYLE:OFF */
    public String getReleaseDate() {
        return releaseDate;
    }
    /* CHECKSTYLE:ON */

    /**
     * Sets the e-mail address.
     *
     * @param email the e-mail address
     */
    /* CHECKSTYLE:OFF */
    public void setDescription(final String description) {
        this.description = description;
    }
    /* CHECKSTYLE:ON */

    /**
     * Gets the e-mail address.
     *
     * @return the e-mail address
     */
    /* CHECKSTYLE:OFF */
    public String getDescription() {
        return description;
    }
    /* CHECKSTYLE:ON */

    /**
     * Sets the password.
     *
     * @param password the password
     */
    /* CHECKSTYLE:OFF */
    public void setImageLocation(final String imageLocation) {
        this.imageLocation = imageLocation;
    }
    /* CHECKSTYLE:ON */

    /**
     * Gets the password.
     *
     * @return the password
     */
    /* CHECKSTYLE:OFF */
    public String getImageLocation() {
        return imageLocation;
    }
    /* CHECKSTYLE:ON */

}
