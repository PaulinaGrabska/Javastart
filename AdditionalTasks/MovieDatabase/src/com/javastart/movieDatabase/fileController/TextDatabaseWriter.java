package com.javastart.movieDatabase.fileController;

import com.javastart.movieDatabase.db.ApplicationDatabase;
import com.javastart.movieDatabase.model.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TextDatabaseWriter implements DatabaseWriter,TextDatabase{

    @Override
    public void write(ApplicationDatabase database) {
        saveToFile(movieFile, database.getMovies());
        saveToFile(tvseriesFile, database.getTvseries());
        saveToFile(actorFile, database.getActors());
    }


    void saveToFile(String file, Movie[] movies){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (Movie m : movies) {
                bw.write(m.getName()+";"+m.getGenre()+";"+m.getDescription()+";"+m.getRating()+";"+m.getProductionYear()+";"
                        +m.getDirector());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void saveToFile(String file, Series [] tvSeries){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (Series s : tvSeries) {
                bw.write(s.getName()+";"+s.getNumberOfEpisodes()+";"+s.getNumberOfSeasons() +";"+ s.getProducer()+";"+s.getGenre()
                        +";"+s.getDescription()+";"+s.getRating());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void saveToFile(String file, Actor [] actors){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (Actor a : actors) {
                bw.write(a.getFirstName()+";"+a.getLastName()+";"+a.getCountryOfOrigin());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
