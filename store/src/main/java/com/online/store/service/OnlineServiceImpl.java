package com.online.store.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online.store.model.Movies;
import com.online.store.repo.MovieRepo;

@Service
public class OnlineServiceImpl implements OnlineService {
	@Autowired
	private MovieRepo movieRepo;
	private Logger log=LoggerFactory.getLogger(getClass());

	@Override
	public List<Movies> getAllMovies() {

		return movieRepo.findAll();
	}

	@Override
	public void save(Movies movies) {
		movieRepo.save(movies);

	}

	@Override
	public Movies getById(Integer id) {
		Optional<Movies> optional = movieRepo.findById(id);
		Movies movies = null;
		if (optional.isPresent()) {
			movies = optional.get();
		} else {
			throw new RuntimeException("movie is not found for id: " + id);
		}
		return movies;
	}

	@Override
	public void deleteViaId(Integer id) {
		if(id!=null ) {
		try {
			movieRepo.deleteById(id);
		} catch (Exception e) {
			log.info("given id is not exists",e.getMessage());
		}
		}
		else
		{
			log.error("id can not be null");
		}

	}

	@Override
	public List<Movies> getByKeyword(String keyword) {
		return movieRepo.findByKeyword(keyword);
	}

}
