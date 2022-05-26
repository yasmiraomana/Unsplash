package com.unsplash.api.client.model;

public class Ancestry {
	Slug type;
	Slug category;
	Slug subcategory;
	
	public Ancestry() {
		// TODO Auto-generated constructor stub
	}

	public Ancestry(Slug type, Slug category, Slug subcategory) {
		this.type = type;
		this.category = category;
		this.subcategory = subcategory;
	}

	
}
