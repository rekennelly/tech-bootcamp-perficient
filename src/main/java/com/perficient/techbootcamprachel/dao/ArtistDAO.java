package com.perficient.techbootcamprachel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.perficient.techbootcamprachel.entity.Artist;

public class ArtistDAO {
	private static String GET_ARTIST_BY_ID = "SELECT * FROM artists WHERE artist_id = ?";
	
	public Artist getArtistById (int artist_id) throws SQLException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = new ConnectionUtil().getConnection();
			ps = con.prepareStatement(GET_ARTIST_BY_ID);
			ps.setInt(1, artist_id);
			rs = ps.executeQuery();
			
			Artist artist = new Artist();
			while (rs.next()) {
				artist.setArtistId(rs.getInt("artist_id"));
				artist.setArtistName(rs.getString("artist_name"));
			}
			return artist;
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
