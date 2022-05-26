package com.unsplash.api.client.model;

import com.google.gson.annotations.SerializedName;

public class Source {
	
	Ancestry ancestry;
	String title;
	String subtitle;
	String description;
	@SerializedName("meta_title") String metaTitle;
	@SerializedName("meta_description") String metaDescription;
	@SerializedName("cover_photo") CoverPhoto coverPhoto;
	
	public Source() {}

	public Source(Ancestry ancestry, String title, String subtitle, String description, String metaTitle,
			String metaDescription, CoverPhoto coverPhoto) {
		super();
		this.ancestry = ancestry;
		this.title = title;
		this.subtitle = subtitle;
		this.description = description;
		this.metaTitle = metaTitle;
		this.metaDescription = metaDescription;
		this.coverPhoto = coverPhoto;
	}
	
	

}
