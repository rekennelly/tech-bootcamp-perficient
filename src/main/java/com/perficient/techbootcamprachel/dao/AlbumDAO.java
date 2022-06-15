package com.perficient.techbootcamprachel.dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.perficient.techbootcamprachel.entity.*;

public class AlbumDAO {
	private static String GET_ALL_ALBUMS_SQL = "SELECT * FROM albums WHERE artist_id = ?";
	
	public List<Album> getAllAlbumsByArtistId(int artist_id) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = new ConnectionUtil().getConnection();
			ps = con.prepareStatement(GET_ALL_ALBUMS_SQL);
			ps.setInt(1, artist_id);
			rs = ps.executeQuery();
			
			List<Album> albums = new ArrayList<Album>();
			while (rs.next() ) {
				Album album = new Album();
				album.setAlbumId(rs.getInt("album_id"));
				album.setAlbumName(rs.getString("album_name"));
				album.setAlbumReleaseYear(rs.getInt("release_year"));
				album.setArtistId(rs.getInt("artist_id"));
				albums.add(album);
			}
			return albums;
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			rs.close();
			ps.close();
			con.close();
		}
	}
}
