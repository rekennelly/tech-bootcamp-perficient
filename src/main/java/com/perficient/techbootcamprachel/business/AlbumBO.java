package com.perficient.techbootcamprachel.business;

import java.sql.SQLException;
import java.util.List;

import com.perficient.techbootcamprachel.entity.Artist;
import com.perficient.techbootcamprachel.entity.Album;
import com.perficient.techbootcamprachel.dao.AlbumDAO;

public class AlbumBO {
	public List<Album> getAllAlbumsByArtistId(int artist_id) throws SQLException {
		return new AlbumDAO().getAllAlbumsByArtistId(artist_id);
	}
}
