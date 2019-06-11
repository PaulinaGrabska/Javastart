package com.javastart.movieDatabase.model;

public class Movie extends Item {

    private String director;
    private int productionYear;


    public Movie(String name, String director, int productionYear, Genre genre, String description, double rating){

        super(name,genre, description,rating);
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
        return "Movie: " + super.toString() + ", Director: "+ director+ ", Production Year: "+ productionYear;
    }

}
