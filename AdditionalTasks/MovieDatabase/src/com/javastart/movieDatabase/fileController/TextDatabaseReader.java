package com.javastart.movieDatabase.fileController;

import com.javastart.movieDatabase.db.ApplicationDatabase;
import com.javastart.movieDatabase.model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextDatabaseReader implements DatabaseReader,TextDatabase{


    @Override
    public ApplicationDatabase read() {

    }

    void readFile(String file, Movie [] movies){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line =null;
            List <String> lines =new ArrayList<>();

            while((line=br.readLine())!=null){
                lines.add(String.valueOf(line.split(";")));
                for (String s:lines) {
                    System.out.println(s + " ");
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




}
