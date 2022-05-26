package com.unsplash.api.client.model;

import com.google.gson.annotations.SerializedName;

public class Social {

	@SerializedName("instagram_username") String instagramUsername;
	@SerializedName("portfolio_url") String portfolioUrl;
	@SerializedName("twitter_username") String twitterUsername;
	@SerializedName("paypal_email") String paypalEmail;
	
	public Social(){}

	public Social(String instagramUsername, String portfolioUrl, String twitterUsername, String paypalEmail) {
		super();
		this.instagramUsername = instagramUsername;
		this.portfolioUrl = portfolioUrl;
		this.twitterUsername = twitterUsername;
		this.paypalEmail = paypalEmail;
	}
	
	

	
}
