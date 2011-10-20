package com.jappstart.model.vo;

import com.google.appengine.api.datastore.*;

import org.springframework.stereotype.*;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.*;

@SuppressWarnings("serial")
@Repository
@Entity
public class Release implements Serializable
{
    /**
     * The key.
     */
    @Id
    private Key key;

    private String title;
    private String type;
    private String date;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private TVInfo releaseInfo;
    
    
    /**
     * Returns the key.
     *
     * @return the key
     */
    public final Key getKey()
    {
        return key;
    }

    /**
     * Sets the key.
     *
     * @param key the key
     */
    public final void setKey(final Key key)
    {
        this.key = key;
    }

    public Release(final String title, final String type, final String date, final TVInfo releaseInfo)
    {
        this.key = KeyFactory.createKey(getClass().getSimpleName(), title + type);
        this.title = title;
        this.type = type;
        this.date = date;
        this.releaseInfo = releaseInfo;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }


    public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public TVInfo getReleaseInfo() {
		return releaseInfo;
	}

	public void setReleaseInfo(TVInfo releaseInfo) {
		this.releaseInfo = releaseInfo;
	}

	@Override
    public String toString()
    {
        return "Release{" +
                "key=" + key +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
