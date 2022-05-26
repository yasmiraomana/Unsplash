package com.unsplash.api.client.model;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class CoverPhoto {

	String id;
	@SerializedName("created_at") Date createdAt;
	@SerializedName("updated_at") Date updatedAt;
	@SerializedName("promoted_at") Date promotedAt;
	int width;
	int height;
	String color;
	@SerializedName("blur_hash") String blurHash;
	String description;
	@SerializedName("alt_description") String altDescription;
	Urls urls;
	Links links;
	ArrayList<String> categories;
	int likes;
	@SerializedName("liked_by_user") boolean likedByuser;
	@SerializedName("current_user_collections") ArrayList<String> currentUserCollections;
	String sponsorship;
	@SerializedName("topic_submissions") ArrayList<String> topicSubmissions;
	User user;
	
	
	public CoverPhoto() {}


	public CoverPhoto(String id, Date createdAt, Date updatedAt, Date promotedAt, int width, int height, String color,
			String blurHash, String description, String altDescription, Urls urls, Links links,
			ArrayList<String> categories, int likes, boolean likedByuser, ArrayList<String> currentUserCollections,
			String sponsorship, ArrayList<String> topicSubmissions, User user) {
		this.id = id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.promotedAt = promotedAt;
		this.width = width;
		this.height = height;
		this.color = color;
		this.blurHash = blurHash;
		this.description = description;
		this.altDescription = altDescription;
		this.urls = urls;
		this.links = links;
		this.categories = categories;
		this.likes = likes;
		this.likedByuser = likedByuser;
		this.currentUserCollections = currentUserCollections;
		this.sponsorship = sponsorship;
		this.topicSubmissions = topicSubmissions;
		this.user = user;
	}

}
