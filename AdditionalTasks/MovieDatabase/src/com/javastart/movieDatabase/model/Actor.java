package com.javastart.movieDatabase.model;

import java.util.Objects;

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

    public String toString(){
        return firstName + " " + lastName + " from " + countryOfOrigin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return firstName.equals(actor.firstName) &&
                lastName.equals(actor.lastName) &&
                countryOfOrigin.equals(actor.countryOfOrigin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, countryOfOrigin);
    }
}
