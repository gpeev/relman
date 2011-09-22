package com.jappstart.model.vo;

public enum Rating {
	PG("PG"),
	PG_13("PG-13"),
	R("R"),
	NC_17("NC-17"),
	G("G");

	private String text;

	Rating(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public static Rating fromString(String text) {
		if (text != null) {
			for (Rating b : Rating.values()) {
				if (text.equalsIgnoreCase(b.text)) {
					return b;
				}
			}
		}
		return null;
	}
}
