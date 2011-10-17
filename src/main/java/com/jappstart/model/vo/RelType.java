package com.jappstart.model.vo;

public enum RelType {
	MOVIE("Movie"),
	MUSIC("Music"),
	GAME("Video Game"),
	BOOK("Book"),
	TVSHOW("TV Show"),
	GADGET("Gadget");
	
	
	private String text;

	RelType(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public static RelType fromString(String text) {
		if (text != null) {
			for (RelType b : RelType.values()) {
				if (text.equalsIgnoreCase(b.name())) {
					return b;
				}
			}
		}
		return null;
	}
}
