package ex16_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Stats {

    static void saveToFile(String file, List<Result> list){

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){

            for (Result i : list) {
                bw.write(i.getName() + ";" + i.getResult());
                bw.newLine();
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
