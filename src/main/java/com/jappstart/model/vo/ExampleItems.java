package com.jappstart.model.vo;

import com.google.appengine.api.datastore.Key;
import com.jappstart.model.auth.PersistentLogin;
import com.jappstart.model.auth.UserAccount;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@SuppressWarnings("serial")
@Repository
@Entity
public class ExampleItems implements Serializable
{
    /**
     * The key.
     */
    @Id
    private Key key;

    /**
     * The username.
     */
    private String username;

    @OneToMany(mappedBy = "persistentUser", cascade = CascadeType.ALL)
    private Collection<PersistentLogin> persistentLogins;

    /**
     * The user account.
     */
    @OneToOne(mappedBy = "persistentUser", fetch = FetchType.LAZY)
    private UserAccount userAccount;


}
