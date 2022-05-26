package com.unsplash.api.client.model;

import com.google.gson.annotations.SerializedName;

public class Approval {

	String status;
	@SerializedName("approved_on") String approvedOn;
		
	public Approval() {}

	public Approval(String status, String approvedOn) {
		super();
		this.status = status;
		this.approvedOn = approvedOn;
	}
	
	

}
