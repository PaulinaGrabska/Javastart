package com.javastart.movieDatabase.model;
/*
Aplikację przebuduj w taki sposób, aby dane przechowywane były teraz w klasie ApplicationDatabase.
Powinna ona posiadać pola będące tablicami – filmów, seriali i aktorów. W klasie tej powinny znajdować się także metody,
które pozwolą dodać kolejny film, serial lub aktora oraz zwrócą odpowiednią tablicę filmów, seriali lub aktorów.
Klasa ta nie powinna zajmować się wczytywaniem danych, a jedynie ich przechowywaniem.
 */

public class ApplicationDatabase {

    public static final int MAX_NR_OF_ACTORS = 10;
    public static final int MAX_NR_OF_MOVIES = 10;
    public static final int MAX_NR_OF_SERIES = 10;

    private int numberOfActors;
    private int numberOfMovies;
    private int numberOfSeries;

    Actor[] actors;
    Movie[] movies;
    Series[] tvseries;

    public ApplicationDatabase(){
        actors = new Actor[MAX_NR_OF_ACTORS];
        movies = new Movie[MAX_NR_OF_MOVIES];
        tvseries = new Series[MAX_NR_OF_SERIES];

        numberOfActors = 0;
        numberOfMovies = 0;
        numberOfSeries = 0;
    }


// add an actor
    public void addActor(Actor actor) {
        if(numberOfActors==MAX_NR_OF_ACTORS){
            System.out.println("The number of actors in table has been exceeded. The actor can not be added.");
        }else{
            actors[numberOfActors] = actor;
            System.out.println("The actor has been added");
            numberOfActors++;
        }
    }


// add a movie
    public void addMovie(Movie movie) {
        if(numberOfMovies==MAX_NR_OF_MOVIES){
            System.out.println("The number of movies in table has been exceeded. The movie can not be added.");
        }else {
            if (movie.rating < 0 || movie.rating > 10) {
                movies[numberOfMovies] = null;
                System.out.println("You've entered the wrong value of rating. The movie is null");
            } else {
                movies[numberOfMovies] = movie;
                System.out.println("The movie has been added");
                numberOfMovies++;
            }
        }
    }

// add a tv tvseries
    public void addSeries(Series series){
        if(numberOfSeries==MAX_NR_OF_SERIES){
            System.out.println("The number of Tv Series in table has been exceeded. The Tv Series can not be added.");
        }else {
            if (series.rating < 0 || series.rating > 10) {
                tvseries[numberOfSeries] = null;
                System.out.println("You've entered the wrong value of rating. The Tv Series is null");
            } else {
                tvseries[numberOfSeries] = series;
                System.out.println("The tv tvseries has been added");
                numberOfSeries++;
            }
        }
    }


    public void displayActors() {
        System.out.println("All actors:");
        if (numberOfActors == 0) {
            System.out.println(numberOfActors);
            System.out.println("    The model with actors is empty.");
        } else {
            for (int i = 0; i < numberOfActors; i++) {
                System.out.printf(" %s %s from %s\n", actors[i].getFirstName(), actors[i].getLastName(), actors[i].getCountryOfOrigin());
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
                System.out.printf("Movie : \"%s\"\n Director: %s\n Production Year: %d\n Type: %s\n Description: %s\n Rating: %f\n\n",
                        movies[i].getName(), movies[i].getDirector(), movies[i].getProductionYear(), movies[i].getDescription(), movies[i].getType()
                        , movies[i].getRating());
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
                System.out.printf("Series : \"%s\"\n Seasons: %d\n Episodes: %d\n Producent: %s\n Type: %s\n Description: %s\n Rating: %f\n\n",
                        tvseries[i].getName(), tvseries[i].getNumberOfSeasons(), tvseries[i].getNumberOfEpisodes(), tvseries[i].getProducent(),
                        tvseries[i].getType(), tvseries[i].getDescription(), tvseries[i].getRating());
            }
        }
        System.out.println();
    }

}
