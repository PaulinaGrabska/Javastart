package com.javastart.movieDatabase.model;

import java.util.Objects;

public class Series extends Item {

    int numberOfSeasons;
    int numberOfEpisodes;
    String producer;


    public Series(String name, int numberOfSeasons, int numberOfEpisodes, String producer, Genre genre, String description, double rating){

        super(name, genre, description, rating);
        this.numberOfSeasons = numberOfSeasons;
        this.numberOfEpisodes = numberOfEpisodes;
        this.producer = producer;
    }


    public String getName() {
        return name;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public String getProducer() {
        return producer;
    }

    public Genre getGenre() {
        return genre;
    }

    public String getDescription() {
        return description;
    }

    public double getRating() {
        return rating;
    }

    public String toString(){
        return " TV Series : " + super.toString() +  "\"\n Seasons: "+numberOfSeasons + ", Episodes: " + numberOfEpisodes + ", Producent: "+producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return numberOfSeasons == series.numberOfSeasons &&
                numberOfEpisodes == series.numberOfEpisodes &&
                producer.equals(series.producer);
    }

}
