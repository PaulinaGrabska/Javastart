package calculator;

/*
Napisz kalkulator, który wykonuje operacje na dwóch liczbach wprowadzonych przez użytkownika.

Jeżeli pierwsza liczba jest większa od drugiej, to oblicz i wyświetl sumę dwóch liczb.
Jeżeli pierwsza liczba jest mniejsza od drugiej, to oblicz i wyświetl iloczyn tych liczb.
Jeżeli liczby są sobie równe, to wyświetl ich kwadrat.
Zadanie zrealizuj w postaci metody przyjmującej odpowiednie parametry i zwracającej wynik.
Przetestuj jej działanie w metodzie wywołując ją z metody main
 */
public class Calculator {

    public int compareNumbers(int a, int b){
        int c;
        if(a>b){
            c = a+b;
        }else if(a<b){
            c=a*b;
        }else{
            c=a*a;
        }
        return c;
    }

}
