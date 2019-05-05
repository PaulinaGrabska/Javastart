package startClass;
import app.*;


public class Filmueb {

    public static void main(String[] args) {

        double version = 0.1;
        System.out.println("Version of Filmueb application: " + version + "\n");



        Actor actor1 = new Actor("Brad", "Pitt","USA");

        Movie movie1 = new Movie("Mexican", "Hattrick", 1999, "Comedy"
        , "Funny movie about love, guns and etc.", 4.5);

        Series series1 = new Series("Love and hate", 4,12,
                "Warner", "Comedy", "Different faces of love", 5.0);



        // printing info about actor
        System.out.printf("Actor : %s %s from %s \n\n", actor1.getFirstName(),actor1.getLastName(),actor1.getCountryOfOrigin());

        //printing info about Movie
        System.out.printf("Movie : \"%s\"\n Director: %s\n Production Year: %d\n Type: %s\n Description: %s\n Rating: %f\n\n",
                movie1.getName(), movie1.getDirector(), movie1.getProductionYear(), movie1.getDescription(), movie1.getType()
                , movie1.getRating());

        //prnting info about series
        System.out.printf("Series : \"%s\"\n Seasons: %d\n Episodes: %d\n Producent: %s\n Type: %s\n Description: %s\n Rating: %f\n\n",
                series1.getName(), series1.getNumberOfSeasons(), series1.getNumberOfEpisodes(), series1.getProducent(),
                series1.getType(), series1.getDescription(), series1.getRating());


    }



}

