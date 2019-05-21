package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        Scanner user = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int a = user.nextInt();
        user.nextLine();

        System.out.println("Enter 2nd number:");
        int b = user.nextInt();
        user.nextLine();

        System.out.println(calc.compareNumbers(a,b));
    }
}
