package com.javastart.movieDatabase.controller.exceptions;

public class OptionNotExistsException extends RuntimeException{

    public OptionNotExistsException() {
        super("The option you entered doesn't exist.");
    }
}
