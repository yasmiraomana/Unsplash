package com.unsplash.api.client.model;

import com.google.gson.annotations.SerializedName;

public class Urls {

	public final String raw;
	public final String full;
	public final String regular;
	public final String small;
	public final String thumb;	
	@SerializedName("small_s3") public final String smalls3;
	
	public Urls(String raw,
            String full,
            String regular,
            String small,
            String thumb,
            String smalls3) {
        this.raw = raw;
        this.full = full;
        this.regular = regular;
        this.small = small;
        this.thumb = thumb;
        this.smalls3 = smalls3;
    }
}
