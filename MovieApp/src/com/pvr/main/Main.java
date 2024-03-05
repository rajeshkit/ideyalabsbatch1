package com.pvr.main;

import com.pvr.dto.Movie;
import com.pvr.service.MovieService;
import com.pvr.service.MovieServiceImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the movieId");

        int movieId=s.nextInt();
        System.out.println("Enter the movie name");
        s.nextLine();
        String movieName=s.nextLine();

        System.out.println("Enter the movie relase date");
        String relaseDate=s.next();
        Movie movie=new Movie(movieId,movieName,relaseDate);
        MovieService movieService=new MovieServiceImpl(); //lsp
        movieService.addMovie(movie);
    }
}
