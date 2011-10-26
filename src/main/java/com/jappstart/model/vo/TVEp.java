package com.jappstart.model.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Repository;

import com.google.appengine.api.datastore.Key;

@SuppressWarnings("serial")
@Repository
@Entity
public class TVEp implements Serializable{
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
	private int season;
	private int episode;	
	private String episodeTitle;
	private Date air_date;
	private String tvDbId;			//theTVDb.com unique ID
	private String description;
	private Date add_date;    		//Date added
	private Date update_date; 		//Update only on info updates
	private String director;
	private String writer;
	
	public int getEpicReleaseId() {
		return epicReleaseId;
	}
	public void setEpicReleaseId(int epicReleaseId) {
		this.epicReleaseId = epicReleaseId;
	}
	public int getSeason() {
		return season;
	}
	public void setSeason(int season) {
		this.season = season;
	}
	public int getEpisode() {
		return episode;
	}
	public void setEpisode(int episode) {
		this.episode = episode;
	}
	public String getEpisodeTitle() {
		return episodeTitle;
	}
	public void setEpisodeTitle(String episodeTitle) {
		this.episodeTitle = episodeTitle;
	}
	public Date getAir_date() {
		return air_date;
	}
	public void setAir_date(Date air_date) {
		this.air_date = air_date;
	}
	public String getTvDbId() {
		return tvDbId;
	}
	public void setTvDbId(String tvDbId) {
		this.tvDbId = tvDbId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
}
