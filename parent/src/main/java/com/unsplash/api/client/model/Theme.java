package com.unsplash.api.client.model;

public class Theme {

	Approval wallpapers;
	Approval experimental;
	Approval spirituality;
		
	public Theme() {}

	public Theme(Approval wallpapers, Approval experimental, Approval spirituality) {
		this.wallpapers = wallpapers;
		this.experimental = experimental;
		this.spirituality = spirituality;
	}
	
	

}
