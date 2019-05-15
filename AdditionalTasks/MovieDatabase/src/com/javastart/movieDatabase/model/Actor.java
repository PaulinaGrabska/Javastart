package com.javastart.movieDatabase.model;

public class Actor {

    String firstName;
    String lastName;
    String countryOfOrigin;

    public Actor(String firstName, String lastName, String countryOfOrigin){
        this.firstName = firstName;
        this.lastName = lastName;
        this.countryOfOrigin = countryOfOrigin;

    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

}
