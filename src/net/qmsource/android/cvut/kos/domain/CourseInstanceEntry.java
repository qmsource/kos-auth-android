package net.qmsource.android.cvut.kos.domain;

import java.net.URI;

import com.google.gson.annotations.SerializedName;

/**
 * 
 * @author Tonda Novak (http://qmsource.net/), 2011
 *
 */

public class CourseInstanceEntry {
	
	@SerializedName("@uri")
	private URI uri;
	@SerializedName("@id")
	private String id;
	
	public URI getUri() {
		return uri;
	}
	public void setUri(URI uri) {
		this.uri = uri;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
