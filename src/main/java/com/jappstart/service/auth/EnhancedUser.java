
package com.jappstart.service.auth;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

/**
 * The enhanced user.
 */
@SuppressWarnings("serial")
public class EnhancedUser extends User {

    /**
     * The email.
     */
    private String email;

    /**
     * The display name.
     */
    private String displayName;

    /**
     * The salt.
     */
    private String salt;

    /**
     * Creates an enhanced user.
     *
     * @param username the username
     * @param email the email
     * @param displayName the display name
     * @param password the password
     * @param salt the salt
     * @param enabled enabled
     * @param accountNonExpired acount non-expired
     * @param credentialsNonExpired credentials non-expired
     * @param accountNonLocked account non-locked
     * @param authorities authorities
     */
    public EnhancedUser(final String username, final String email,
        final String displayName, final String password, final String salt,
        final boolean enabled, final boolean accountNonExpired,
        final boolean credentialsNonExpired, final boolean accountNonLocked,
        final Collection<GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired,
            credentialsNonExpired, accountNonLocked, authorities);
        this.email = email;
        this.displayName = displayName;
        this.salt = salt;
    }

    /**
     * Returns the email.
     *
     * @return the email
     */
    public final String getEmail() {
        return email;
    }

    /**
     * Sets the email.
     *
     * @param email the email
     */
    public final void setEmail(final String email) {
        this.email = email;
    }

    /**
     * Returns the display name.
     *
     * @return the display name
     */
    public final String getDisplayName() {
        return displayName;
    }

    /**
     * Sets the display name.
     *
     * @param displayName the display name
     */
    public final void setDisplayName(final String displayName) {
        this.displayName = displayName;
    }

    /**
     * Gets the salt.
     *
     * @return the salt
     */
    public final String getSalt() {
        return salt;
    }

    /**
     * Sets the salt.
     *
     * @param salt the salt
     */
    public final void setSalt(final String salt) {
        this.salt = salt;
    }

    @Override
    public final boolean equals(final Object o) {
        return super.equals(o);
    }

    @Override
    public final int hashCode() {
        return super.hashCode();
    }

}
