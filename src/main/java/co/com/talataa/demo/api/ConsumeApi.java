package co.com.talataa.demo.api;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import co.com.talataa.demo.model.MoviesInformation;

@Service
public class ConsumeApi {
	
	RestTemplate restTemplate;
	
	public MoviesInformation consumeApi(String url) {
		
		restTemplate = new RestTemplate();
		MoviesInformation moviesInformation = restTemplate.getForObject(url, MoviesInformation.class);
		return moviesInformation;
	}
}
