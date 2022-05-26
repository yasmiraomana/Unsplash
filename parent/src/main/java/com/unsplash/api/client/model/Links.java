package com.unsplash.api.client.model;

import com.google.gson.annotations.SerializedName;

public class Links {
	String self;
	String html;
	String photos;
	String likes;
	String portfolio;
	String following;
	String followers;
	String download;
	@SerializedName("download_location") String downloadLocation;
	
	public Links(){}
	
	public Links(String self, String html, String photos, String likes, String portfolio, String following,
			String followers, String download, String downloadLocation) {
		this.self = self;
		this.html = html;
		this.photos = photos;
		this.likes = likes;
		this.portfolio = portfolio;
		this.following = following;
		this.followers = followers;
		this.download = download;
		this.downloadLocation = downloadLocation;
	}
	    

	
}
