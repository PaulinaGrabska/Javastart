package com.javastart.movieDatabase.app;
import com.javastart.movieDatabase.model.ApplicationController;


public class Filmueb {

    public static void main(String[] args) {

        double version = 0.5;
        System.out.println("Version of Filmueb application: " + version + "\n");

        ApplicationController appController = new ApplicationController();

        appController.mainLoop();

    }
}

