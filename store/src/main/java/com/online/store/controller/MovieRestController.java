package com.online.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.store.model.Movies;
import com.online.store.model.MoviesWithRecords;
import com.online.store.service.MovieService;
import com.online.store.service.OnlineServiceImpl;

@RestController
@RequestMapping("/movieInfo")
public class MovieRestController {
	
//	@Autowired
//	private OnlineServiceImpl onlineServiceImpl;
//	@Autowired
//	private MovieService movieService;
//
//	@PostMapping
//	public MoviesWithRecords addMovies(@RequestBody MoviesWithRecords movies) {
//		return movieService.addMovies(movies);
//	}
//
//	@GetMapping
//	public List<MoviesWithRecords> getMoviesList() {
//		return movieService.getMovies();
//	}
//
//	@GetMapping("/{id}")
//	public MoviesWithRecords getMovie(@PathVariable int id) {
//		return movieService.getMovie(id);
//	}
//
////	private List<MoviesWithRecords> moviesRecords=List.of(
////			new MoviesWithRecords(123,"Bahubali","Prabas","Drama","2018"),
////			new MoviesWithRecords(124,"Bahubali2","Prabas","Drama","2019"),
////			new MoviesWithRecords(125,"Bahubali","Prabas","Drama","2023"),
////			new MoviesWithRecords(126,"Bahubali","Prabas","Drama","2024")
////			);
////	@GetMapping("/moviesWithRecords")
////	public List<MoviesWithRecords> getMoviesWithRecords()
////	{
////		return moviesRecords;
////		
////	}
//
//	@PreAuthorize("hasRole('ADMIN')")
//	@PostMapping("movies/save")
//	public ResponseEntity<Movies> movieCreate(@RequestBody Movies movies) {
////		URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").build(null)
//
//		onlineServiceImpl.save(movies);
//		return new ResponseEntity<>(HttpStatusCode.valueOf(200));
//	}
//
//	@GetMapping("movies/list")
//	public List<Movies> getMovies() {
//		return onlineServiceImpl.getAllMovies();
//
//	}
//
//	@PutMapping("movies/{movie_id}")
//	public Movies getMoviesInfo(@RequestBody Movies movies) {
//		onlineServiceImpl.save(movies);
//		return movies;
//
//	}
//
//	@PreAuthorize("hasRole('ADMIN')")
//	@DeleteMapping("movies/{movie_id}")
//	public void deleteMovie(@PathVariable("movie_id") Integer movie_id) {
//		onlineServiceImpl.deleteViaId(movie_id);
//	}
//
//	@GetMapping("movies/{movie_id}")
//	public Movies getMovieNameById(@PathVariable("movie_id") Integer movie_id) {
//		return onlineServiceImpl.getById(movie_id);
//
//	}

}
