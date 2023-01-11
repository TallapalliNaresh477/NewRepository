package com.online.store.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.store.model.MoviesWithRecords;

import io.micrometer.observation.Observation;
import io.micrometer.observation.ObservationRegistry;

//@Service
public class MovieService {

//	private List<MoviesWithRecords> movieList = new ArrayList<>();
//	@Autowired
//	private ObservationRegistry registry;
//
//	public MoviesWithRecords addMovies(MoviesWithRecords movies) {
//		movieList.add(movies);
//		return Observation.createNotStarted("addMovies", registry).observe(() -> movies);
//	}
//
//	public List<MoviesWithRecords> getMovies() {
//		return Observation.createNotStarted("getMovies", registry).observe(() -> movieList);
//
//	}
//	public MoviesWithRecords getMovie(int id) {
//		return Observation.createNotStarted("getMovies", registry)
//				.observe(() -> movieList.stream().filter(MoviesWithRecords->MoviesWithRecords.movie_id()==id)
//				.findAny().orElseThrow(()->new RuntimeException("movie not found with id"+id))
//				);
//		
//	}

}
