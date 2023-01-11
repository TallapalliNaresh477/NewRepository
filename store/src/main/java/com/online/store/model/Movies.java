package com.online.store.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Movies_List_Updated")
public class Movies {
	@Id
	@Column(name = "movie_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer movie_id;
	@Column(name = "movie_name")
	private String movie_name;
	@Column(name = "actor_of_movie")
	private String actor_of_movie;
	@Column(name = "genre_of_movie")
	private String genre_of_movie;
	@Column(name = "year_of_release")
	private String year_of_release;

	public Movies() {
		super();
	}

	public Movies(Integer movie_id, String movie_name, String actor_of_movie, String genre_of_movie,
			String year_of_release) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.actor_of_movie = actor_of_movie;
		this.genre_of_movie = genre_of_movie;
		this.year_of_release = year_of_release;
	}

	public Integer getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getActor_of_movie() {
		return actor_of_movie;
	}

	public void setActor_of_movie(String actor_of_movie) {
		this.actor_of_movie = actor_of_movie;
	}

	public String getGenre_of_movie() {
		return genre_of_movie;
	}

	public void setGenre_of_movie(String genre_of_movie) {
		this.genre_of_movie = genre_of_movie;
	}

	public String getYear_of_release() {
		return year_of_release;
	}

	public void setYear_of_release(String year_of_release) {
		this.year_of_release = year_of_release;
	}

	@Override
	public String toString() {
		return "Movies [movie_id=" + movie_id + ", movie_name=" + movie_name + ", actor_of_movie=" + actor_of_movie
				+ ", genre_of_movie=" + genre_of_movie + ", year_of_release=" + year_of_release + "]";
	}

}
