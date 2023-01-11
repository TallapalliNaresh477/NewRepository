package com.online.store.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record MoviesWithRecords(@JsonProperty int movie_id,@JsonProperty String movie_name,@JsonProperty String actor_of_movie,@JsonProperty String genre_of_movie,@JsonProperty String year_of_release ) {

}
