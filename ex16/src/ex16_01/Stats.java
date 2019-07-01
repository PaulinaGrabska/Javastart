package ex16_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class Stats {

    static void saveToFile(String file, TreeSet<Integer> set){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){

            for (Integer i :set) {
                bw.write(i);
                bw.newLine();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
