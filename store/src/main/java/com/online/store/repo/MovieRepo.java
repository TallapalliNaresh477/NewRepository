package com.online.store.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.online.store.model.Movies;

@Repository
public interface MovieRepo extends JpaRepository<Movies, Integer> {
	
	@Query(value="select * from Movies_List_Updated m where m.movie_name like %:keyword% or m.actor_of_movie like %:keyword%", nativeQuery=true)
	List<Movies> findByKeyword(@Param("keyword") String keyword);

}
