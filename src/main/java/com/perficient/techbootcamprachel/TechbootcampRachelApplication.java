package com.perficient.techbootcamprachel;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.perficient.techbootcamprachel.business.AlbumBO;
import com.perficient.techbootcamprachel.business.ArtistBO;
import com.perficient.techbootcamprachel.entity.Album;
import com.perficient.techbootcamprachel.entity.Artist;

@SpringBootApplication
public class TechbootcampRachelApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechbootcampRachelApplication.class, args);
//		System.out.println("Hello World");
		
		try {
			Artist artist = new ArtistBO().getArtistById(2);
			List<Album> albums = new AlbumBO().getAllAlbumsByArtistId(2);
			
			System.out.println(artist.getArtistName());
			for (Album album : albums) {
				System.out.println(album.toString());
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
