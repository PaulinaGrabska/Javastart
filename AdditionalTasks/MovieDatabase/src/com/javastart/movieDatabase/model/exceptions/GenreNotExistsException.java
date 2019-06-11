package com.javastart.movieDatabase.model.exceptions;

public class GenreNotExistsException extends RuntimeException{

    public GenreNotExistsException() {
        super("The genre you entered doesn't exist.");
    }
}
