package com.jappstart.model.vo;

import java.util.Date;

public class TVInfo {

	int epicReleaseId;
	String tvDbId;			//theTVDb.com unique ID
	String cast;
	Rating rating;
	String network;			//TV network i.e. FOX, CBS, ABC, etc.
	String description;
	String genre;			//Comma separated i.e. Drama, Comedy
	String zapTvId;
	String imdbId;
	Date add_date;    		//Date added
	Date update_date; 		//Update only on info updates
	
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
	public Rating getRating() {
		return rating;
	}
	public void setRating(Rating rating) {
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
