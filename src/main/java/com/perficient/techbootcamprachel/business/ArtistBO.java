package com.perficient.techbootcamprachel.business;

import java.sql.SQLException;
import java.util.List;

import com.perficient.techbootcamprachel.dao.AlbumDAO;
import com.perficient.techbootcamprachel.dao.ArtistDAO;
import com.perficient.techbootcamprachel.entity.Album;
import com.perficient.techbootcamprachel.entity.Artist;

public class ArtistBO {
	public Artist getArtistById(int artist_id) throws SQLException {
		return new ArtistDAO().getArtistById(artist_id);
	}
}
