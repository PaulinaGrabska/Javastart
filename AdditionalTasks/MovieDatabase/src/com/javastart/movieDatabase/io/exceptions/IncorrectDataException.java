package com.javastart.movieDatabase.io.exceptions;

public class IncorrectDataException extends RuntimeException{

    public IncorrectDataException() {
        super("You entered incorrect data.");
    }
}
