package com.javastart.movieDatabase.controller;
import com.javastart.movieDatabase.controller.exceptions.OptionNotExistsException;
import com.javastart.movieDatabase.db.ApplicationDatabase;
import com.javastart.movieDatabase.db.exceptions.DuplicateException;
import com.javastart.movieDatabase.io.ApplicationIO;
import com.javastart.movieDatabase.io.exceptions.IncorrectDataException;

/*
metoda mainLoop(), w której zdefiniowana będzie pętla z wyborem poszczególnych opcji, interakcja
z użytkownikiem i dodawanie obiektów do obiektu wcześniej utworzonej klasy ApplicationDatabase..

Postaraj się zdefiniować klasę ApplicationController w taki sposób, aby cała logika nie znajdowała się tylko w jednej metodzie.
Zamiast tego tam gdzie to możliwe wydziel mniejsze metody (najlepiej prywatne), które poprawią czytelność kodu.
*/

public class ApplicationController {

    private ApplicationDatabase adb = new ApplicationDatabase();
    private ApplicationIO cdr = new ApplicationIO();


    public void mainLoop() {
        Option.showOptions();
        int opt;

        while ((opt = cdr.getOption()) != 0) {
            try {
                switch (Option.convert(opt)) {
                    case ADD_ACTOR:
                        adb.addActor(cdr.getActorData());
                        break;
                    case ADD_MOVIE:
                        adb.addMovie(cdr.getMovieData());
                        break;
                    case ADD_TVSERIES:
                        adb.addSeries(cdr.getSeriesData());
                        break;
                    case DISPLAY_INFO:
                        whatToDisplay();
                        break;
                    case EXIT:
                        System.out.println("Exit filmueb Application");
                        break;
                    default:
                        System.out.println("You've entered the wrong value of option. Try again.");
                }

            } catch (IncorrectDataException | OptionNotExistsException | DuplicateException e) {
                System.err.println(e.getMessage());
            }finally{
                Option.showOptions();
            }
        }
        System.out.println("Exit filmueb Application");
    }


    private void whatToDisplay(){

        Option.displayOptions();
        int option =cdr.getOption();

            switch (Option.convert(option)) {
                case DISPLAY_ACTORS:
                    adb.displayActors();
                    break;
                case DISPLAY_MOVIES:
                   adb.displayMovies();
                    break;
                case DISPLAY_TVSERIES:
                    adb.displaySeries();
                    break;
                default:
                    System.out.println("You've entered the wrong value of option.");
            }
    }

}
