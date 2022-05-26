package com.unsplash.api.client.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class PreviewPhotos {

	String id;
	@SerializedName("created_at") Date createdAt;
	@SerializedName("updated_at") Date updatedAt;
	@SerializedName("blur_hash") String blurHash;
	Urls urls;
	
	public PreviewPhotos() {}

	public PreviewPhotos(String id, Date createdAt, Date updatedAt, String blurHash, Urls urls) {
	    this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.blurHash = blurHash;
		this.urls = urls;
	}
	
	
}
