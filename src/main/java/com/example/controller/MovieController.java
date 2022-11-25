package com.example.controller;

import com.example.domain.Movie;
import com.example.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieController {
    private MovieService movieService;

    @Autowired
    MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/moviePost")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie) {
        Movie movie1 = movieService.saveMovie(movie);
        return new ResponseEntity<>(movie1, HttpStatus.CREATED);
    }

    @GetMapping("/movieGet")
    public ResponseEntity<?> getAllMovie() {
        List<Movie> list = movieService.getAllMovie();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
