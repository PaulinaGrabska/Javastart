package database;
import java.util.Scanner;
/*
korzystając z klasy Scanner wczytają od użytkownika informacje odpowiednio o filmie, serialu lub aktorze i
zwrócą obiekt odpowiedniego typu.
Jeśli użytkownik poda nieprawidłową wartość (np. liczbę mniejszą od zera tam gdzie nie ma to sensu), to w konsoli
powinien wyświetlić się komunikat o tym, że obiektu nie udało się utworzyć, a metoda powinna zwrócić wartość null.
 */

public class ConsoleDataReader {

    Scanner user = new Scanner(System.in);


    public Movie createMovie() {

        Movie movie;

        System.out.println("Enter name of the Movie:");
        String movieName = user.nextLine();

        System.out.println("Enter name of Director:");
        String director = user.nextLine();

        System.out.println("Enter Production Year:");
        int productionYear = user.nextInt();
        user.nextLine();

        System.out.println("Enter type of Movie:");
        String type = user.nextLine();

        System.out.println("Enter the description:");
        String description = user.nextLine();

        System.out.println("Enter rating (from 0 to 10):");
        double rating = user.nextDouble();
        //user.nextLine();

/*
*/
        if (rating < 0 || rating > 10) {
            movie = null;
        } else {
            movie = new Movie(movieName, director, productionYear, type, description, rating);
        }

        return movie;
    }


    public Series createSeries(){

        Series series;

        System.out.println("Enter name of the Tv Series:");
        String seriesName = user.nextLine();

        System.out.println("Enter the number of seasons:");
        int seasons = user.nextInt();
        user.nextLine();

        System.out.println("Enter the number of episodes:");
        int episodes = user.nextInt();
        user.nextLine();

        System.out.println("Enter the Producent name:");
        String producent = user.nextLine();

        System.out.println("Enter the type of Tv Series:");
        String type = user.nextLine();

        System.out.println("Enter the description:");
        String description = user.nextLine();

        System.out.println("Enter rating (from 0 to 10):");
        double rating = user.nextDouble();
        //user.nextLine();

        if(rating <0 || rating>10 ){
            series = null;
        }else{
            series = new Series(seriesName, seasons,episodes, producent, type, description, rating);
        }

        return series;

    }

    public Actor createActor(){

        System.out.println("Enter first name of Actor:");
        String actorFn = user.nextLine();

        System.out.println("Enter last name of Actor:");
        String actorLn = user.nextLine();

        System.out.println("Enter country of origin of Actor:");
        String actorOrigin = user.nextLine();

        Actor actor = new Actor(actorFn, actorLn,actorOrigin);

        return actor;
    }


}
