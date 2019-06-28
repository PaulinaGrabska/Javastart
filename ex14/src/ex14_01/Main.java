package ex14_01;
/*Napisz program, w którym do listy przechowującej liczby dowolnego typu, wczytasz od użytkownika dowolną ilość liczb dodatnich.
Wprowadzanie liczb powinno się zakończyć, gdy użytkownik poda pierwszą liczbę ujemną (liczba ta NIE powinna być dodana do listy).
Po zakończeniu wczytywania liczb:
wyświetl je w kolejności odwrotnej niż były wprowadzone
oblicz sumę i ją wyświetl w postaci a+b+c+…=x, gdzie a, b, c to liczby wprowadzone przez użytkownika a x to obliczona suma.
Wyświetl i największą i najmniejszą z wprowadzonych liczb */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num;

        System.out.println("Enter number: ");
        while((num=sc.nextInt())>0){
            list.add(num);
            System.out.println("Enter next number: ");

        }

        Operation op = new Operation();
        System.out.println("Max number: " + op.maxNumber(list));
        System.out.println("Min number: " + op.minNumber(list));
        System.out.print("Reversed list : ");
        op.reversedList(list);
        System.out.print("\nSum:  ");
        op.sum(list);

    }


}
