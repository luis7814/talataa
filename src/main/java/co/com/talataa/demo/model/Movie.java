package co.com.talataa.demo.model;

import java.util.List;

import lombok.Data;

@Data
public class Movie {

	private Boolean adult;
	private String backdrop_path;
	private List<Integer> genre_ids;
	private Integer id;
	private String original_language;
	private String original_title;
	private String overview;
	private Integer popularity;
	private String poster_path;
	private String release_date;
	private String title;
	private Boolean video;
	private Integer vote_average;
	private Integer vote_count;
	
}
