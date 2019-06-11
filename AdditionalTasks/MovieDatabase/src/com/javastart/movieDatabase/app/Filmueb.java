package com.javastart.movieDatabase.app;
import com.javastart.movieDatabase.controller.ApplicationController;


public class Filmueb {

    public static void main(String[] args) {

        double version = 0.6;
        System.out.println("Version of Filmueb application: " + version + "\n");

        ApplicationController appController = new ApplicationController();

        appController.mainLoop();

    }
}

