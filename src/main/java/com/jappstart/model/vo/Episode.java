package com.jappstart.model.vo;


import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import net.sourceforge.filebot.web.Date;
import net.sourceforge.filebot.web.EpisodeFormat;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Arrays;


@SuppressWarnings("serial")
@Repository
@Entity
public class Episode implements Serializable {

    @Id
    private Key key;

	private String seriesName;
	private Integer season;
	private Integer episode;
	private String title;
	
	// absolute episode number
	private Integer absolute;
	
	// special number
	private Integer special;
	
	// episode airdate
	private Date airdate;
	

	protected Episode() {
		// used by serializer
	}

    public Episode(final Key key, final String title)
    {
        this.key = KeyFactory.createKey(key, getClass().getSimpleName(), title);
        this.title = title;
    }



	public Episode(String seriesName, Integer season, Integer episode, String title) {
		this(seriesName, season, episode, title, null, null, null);
	}
	

	public Episode(String seriesName, Integer season, Integer episode, String title, Integer absolute, Integer special, Date airdate) {
		this.seriesName = seriesName;
		this.season = season;
		this.episode = episode;
		this.title = title;
		this.absolute = absolute;
		this.special = special;
		this.airdate = airdate;
	}
	

	public String getSeriesName() {
		return seriesName;
	}
	

	public Integer getEpisode() {
		return episode;
	}
	

	public Integer getSeason() {
		return season;
	}
	

	public String getTitle() {
		return title;
	}
	

	public Integer getAbsolute() {
		return absolute;
	}
	

	public Integer getSpecial() {
		return special;
	}
	

	public Date airdate() {
		return airdate;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Episode) {
			Episode other = (Episode) obj;
			return equals(season, other.season) && equals(episode, other.episode) && equals(seriesName, other.seriesName) && equals(title, other.title) && equals(special, other.special);
		}
		
		return false;
	}
	

	private boolean equals(Object o1, Object o2) {
		if (o1 == null || o2 == null)
			return o1 == o2;
		
		return o1.equals(o2);
	}

    public Key getKey()
    {
        return key;
    }

    public void setKey(Key key)
    {
        this.key = key;
    }

    @Override
	public int hashCode() {
		return Arrays.hashCode(new Object[] { seriesName, season, episode, title, special });
	}
	

	@Override
	public String toString() {
		return EpisodeFormat.getSeasonEpisodeInstance().format(this);
	}
	
}
