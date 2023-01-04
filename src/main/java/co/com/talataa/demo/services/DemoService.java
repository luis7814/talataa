package co.com.talataa.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.talataa.demo.api.ConsumeApi;
import co.com.talataa.demo.model.Movie;
import co.com.talataa.demo.model.MoviesInformation;
import co.com.talataa.demo.utilities.Constants;

@Service
public class DemoService {
	
	@Autowired
	private ConsumeApi consumeApi;
	
	private String api = Constants.URL + "&api_key=" + Constants.TOKEN;
	
	public MoviesInformation findAll() {
		return consumeApi.consumeApi(api);
	}
	
	public MoviesInformation findById(Integer id) {
		
		MoviesInformation moviesInformation = new MoviesInformation();
		
		List<Movie> movies = new ArrayList<>();
		movies = consumeApi.consumeApi(api)
				.getResults().stream()
				.filter(b -> b.getId().equals(id))
				.collect(Collectors.toList());
		
		moviesInformation.setResults(movies);
		
		return moviesInformation;
		
	}
	
	public MoviesInformation save(MoviesInformation moviesInformation) {
		return null;
	}
	
	public MoviesInformation update(MoviesInformation moviesInformation) {
		return null;
	}
	
	public MoviesInformation delete(Integer id) {
		return null;
	}

}
