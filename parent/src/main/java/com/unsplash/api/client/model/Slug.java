package com.unsplash.api.client.model;

import com.google.gson.annotations.SerializedName;

public class Slug {

	String slug;
	@SerializedName("pretty_slug") String prettySlug;
		
	public Slug() {
		// TODO Auto-generated constructor stub
	}

	public Slug(String slug, String prettySlug) {
		this.slug = slug;
		this.prettySlug = prettySlug;
	}
	
	

}
