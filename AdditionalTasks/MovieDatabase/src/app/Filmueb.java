package app;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import database.*;
import java.util.Scanner;


public class Filmueb {

    public static void main(String[] args) {

        double version = 0.3;
        System.out.println("Version of Filmueb application: " + version + "\n");


        ConsoleDataReader cdr = new ConsoleDataReader();

        Actor[] actors = new Actor[10];
        Movie[] movies = new Movie[10];
        Series[] series = new Series[10];


        Scanner input = new Scanner(System.in);


        //start of application


        options();
        int option = input.nextInt();
        input.nextLine();


        while (option != 0) {
                switch (option) {
                    case 1:
                        if (cdr.numberOfActors < 10) {
                            actors[cdr.numberOfActors] = cdr.createActor();
                            System.out.println("The actor has been added");
                            cdr.numberOfActors++;
                        } else {
                            System.out.println("The number of actors in table has been exceeded. The actor can not be added.");
                        }
                        break;

                    case 2:
                        if (cdr.numberOfMovies < 10) {
                            movies[cdr.numberOfMovies] = cdr.createMovie();

                            if(movies[cdr.numberOfMovies]==null){
                                System.out.println("You've entered the wrong value. The movie can not be added.");
                            }else {
                                System.out.println("The movie has been added");
                                cdr.numberOfMovies++;
                            }
                        } else {
                            System.out.println("The number of movies in table has been exceeded. The movie can not be added.");
                        }
                        break;

                    case 3:
                        if (cdr.numberOfSeries < 10) {
                            series[cdr.numberOfSeries] = cdr.createSeries();

                            if(series[cdr.numberOfSeries]==null){
                                System.out.println("You've entered the wrong value. The tv series can not be added.");
                            }else {
                                System.out.println("The tv series has been added");
                                cdr.numberOfSeries++;
                            }
                        } else {
                            System.out.println("The number of tv series in table has been exceeded. The tv series can not be added.");
                        }
                        break;

                    case 4:
                        System.out.println("All actors:");
                        if(cdr.numberOfActors==0){
                            System.out.println("    The database with actors is empty.");
                        }else{
                            for (int i = 0; i < cdr.numberOfActors; i++) {
                                System.out.printf(" %s %s from %s\n", actors[i].getFirstName(), actors[i].getLastName(), actors[i].getCountryOfOrigin());
                            }
                        }

                        System.out.println("\nAll movies:");
                        if(cdr.numberOfMovies==0){
                            System.out.println("    The database with movies is empty.");
                        }else{
                             for (int i = 0; i < cdr.numberOfMovies; i++) {
                                 System.out.printf("Movie : \"%s\"\n Director: %s\n Production Year: %d\n Type: %s\n Description: %s\n Rating: %f\n\n",
                                         movies[i].getName(), movies[i].getDirector(), movies[i].getProductionYear(), movies[i].getDescription(), movies[i].getType()
                                         , movies[i].getRating());
                             }
                        }

                        System.out.println("\nAll Tv Series:");
                        if(cdr.numberOfSeries==0){
                            System.out.println("    The database with tv series is empty.");
                        }else{
                            for (int i = 0; i < cdr.numberOfSeries; i++) {
                                System.out.printf("Series : \"%s\"\n Seasons: %d\n Episodes: %d\n Producent: %s\n Type: %s\n Description: %s\n Rating: %f\n\n",
                                    series[i].getName(), series[i].getNumberOfSeasons(), series[i].getNumberOfEpisodes(), series[i].getProducent(),
                                    series[i].getType(), series[i].getDescription(), series[i].getRating());
                            }
                        }
                        System.out.println();

                        break;

                    case 0:
                        System.out.println("Exit filmueb Application");
                        input.close();
                        break;

                    default:
                        System.out.println("You've entered the wrong value.");
                        input.close();
                }

            options();
            option = input.nextInt();
            input.nextLine();

        }
        System.out.println("Exit filmueb Application");
        input.close();
    }


    public static void options(){
        System.out.println("Available options:");
        System.out.println("0 -Exit Program");
        System.out.println("1 - add Actor");
        System.out.println("2 - Add Movie");
        System.out.println("3 - Add Tv Series");
        System.out.println("4 - Display all information");
        System.out.println("Choose one of the opton:");

    }





}

