package com.main.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.main.model.Movie;

public interface IMovieRepository extends CrudRepository<Movie, Long> {
	 
    List<Movie> findByYearLessThan(int year);
 
}