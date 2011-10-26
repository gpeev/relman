package com.jappstart.model.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;



import com.google.appengine.api.datastore.*;

import org.springframework.stereotype.Repository;

@SuppressWarnings("serial")
@Repository
@Entity
public class TVInfo implements Serializable{
    /**
     * The key.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Key key;
    
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
	private int epicReleaseId;
	private String tvDbId;			//theTVDb.com unique ID
	private String cast;
	private String rating;
	private String network;			//TV network i.e. FOX, CBS, ABC, etc.
	private String description;
	private String genre;			//Comma separated i.e. Drama, Comedy
	private String zapTvId;
	private String imdbId;
	private String netflixId;
	private Date add_date;    		//Date added
	private Date update_date; 		//Update only on info updates
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List <TVEp> episodes;
	
	public List<TVEp> getEpisodes() {
		return episodes;
	}

	public void setEpisodes(List<TVEp> episodes) {
		this.episodes = episodes;
	}

	public int getEpicReleaseId() {
		return epicReleaseId;
	}
	public void setEpicReleaseId(int epicReleaseId) {
		this.epicReleaseId = epicReleaseId;
	}
	public String getTvDbId() {
		return tvDbId;
	}
	public void setTvDbId(String tvDbId) {
		this.tvDbId = tvDbId;
	}
	public String getCast() {
		return cast;
	}
	public void setCast(String cast) {
		this.cast = cast;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getZapTvId() {
		return zapTvId;
	}
	public void setZapTvId(String zapTvId) {
		this.zapTvId = zapTvId;
	}
	public String getImdbId() {
		return imdbId;
	}
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
	public String getNetflixId() {
		return netflixId;
	}

	public void setNetflixId(String netflixId) {
		this.netflixId = netflixId;
	}

	public Date getAdd_date() {
		return add_date;
	}
	public void setAdd_date(Date add_date) {
		this.add_date = add_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	
}
