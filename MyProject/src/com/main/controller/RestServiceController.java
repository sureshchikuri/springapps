package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.main.model.Movie;
import com.main.repository.IMovieRepository;

@RestController
public class RestServiceController {
 
    @Autowired
    private IMovieRepository repo;
 
 
    // CREATE
    @RequestMapping("/movies/create")
    @ResponseBody
    public String createMovie(String title, int year) {
        Movie movie = new Movie(title, year);
        try {
            repo.save(movie);
        } catch (Exception e) {
            
            return e.getMessage();
        }
        return "creation successful: " + String.valueOf(movie.getId());
    }
 
    // READ
    @RequestMapping("/movies/read")
    @ResponseBody
    public String readMovie(long id) {
        Movie movie;
        try {
            movie = repo.findOne(id);
        } catch (Exception e) {
            
            return e.getMessage();
        }
        if (movie == null) {
            String errorMst = "no movie found for id " + id;
            
            return errorMst;
        } else {
            return movie.getTitle() + " : " + movie.getYear();
        }
    }
 
    // UPDATE
    @RequestMapping("/movies/update")
    @ResponseBody
    public String readMovie(long id, String title, int year) {
        Movie movie;
        try {
            movie = repo.findOne(id);
            movie.setTitle(title);
            movie.setYear(year);
            repo.save(movie);
        } catch (Exception e) {
            
            return e.getMessage();
        }
        return movie.getTitle() + " : " + movie.getYear();
    }
 
    // DELETE
    @RequestMapping("/movies/delete")
    @ResponseBody
    public String deleteMovie(long id) {
        try {
            repo.delete(id);
        } catch (Exception e) {
            
            return e.getMessage();
        }
        return "deletion successful";
    }
 
    @RequestMapping("/movies/readAllBeforeYear")
    public List<Movie> getMoviesBeforeYear(@RequestParam(value = "year") int year) {
        List<Movie> movies = repo.findByYearLessThan(year);
        return movies;
    }
}