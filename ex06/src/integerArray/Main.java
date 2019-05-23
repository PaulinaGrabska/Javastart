package integerArray;
import java.util.Scanner;
/*
Napisz program, w którym stworzysz tablice 5 liczb całkowitych, które wczytasz od użytkownika z klawiatury.
Wyświetl sumę powstałą z dodania pierwszej, trzeciej i piątej liczby.
 */
public class Main {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        int number;
        int sum=0;

        int [] numbers = new int [5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter " + (i+1) + " integer number: ");
            number = user.nextInt();
            numbers[i] = number;
            if((i+1)%2!=0){
                sum+=number;
            }
        }
        System.out.println("The sum of 1st 3rd and 5th number is: " + sum);
    }
}
