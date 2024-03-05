package com.pvr.service;
import com.pvr.dto.Movie;

import java.util.List;

public interface MovieService {
    public boolean addMovie(Movie movie);
    public Movie deleteMovieById(int movieId);
    public Movie getMovieById(int movieId);
    public List<Movie> getAllMovies();
    public Movie updateMovieById(int movieId);

}
