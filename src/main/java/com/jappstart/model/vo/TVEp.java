package com.jappstart.model.vo;

import java.util.Date;

public class TVEp {

	int epicReleaseId;  
	int season;
	int episode;	
	String episodeTitle;
	Date air_date;
	String tvDbId;			//theTVDb.com unique ID
	String description;
	Date add_date;    		//Date added
	Date update_date; 		//Update only on info updates
	String director;
	String writer;
	
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
