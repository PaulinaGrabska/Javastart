package com.javastart.movieDatabase.controller;

import com.javastart.movieDatabase.controller.exceptions.OptionNotExistsException;

public enum Option {

    EXIT (0),ADD_ACTOR (1), ADD_MOVIE (2), ADD_TVSERIES (3), DISPLAY_INFO (4),DISPLAY_ACTORS (1),DISPLAY_MOVIES (2),
    DISPLAY_TVSERIES (3);

    int number;

    Option(int number){
        this.number=number;
    }

    public int getNumber() {
        return number;
    }

    public static Option convert(int option){
        Option [] options = values();
        for (Option o: options) {
            if(o.getNumber()==option){
                return o;
            }
        }
        throw new OptionNotExistsException();
    }


    //print all available options for user
    public static void showOptions(){
        System.out.println("Available options:");
        System.out.println(EXIT.getNumber() + " - Exit Program");
        System.out.println(ADD_ACTOR.getNumber() + " - Add Actor");
        System.out.println(ADD_MOVIE.getNumber() + " - Add Movie");
        System.out.println(ADD_TVSERIES.getNumber() + " - Add Tv Series");
        System.out.println(DISPLAY_INFO.getNumber() + " - Display all information about actors/movies/tv series");
        System.out.println("\tChoose one of the options:");
    }


    public static void displayOptions(){
        System.out.println("Choose what you want to see:" +
                "\n\t"+DISPLAY_ACTORS+" - you want to see all actors" +
                "\n\t" + DISPLAY_MOVIES + " - you want to see all movies" +
                "\n\t" + DISPLAY_TVSERIES + " - you want to see all tv series\n");
    }
}
