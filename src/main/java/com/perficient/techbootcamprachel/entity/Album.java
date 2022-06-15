package com.perficient.techbootcamprachel.entity;

import javax.persistence.*;

@Entity
@Table(name="albums")
public class Album {
	@Id
	private int album_id;
	private String album_name;
	private int release_year;
	private int artist_id;
	
	public int getAlbumId() {
		return album_id;
	}
	
	public void setAlbumId(int album_id) {
		this.album_id = album_id;
	}
	
	public String getAlbumName() {
		return album_name;
	}
	
	public void setAlbumName(String album_name) {
		this.album_name = album_name;
	}
	
	public int getAlbumReleaseYear() {
		return release_year;
	}
	
	public void setAlbumReleaseYear(int release_year) {
		this.release_year = release_year;
	}
	
	public int getArtistId() {
		return artist_id;
	}
	
	public void setArtistId(int artist_id) {
		this.artist_id = artist_id;
	}
	
	public String toString() {
		String str = album_name + ", " + release_year;
		return str;
	}
	
}
