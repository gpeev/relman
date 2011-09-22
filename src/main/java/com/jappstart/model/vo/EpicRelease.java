package com.jappstart.model.vo;

import java.util.Date;

public class EpicRelease {
	
	int epicReleaseId;  	//PK
	String title;			
	String title2;  		//Use as alias or alternate name
	Date releaseDate;  		//First air/release date
	String imageLocation;  	//Poster image, should be 240x160 (HxW)
	String purchaseLink;  
	String purchaseLink2;
	RelType type;			
	Date add_date;    		//Date added
	Date update_date; 		//Update only on info updates
	
	public int getEpicReleaseId() {
		return epicReleaseId;
	}
	public void setEpicReleaseId(int epicReleaseId) {
		this.epicReleaseId = epicReleaseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle2() {
		return title2;
	}
	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getImageLocation() {
		return imageLocation;
	}
	public void setImageLocation(String imageLocation) {
		this.imageLocation = imageLocation;
	}
	public String getPurchaseLink() {
		return purchaseLink;
	}
	public void setPurchaseLink(String purchaseLink) {
		this.purchaseLink = purchaseLink;
	}
	public String getPurchaseLink2() {
		return purchaseLink2;
	}
	public void setPurchaseLink2(String purchaseLink2) {
		this.purchaseLink2 = purchaseLink2;
	}
	public RelType getType() {
		return type;
	}
	public void setType(RelType type) {
		this.type = type;
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
