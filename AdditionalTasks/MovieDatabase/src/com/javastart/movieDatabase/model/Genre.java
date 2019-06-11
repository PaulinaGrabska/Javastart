package com.javastart.movieDatabase.model;

import com.javastart.movieDatabase.model.exceptions.GenreNotExistsException;

public enum Genre {
    COMEDY("Komedia"),SCI_FI( "Scifi"), DOCUMENTARY("Documentary"),
    ACTION("Action"),THRILLER( "Thriller"), HORROR("Horror");

    private String description;

    Genre(String description){
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public static Genre convert(String genre) {
  //      Genre[] genres = values();
        for (Genre g : Genre.values()) {
            if (g.getDescription().equals(genre)) {
                return g;
            }
        }
        throw new GenreNotExistsException();
    }

}
