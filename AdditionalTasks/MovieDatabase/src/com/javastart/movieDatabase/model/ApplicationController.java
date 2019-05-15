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


    public void mainLoop(){
        showOptions();
        int opt;

        while((opt=cdr.getOption())!=0) {
                switch (opt) {
                    case 1:
                        adb.addActor(cdr.getActorData());
                        break;
                    case 2:
                        adb.addMovie(cdr.getMovieData());
                        break;
                    case 3:
                        adb.addSeries(cdr.getSeriesData());
                        break;
                    case 4:
                        displayOptions();
                        break;
                    case 0:
                        System.out.println("Exit filmueb Application");
                        break;

                    default:
                        System.out.println("You've entered the wrong value of option. Try again.");
                }
                showOptions();
            }

            System.out.println("Exit filmueb Application");
        }



    private void displayOptions(){
        System.out.println("Choose what you want to see:" +
                "\n\t 1 - you want to see all actors" +
                "\n\t 2 - you want to see all movies" +
                "\n\t 3 - you want to see all tv tvseries\n");

        int option =cdr.getOption();

            switch (option) {
                case 1:
                    adb.displayActors();
                    break;
                case 2:
                   adb.displayMovies();
                    break;
                case 3:
                    adb.displaySeries();
                    break;
                default:
                    System.out.println("You've entered the wrong value of option.");
            }
    }

    //print all available option for user
    private void showOptions(){
        System.out.println("Available options:");
        System.out.println("0 -Exit Program");
        System.out.println("1 - Add Actor");
        System.out.println("2 - Add Movie");
        System.out.println("3 - Add Tv Series");
        System.out.println("4 - Display all information");
        System.out.println("Choose one of the opton:");
    }


}
