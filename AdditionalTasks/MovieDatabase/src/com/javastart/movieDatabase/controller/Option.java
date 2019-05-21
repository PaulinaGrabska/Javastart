package com.javastart.movieDatabase.model;

public class Option {

    static final int EXIT = 0;
    static final int ADD_ACTOR = 1;
    static final int ADD_MOVIE = 2;
    static final int ADD_TVSERIES = 3;
    static final int DISPLAY_INFO = 4;
    static final int DISPLAY_ACTORS = 1;
    static final int DISPLAY_MOVIES = 2;
    static final int DISPLAY_TVSERIES = 3;


    //print all available option for user
    public void showOptions(){
        System.out.println("Available options:");
        System.out.println(EXIT + " - Exit Program");
        System.out.println(ADD_ACTOR + " - Add Actor");
        System.out.println(ADD_MOVIE + " - Add Movie");
        System.out.println(ADD_TVSERIES + " - Add Tv Series");
        System.out.println(DISPLAY_INFO + " - Display all information about actors/movies/tv series");
        System.out.println("\tChoose one of the options:");
    }


    public void displayOptions(){
        System.out.println("Choose what you want to see:" +
                "\n\t"+DISPLAY_ACTORS+" - you want to see all actors" +
                "\n\t" + DISPLAY_MOVIES + " - you want to see all movies" +
                "\n\t" + DISPLAY_TVSERIES + " - you want to see all tv series\n");
    }


}
