package co.com.talataa.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.com.talataa.demo.model.MoviesInformation;
import co.com.talataa.demo.services.DemoService;

@RestController
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@GetMapping("/movies")
	public MoviesInformation findAll() {
		return demoService.findAll();
	}
	
	@GetMapping("/movies/{id}")
	public MoviesInformation findById(@PathVariable Integer id) {
		return demoService.findById(id);
	}
	
	@PostMapping("/movies")
	public MoviesInformation save(@RequestBody MoviesInformation moviesInformation) {
		return demoService.save(moviesInformation);
	}
	
	@PutMapping("/movies")
	public MoviesInformation update(@RequestBody MoviesInformation moviesInformation) {
		return demoService.update(moviesInformation);
	}
	
	@DeleteMapping("/movies/{id}")
	public MoviesInformation delete(@PathVariable Integer id) {
		return demoService.delete(id);
	}
}
