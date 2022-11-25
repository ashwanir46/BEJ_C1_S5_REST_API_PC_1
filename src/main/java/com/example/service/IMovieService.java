package com.example.service;

import com.example.domain.Movie;

import java.util.List;

public interface IMovieService {
    public Movie saveMovie(Movie movie);

    public List<Movie> getAllMovie();
}
