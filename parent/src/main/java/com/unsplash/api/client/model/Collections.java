package com.unsplash.api.client.model;

import java.util.ArrayList;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Collections {

	String id;
	String title;
	String description;
	@SerializedName("published_at") Date publishedAt;
	@SerializedName("last_collected_at") Date lastCollectedAt;
	@SerializedName("updated_at") Date updatedAt;
	boolean curated;
	boolean featured;
	@SerializedName("total_photos") int totalPhotos;
	boolean privatee;
	@SerializedName("share_key") String shareKey;
	ArrayList<Tags> tags;
	Links links;
	User user;
	@SerializedName("cover_photo") CoverPhoto coverPhoto;
	@SerializedName("preview_photos") PreviewPhotos previewPhotos;
	
	public Collections() {
		// TODO Auto-generated constructor stub
	}

	public Collections(String id, String title, String description, Date publishedAt, Date lastCollectedAt,
			Date updatedAt, boolean curated, boolean featured, int totalPhotos, boolean privatee, String shareKey,
			ArrayList<Tags> tags, Links links, User user, CoverPhoto coverPhoto, PreviewPhotos previewPhotos) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.publishedAt = publishedAt;
		this.lastCollectedAt = lastCollectedAt;
		this.updatedAt = updatedAt;
		this.curated = curated;
		this.featured = featured;
		this.totalPhotos = totalPhotos;
		this.privatee = privatee;
		this.shareKey = shareKey;
		this.tags = tags;
		this.links = links;
		this.user = user;
		this.coverPhoto = coverPhoto;
		this.previewPhotos = previewPhotos;
	}

	
}
