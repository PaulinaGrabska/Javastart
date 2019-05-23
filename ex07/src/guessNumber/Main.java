package guessNumber;

import java.util.Scanner;

/*
Napisz program, w którym będziesz wczytywać od użytkownika liczby tak długo aż nie poda on liczby z przedziału [100, 200]
podzielnej przez 3, czyli np. 120. program powinien wyświetlać odpowiednie komunikaty informujące o tym dlaczego podana liczba jest zła, np.:
Podaj liczbę
55
Podana liczba jest za mała
Podaj liczbę
110
Liczba nie jest podzielna przez 3
Podaj liczbę
120
Twoja liczba jest ok
 */
public class Main {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);


        System.out.println("Pass the number ");
        int num=user.nextInt();

        while(!(num<=200 && num>=100 && (num%3==0))){

            if (num<100){
                System.out.println("Your number is too small.");
            }else if(num>200){
                System.out.println("Your number is too big.");
            }
            if(num%3!=0){
                System.out.println("Your number is not divisible by 3.");
            }
            System.out.println("Pass the number ");
            num=user.nextInt();
        }

        if(num<=200 && num>=100 && (num%3==0)){
            System.out.println("Your number is correct.");
        }

    }

}
