package ex16_01;

import java.util.Scanner;

/*Program powinien wczytać od użytkownika informacje o wynikach kilku zawodników – tak długo aż użytkownik nie wpisze
w konsoli wyrazu STOP.
Po wpisaniu wyrazu STOP program powinien posortować kolekcję według wyników (rosnąco lub malejąco –
zadecyduj samodzielnie). Zapisz do pliku stats.csv posortowane dane w formacie CSV.
Program powinien być napisany w sposób obiektowy, tzn. cały kod programu nie może znajdować się tylko w metodzie main. */
public class Main {
    public static void main(String[] args) {

    Stats.saveToFile("stats.csv", Results.loadResults());
    }
}
