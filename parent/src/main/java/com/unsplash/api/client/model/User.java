package com.unsplash.api.client.model;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class User {
	
	String id;
	@SerializedName("updated_at") Date updatedAt;
	String username;
	String name;
	@SerializedName("first_name") String firstName;
    @SerializedName("last_name") String lastName;
    @SerializedName("twitter_username") String twitterUsername;
    @SerializedName("portfolio_url") String portfolioUrl;
    String bio;
    String location;
    Links links;
    @SerializedName("profile_image") Urls profileImage;
    @SerializedName("instagram_username") String instagramUsername;
    @SerializedName("total_collections") int totalCollections;
    @SerializedName("total_likes") int totalLikes;
    @SerializedName("total_photos") int totalPhotos;
    @SerializedName("accepted_tos") boolean acceptedTos;
    @SerializedName("for_hire") boolean forHire;
    Social social;
     
	public User() {}

	public User(String id, Date updatedAt, String username, String name, String firstName, String lastName,
			String twitterUsername, String portfolioUrl, String bio, String location, Links links, Urls profileImage,
			String instagramUsername, int totalCollections, int totalLikes, int totalPhotos, boolean acceptedTos,
			boolean forHire, Social social) {
		this.id = id;
		this.updatedAt = updatedAt;
		this.username = username;
		this.name = name;
		this.firstName = firstName;
		this.lastName = lastName;
		this.twitterUsername = twitterUsername;
		this.portfolioUrl = portfolioUrl;
		this.bio = bio;
		this.location = location;
		this.links = links;
		this.profileImage = profileImage;
		this.instagramUsername = instagramUsername;
		this.totalCollections = totalCollections;
		this.totalLikes = totalLikes;
		this.totalPhotos = totalPhotos;
		this.acceptedTos = acceptedTos;
		this.forHire = forHire;
		this.social = social;
	}
	
	

}
