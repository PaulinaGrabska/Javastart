package com.javastart.movieDatabase.model;
import java.util.Scanner;

/*
metoda mainLoop(), w której zdefiniowana będzie pętla z wyborem poszczególnych opcji, interakcja
z użytkownikiem i dodawanie obiektów do obiektu wcześniej utworzonej klasy ApplicationDatabase..

Postaraj się zdefiniować klasę ApplicationController w taki sposób, aby cała logika nie znajdowała się tylko w jednej metodzie.
Zamiast tego tam gdzie to możliwe wydziel mniejsze metody (najlepiej prywatne), które poprawią czytelność kodu.
*/

public class ApplicationController {

    Scanner input = new Scanner(System.in);

    ApplicationDatabase adb = new ApplicationDatabase();
    ConsoleDataReader cdr = new ConsoleDataReader();
    Option option = new Option();


    public void mainLoop(){
        option.showOptions();
        int opt;

        while((opt=cdr.getOption())!=0) {
                switch (opt) {
                    case Option.ADD_ACTOR:
                        adb.addActor(cdr.getActorData());
                        break;
                    case Option.ADD_MOVIE:
                        adb.addMovie(cdr.getMovieData());
                        break;
                    case Option.ADD_TVSERIES:
                        adb.addSeries(cdr.getSeriesData());
                        break;
                    case Option.DISPLAY_INFO:
                        whatToDisplay();
                        break;
                    case Option.EXIT:
                        System.out.println("Exit filmueb Application");
                        break;

                    default:
                        System.out.println("You've entered the wrong value of option. Try again.");
                }
                option.showOptions();
            }

            System.out.println("Exit filmueb Application");
        }



    private void whatToDisplay(){

        option.displayOptions();
        int option =cdr.getOption();

            switch (option) {
                case Option.DISPLAY_ACTORS:
                    adb.displayActors();
                    break;
                case Option.DISPLAY_MOVIES:
                   adb.displayMovies();
                    break;
                case Option.DISPLAY_TVSERIES:
                    adb.displaySeries();
                    break;
                default:
                    System.out.println("You've entered the wrong value of option.");
            }
    }

}
