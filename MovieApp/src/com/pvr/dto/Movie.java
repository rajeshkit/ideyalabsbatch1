package com.pvr.dto;

public class Movie {
    int movieId;
	String movieName;
	String relaseDate;

    public Movie(int movieId, String movieName, String relaseDate) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.relaseDate = relaseDate;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getRelaseDate() {
        return relaseDate;
    }

    public void setRelaseDate(String relaseDate) {
        this.relaseDate = relaseDate;
    }
}
