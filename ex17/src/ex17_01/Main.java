package ex17_01;
/*Wczytaj od użytkownika nazwę pory roku (po polsku). Na podstawie tej nazwy
pobierz odpowiadającą jej wartość typu Season, a na końcu wyświetl miesiące wchodzące w skład danej pory roku.  */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj pore roku");

        String s = sc.nextLine();

        System.out.println("Miesiace wchodzace w pore roku " + s + ":");

        for (String m:Season.converter(s)) {
            System.out.print(m + " ");
        }

    }
}
