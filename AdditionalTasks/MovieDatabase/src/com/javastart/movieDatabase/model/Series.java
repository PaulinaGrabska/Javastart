package com.javastart.movieDatabase.model;

public class Series extends Item {

    int numberOfSeasons;
    int numberOfEpisodes;
    String producer;


    public Series(String name, int numberOfSeasons, int numberOfEpisodes, String producer, String type, String description, double rating){

        super(name, description,type,rating);
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


    public String getType() {
        return type;
    }


    public String getDescription() {
        return description;
    }


    public double getRating() {
        return rating;
    }

}
