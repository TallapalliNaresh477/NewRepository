package com.online.store.service;

import java.util.List;

import com.online.store.model.Movies;

public interface OnlineService {
	public List<Movies> getAllMovies();
	
	public List<Movies> getByKeyword(String keyword);

	public void save(Movies movies);

	public Movies getById(Integer id);

	public void deleteViaId(Integer id);
	

}
