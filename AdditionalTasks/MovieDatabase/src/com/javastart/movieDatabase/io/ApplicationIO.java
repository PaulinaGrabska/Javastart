package com.javastart.movieDatabase.io;
import com.javastart.movieDatabase.io.exceptions.IncorrectDataException;
import com.javastart.movieDatabase.model.Actor;
import com.javastart.movieDatabase.model.Genre;
import com.javastart.movieDatabase.model.Movie;
import com.javastart.movieDatabase.model.Series;
import com.javastart.movieDatabase.model.exceptions.GenreNotExistsException;

import java.util.Scanner;
import java.util.zip.DataFormatException;
/*
korzystając z klasy Scanner wczytają od użytkownika informacje odpowiednio o filmie, serialu lub aktorze i
zwrócą obiekt odpowiedniego typu.
Jeśli użytkownik poda nieprawidłową wartość (np. liczbę mniejszą od zera tam gdzie nie ma to sensu), to w konsoli
powinien wyświetlić się komunikat o tym, że obiektu nie udało się utworzyć, a metoda powinna zwrócić wartość null.

W ApplicationIO nie masz tego zabezpieczenia, że np. ja ktoś poda rok -100, to zamiast tworzyć obiekt, powinnaś zwrócić null. Jak zwrócisz null,
to w klasie ApplicationController powinnaś mieć ifa, który sprawi, że taki błędny obiekt nie zostanie dodany do bazy.
 */

public class ApplicationIO {

    Scanner user = new Scanner(System.in);


    public Movie getMovieData() {

            System.out.println("Enter name of the Movie:");
            String movieName = user.nextLine();

            System.out.println("Enter name of Director:");
            String director = user.nextLine();

            System.out.println("Enter Production Year:");
            int productionYear = user.nextInt();
            if(productionYear<=0){
                throw new IncorrectDataException();
            }
            user.nextLine();

            System.out.println("Enter type of Movie (Comedy/Scifi/Documentary/Action,/Thriller/Horror): ");
            String genre;
            try{
                 genre = user.nextLine();
            }
            catch(GenreNotExistsException e){
                throw new IncorrectDataException();
            }

            System.out.println("Enter the description:");
            String description = user.nextLine();

            System.out.println("Enter rating (from 0 to 10):");
            double rating = user.nextDouble();
            user.nextLine();
            if (rating < 0 || rating > 10) {
                return null;
            }


            return new Movie(movieName, director, productionYear, Genre.convert(genre), description, rating);
    }


    public Series getSeriesData(){

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

            System.out.println("Enter the type of Tv Series (Comedy/Scifi/Documentary/Action,/Thriller/Horror): ");
            String genre;
            try{
                genre = user.nextLine();
            }
            catch(GenreNotExistsException e){
                throw new IncorrectDataException();
            }

            System.out.println("Enter the description:");
            String description = user.nextLine();

            System.out.println("Enter rating (from 0 to 10):");
            double rating = user.nextDouble();
            user.nextLine();
            if (rating < 0 || rating > 10){
                throw new IncorrectDataException();
            }

            return new Series(seriesName, episodes, seasons, producent, Genre.convert(genre), description, rating);
    }


    public Actor getActorData(){

            System.out.println("Enter first name of Actor:");
            String actorFn = user.nextLine();

            System.out.println("Enter last name of Actor:");
            String actorLn = user.nextLine();

            System.out.println("Enter country of origin of Actor:");
            String actorOrigin = user.nextLine();

            return new Actor(actorFn, actorLn, actorOrigin);
    }

    public int getOption(){
        int opt = user.nextInt();
        user.nextLine();
        return opt;
    }

}
