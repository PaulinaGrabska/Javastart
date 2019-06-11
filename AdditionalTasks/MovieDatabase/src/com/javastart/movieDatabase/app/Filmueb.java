package com.javastart.movieDatabase.app;
import com.javastart.movieDatabase.controller.ApplicationController;
import com.javastart.movieDatabase.controller.exceptions.OptionNotExistsException;
import com.javastart.movieDatabase.db.exceptions.DuplicateException;
import com.javastart.movieDatabase.io.exceptions.IncorrectDataException;


public class Filmueb {

    public static void main(String[] args) {

        double version = 0.7;
        System.out.println("Version of Filmueb application: " + version + "\n");

        ApplicationController appController = new ApplicationController();

             appController.mainLoop();
    }
}

