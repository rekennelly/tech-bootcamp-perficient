package com.perficient.techbootcamprachel.entity;

import javax.persistence.*;

@Entity
@Table(name="artists")
public class Artist {
	@Id
	private int artist_id;
	private String artist_name;
	
	public int getArtistId() {
		return artist_id;
	}
	
	public void setArtistId(int artist_id) {
		this.artist_id = artist_id;
	}
	
	public String getArtistName() {
		return artist_name;
	}
	
	public void setArtistName(String artist_name) {
		this.artist_name = artist_name;
	}
}