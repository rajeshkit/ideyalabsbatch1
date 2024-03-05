package com.pvr.service;

import com.pvr.dao.MovieDaoImpl;
import com.pvr.dto.Movie;

import java.util.List;

public class MovieServiceImpl implements MovieService{
    @Override
    public boolean addMovie(Movie movie) {
        MovieDaoImpl movieDao=new MovieDaoImpl();
        movieDao.addMovie(movie);
        return false;
    }

    @Override
    public Movie deleteMovieById(int movieId) {
        return null;
    }

    @Override
    public Movie getMovieById(int movieId) {
        return null;
    }

    @Override
    public List<Movie> getAllMovies() {
        return null;
    }

    @Override
    public Movie updateMovieById(int movieId) {
        return null;
    }
}
