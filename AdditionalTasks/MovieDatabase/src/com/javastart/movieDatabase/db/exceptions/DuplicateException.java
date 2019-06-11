package com.javastart.movieDatabase.db.exceptions;

public class DuplicateException extends  RuntimeException{

    public DuplicateException() {
        super("This object exist in Filmueb. You can't create duplicates.");
    }
}
