package app;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import database.*;
import java.util.Scanner;


public class Filmueb {

    public static void main(String[] args) {

        double version = 0.2;
        System.out.println("Version of Filmueb application: " + version + "\n");


        ConsoleDataReader cdr = new ConsoleDataReader();

        Scanner input = new Scanner(System.in);

        System.out.println("Choose the option you want to create: actor/movie/series");
        String option = input.nextLine();


        try {
            switch (option) {
                case "actor":
                    Actor actor1 = cdr.createActor();
                    System.out.printf("Actor : %s %s from %s \n\n", actor1.getFirstName(), actor1.getLastName(), actor1.getCountryOfOrigin());
                    break;
                case "movie":
                    Movie movie1 = cdr.createMovie();
                    System.out.printf("Movie : \"%s\"\n Director: %s\n Production Year: %d\n Type: %s\n Description: %s\n Rating: %f\n\n",
                            movie1.getName(), movie1.getDirector(), movie1.getProductionYear(), movie1.getDescription(), movie1.getType()
                            , movie1.getRating());
                    break;
                case "series":
                    Series series1 = cdr.createSeries();
                    System.out.printf("Series : \"%s\"\n Seasons: %d\n Episodes: %d\n Producent: %s\n Type: %s\n Description: %s\n Rating: %f\n\n",
                            series1.getName(), series1.getNumberOfSeasons(), series1.getNumberOfEpisodes(), series1.getProducent(),
                            series1.getType(), series1.getDescription(), series1.getRating());
                    break;
                default:
                    System.out.println("You've entered the wrong value.");
                    input.close();
            }
        }  catch (NullPointerException e) {
        System.out.println("You've entered the wrong value of rating. The Movie cannot be created.");
        }

    }


}

