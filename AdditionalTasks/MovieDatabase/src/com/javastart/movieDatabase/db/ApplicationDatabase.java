package com.javastart.movieDatabase.db;

/*
Aplikację przebuduj w taki sposób, aby dane przechowywane były teraz w klasie ApplicationDatabase.
Powinna ona posiadać pola będące tablicami – filmów, seriali i aktorów. W klasie tej powinny znajdować się także metody,
które pozwolą dodać kolejny film, serial lub aktora oraz zwrócą odpowiednią tablicę filmów, seriali lub aktorów.
Klasa ta nie powinna zajmować się wczytywaniem danych, a jedynie ich przechowywaniem.
 */

import com.javastart.movieDatabase.model.*;

public class ApplicationDatabase {

    public static final int MAX_NR_OF_ACTORS = 10;
    public static final int MAX_NR_OF_MOVIES = 10;
    public static final int MAX_NR_OF_SERIES = 10;

    private int numberOfActors;
    private int numberOfMovies;
    private int numberOfSeries;

    private Actor[] actors;
    private Movie[] movies;
    private Series[] tvseries;

    public ApplicationDatabase(){
        actors = new Actor[MAX_NR_OF_ACTORS];
        movies = new Movie[MAX_NR_OF_MOVIES];
        tvseries = new Series[MAX_NR_OF_SERIES];
    }


// add an actor
    public void addActor(Actor actor) {
        if(!checkContent(actor,actors)) {
            if (numberOfActors == MAX_NR_OF_ACTORS) {
                System.out.println("The number of actors in table has been exceeded. The actor can not be added.");
            } else {
                actors[numberOfActors] = actor;

                System.out.println("The actor has been added");
                numberOfActors++;
            }
        }else{
            System.out.println("This actor already exist");
        }

    }


// add a movie
    public void addMovie(Movie movie) {
        if(!checkContent(movie,movies)) {
            if (numberOfMovies == MAX_NR_OF_MOVIES) {
                System.out.println("The number of movies in table has been exceeded. The movie can not be added.");
            } else if (movie == null) {
                System.out.println("You've entered the wrong value of movie data. The movie is null and can not be added.");
            } else {
                movies[numberOfMovies] = movie;
                System.out.println("The movie has been added");
                numberOfMovies++;
            }
        }else{
            System.out.println("This movie already exist");
        }
    }

// add a tv tvseries
    public void addSeries(Series series){
        if(!checkContent(series,tvseries)) {
            if(numberOfSeries==MAX_NR_OF_SERIES){
                System.out.println("The number of Tv Series in table has been exceeded. The Tv Series can not be added.");
            }else if(series==null){
                System.out.println("You've entered the wrong value of rating. The Tv Series is null and can not be added.");
            } else {
                tvseries[numberOfSeries] = series;
                System.out.println("The tv tvseries has been added");
                numberOfSeries++;
            }
        }else{
            System.out.println("This Tv series already exist");
        }
    }


    public void displayActors() {
        System.out.println("All actors:");
        if (numberOfActors == 0) {
            System.out.println(numberOfActors);
            System.out.println("    The model with actors is empty.");
        } else {
            for (int i = 0; i < numberOfActors; i++) {
                actors[i].toString();
            }
        }
        System.out.println();
    }


    public void displayMovies() {
        System.out.println("\nAll movies:");
        if (numberOfMovies == 0) {
            System.out.println("    The model with movies is empty.");
        } else {
            for (int i = 0; i < numberOfMovies; i++) {
                movies[i].toString();
            }
        }
        System.out.println();
    }

    public void displaySeries() {
        System.out.println("\nAll Tv Series:");
        if (numberOfSeries == 0) {
            System.out.println("    The model with tv tvseries is empty.");
        } else {
            for (int i = 0; i < numberOfSeries; i++) {
                tvseries[i].toString();
            }
        }
        System.out.println();
    }


    public <T> boolean checkContent(T obj, T [] array){
        for (T o:array) {
            if (o!=null && o.equals(obj)){
                return true;
            }
        }
        return false;
    }

}
