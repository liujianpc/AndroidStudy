package com.example.listviewtest;


public class Family {
	private String name;
	private int imageId;
	
	public Family(String name, int imageId) {
		this.name = name;
		this.imageId = imageId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	
	
}
