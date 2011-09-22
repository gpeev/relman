
package com.jappstart.model.auth;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Repository;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

/**
 * The persistent user entity class.
 */
@SuppressWarnings("serial")
@Repository
@Entity
public class PersistentUser implements Serializable {

    /**
     * The key.
     */
    @Id
    private Key key;

    /**
     * The username.
     */
    private String username;

    /**
     * The persistent logins.
     */
    @OneToMany(mappedBy = "persistentUser", cascade = CascadeType.ALL)
    private Collection<PersistentLogin> persistentLogins;

    /**
     * The user account.
     */
    @OneToOne(mappedBy = "persistentUser", fetch = FetchType.LAZY)
    private UserAccount userAccount;

    /**
     * Create a persistent user with a unique username.
     *
     * @param key the parent key
     * @param username the username
     */
    public PersistentUser(final Key key, final String username) {
        this.key = KeyFactory.createKey(key, getClass().getSimpleName(),
            username);
        this.username = username;
    }

    /**
     * Returns the key.
     *
     * @return the key
     */
    public final Key getKey() {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key the key
     */
    public final void setKey(final Key key) {
        this.key = key;
    }

    /**
     * Returns the username.
     *
     * @return the username
     */
    public final String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     *
     * @param username the username
     */
    public final void setUsername(final String username) {
        this.username = username;
    }

    /**
     * Returns the persistent logins.
     *
     * @return the persistent logins
     */
    public final Collection<PersistentLogin> getPersistentLogins() {
        return persistentLogins;
    }

    /**
     * Sets the persistent logins.
     *
     * @param persistentLogins the persistent logins
     */
    public final void setPersistentLogins(
        final Collection<PersistentLogin> persistentLogins) {
        this.persistentLogins = persistentLogins;
    }

    /**
     * Gets the user account.
     *
     * @return the user account
     */
    public final UserAccount getUserAccount() {
        return userAccount;
    }

    /**
     * Sets the user account.
     *
     * @param userAccount the user account
     */
    public final void setUserAccount(final UserAccount userAccount) {
        this.userAccount = userAccount;
    }

}
