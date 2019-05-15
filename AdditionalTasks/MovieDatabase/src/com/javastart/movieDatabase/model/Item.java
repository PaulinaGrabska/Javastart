package com.javastart.movieDatabase.model;

class Item {

    String name;
    String type;
    String description;
    double rating;

    public Item(String name, String type, String description, double rating) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.rating = rating;
    }
}
