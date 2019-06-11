package com.javastart.movieDatabase.model;

public class Item {

    String name;
    Genre genre;
    String description;
    double rating;

    public Item(String name, Genre genre, String description, double rating) {
        this.name = name;
        this.genre = genre;
        this.description = description;
        this.rating = rating;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "\"" + name+  "\"\n, Genre: "+genre + ", Description: "+ description+
                ", Rating: "+rating;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Item item = (Item) object;
        return java.lang.Double.compare(item.rating, rating) == 0 &&
                java.util.Objects.equals(name, item.name) &&
                java.util.Objects.equals(genre, item.genre) &&
                java.util.Objects.equals(description, item.description);
    }

}
