package com.jappstart.model.vo;

public enum Platform {
	IOS("Apple iOS"),
	ANDROID("Android"),
	PS3("Sony PS3"),
	XBOX("Microsoft X-Box"),
	WII("Nintendo Wii"),
	GAMEBOY("Nintendo Gameboy"),
	PC("PC");

	private String text;

	Platform(String text) {
		this.text = text;
	}

	public String getText() {
		return this.text;
	}

	public static Platform fromString(String text) {
		if (text != null) {
			for (Platform b : Platform.values()) {
				if (text.equalsIgnoreCase(b.text)) {
					return b;
				}
			}
		}
		return null;
	}
}
