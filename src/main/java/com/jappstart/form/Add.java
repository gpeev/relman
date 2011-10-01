
package com.jappstart.form;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Pattern;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * The add form bean.
 */
@SuppressWarnings("serial")
public class Add implements Serializable {

	/**
	 * Epic Release
	 */
	//display title
    @Pattern(regexp = ".+")
    private String title;
    @Pattern(regexp = ".+")
    private String title2;  //Alias title
    @Pattern(regexp = "(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/((19|20)\\d{2})", message = "Invalid date format, must be in the following format: MM/DD/YYYY.")
    private String releaseDate;

    private CommonsMultipartFile image;
    
    @Pattern(regexp = ".+")
    private String type;
    @Pattern(regexp = ".+")
    private String purchaseLink1;
    @Pattern(regexp = ".+")
    private String purchaseLink2;
    
    
    /**
     * Common/Shared amongst multiple categories 
     */
    @Pattern(regexp = ".+")
    private String description;
    @Pattern(regexp = ".+")
    private String link;
    @Pattern(regexp = ".+")
    private String link2;		
    @Pattern(regexp = "(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/((19|20)\\d{2})", message = "Invalid date format, must be in the following format: MM/DD/YYYY.")
    private String addDate; 		//All
    @Pattern(regexp = "(0?[1-9]|1[012])/(0?[1-9]|[12][0-9]|3[01])/((19|20)\\d{2})", message = "Invalid date format, must be in the following format: MM/DD/YYYY.")
    private String updateDate; 	//All
    @Pattern(regexp = ".+")
    private String rating;  	//Video games, movies, TV shows
    @Pattern(regexp = ".+")
    private String cast;		//TV Show, Movies
    @Pattern(regexp = ".+")
    private String genre; 		//TV Show, Movies, Video Games
    @Pattern(regexp = ".+")
    private String imdbId;		//TV Show, Movies
    @Pattern(regexp = ".+")
    private String netflixId;	//TV Show, Movies
    
    /**
     * TV Show data
     */
    @Pattern(regexp = ".+")
    private String tvDbId;
    @Pattern(regexp = ".+")
    private String zapTvId;
    @Pattern(regexp = ".+")
    private String network;


    /*
     * Video Game 
     */
    @Pattern(regexp = ".+")
    private String platform;
    @Pattern(regexp = "[0-9][0-9]", message="Invalid entry.  Please use only numbers.")
    private String maxPlayers;
    @Pattern(regexp = "0|1")
    private String online;
    
    /*
     * Movie  
     */
    @Pattern(regexp = ".+")
    private String director;
    @Pattern(regexp = ".+")
    private String writer;
    
    
    /*
     * Music  
     */
    @Pattern(regexp = ".+")
    private String artist;
    @Pattern(regexp = "[0-9][0-9]")
    private String numOfTracks;
    
    /*
     * Book
     */
    @Pattern(regexp = ".+")
    private String author;
    
    /*
     * Gadget
     */
    @Pattern(regexp = ".+")
    private String manufacturer;
    @Pattern(regexp = ".+")
    private String category;
    

    /* CHECKSTYLE:OFF */
    public void setTitle(final String title) {
        this.title = title;
    }
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
    public String getTitle() {
        return title;
    }
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
    public void setReleaseDate(final String releaseDate) {
        this.releaseDate = releaseDate;
    }
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
    public String getReleaseDate() {
        return releaseDate;
    }
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
    public void setDescription(final String description) {
        this.description = description;
    }
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
    public String getDescription() {
        return description;
    }
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
    public void setImage(final CommonsMultipartFile image) {
        this.image = image;
    }
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
    public CommonsMultipartFile getImage() {
        return image;
    }
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setType(final String type) {
		this.type = type;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getType() {
		return type;
	}
    /* CHECKSTYLE:ON */

	/* CHECKSTYLE:OFF */
	public String getTitle2() {
		return title2;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setTitle2(final String title2) {
		this.title2 = title2;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getPurchaseLink1() {
		return purchaseLink1;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setPurchaseLink1(final String purchaseLink1) {
		this.purchaseLink1 = purchaseLink1;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getPurchaseLink2() {
		return purchaseLink2;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setPurchaseLink2(final String purchaseLink2) {
		this.purchaseLink2 = purchaseLink2;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getLink() {
		return link;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setLink(final String link) {
		this.link = link;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getLink2() {
		return link2;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setLink2(final String link2) {
		this.link2 = link2;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getAddDate() {
		return addDate;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setAddDate(final String addDate) {
		this.addDate = addDate;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getUpdateDate() {
		return updateDate;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setUpdateDate(final String updateDate) {
		this.updateDate = updateDate;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getRating() {
		return rating;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setRating(final String rating) {
		this.rating = rating;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getCast() {
		return cast;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setCast(final String cast) {
		this.cast = cast;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getGenre() {
		return genre;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setGenre(final String genre) {
		this.genre = genre;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getImdbId() {
		return imdbId;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setImdbId(final String imdbId) {
		this.imdbId = imdbId;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getNetflixId() {
		return netflixId;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setNetflixId(final String netflixId) {
		this.netflixId = netflixId;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getTvDbId() {
		return tvDbId;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setTvDbId(final String tvDbId) {
		this.tvDbId = tvDbId;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getZapTvId() {
		return zapTvId;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setZapTvId(final String zapTvId) {
		this.zapTvId = zapTvId;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getNetwork() {
		return network;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setNetwork(final String network) {
		this.network = network;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getPlatform() {
		return platform;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setPlatform(final String platform) {
		this.platform = platform;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getMaxPlayers() {
		return maxPlayers;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setMaxPlayers(final String maxPlayers) {
		this.maxPlayers = maxPlayers;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String isOnline() {
		return online;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setOnline(final String online) {
		this.online = online;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getDirector() {
		return director;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setDirector(final String director) {
		this.director = director;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getWriter() {
		return writer;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setWriter(final String writer) {
		this.writer = writer;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getArtist() {
		return artist;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setArtist(final String artist) {
		this.artist = artist;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getNumOfTracks() {
		return numOfTracks;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setNumOfTracks(final String numOfTracks) {
		this.numOfTracks = numOfTracks;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getAuthor() {
		return author;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setAuthor(final String author) {
		this.author = author;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getManufacturer() {
		return manufacturer;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setManufacturer(final String manufacturer) {
		this.manufacturer = manufacturer;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public String getCategory() {
		return category;
	}
    /* CHECKSTYLE:ON */

    /* CHECKSTYLE:OFF */
	public void setCategory(final String category) {
		this.category = category;
	}
    /* CHECKSTYLE:ON */
	
}
