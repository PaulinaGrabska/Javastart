package com.javastart.movieDatabase.model;

public class Movie extends Item {

    private String director;
    private int productionYear;


    public Movie(String name, String director, int productionYear, String type, String description, double rating){

        super(name, description,type,rating);
        this.director = director;
        this.productionYear = productionYear;
    }


    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public int getProductionYear() {
        return productionYear;
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
