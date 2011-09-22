package com.jappstart.model.vo;

import java.util.Date;

public class Book {

	int epicReleaseId;
	String author;
	String description;
	String link;
	String link2;
	Date add_date;    		//Date added
	Date update_date; 		//Update only on info updates
	
	public int getEpicReleaseId() {
		return epicReleaseId;
	}
	public void setEpicReleaseId(int epicReleaseId) {
		this.epicReleaseId = epicReleaseId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getLink2() {
		return link2;
	}
	public void setLink2(String link2) {
		this.link2 = link2;
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
