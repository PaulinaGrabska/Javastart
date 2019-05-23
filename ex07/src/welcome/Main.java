package welcome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        Welcome welcome = new Welcome();


        for (int i = 0; i < welcome.getNames().length ; i++) {
            System.out.println("Enter " + (i+1) + " name:");
            String name = user.nextLine();
            welcome.addName(name);
        }

        System.out.println("All names in reverse order: ");
        welcome.sayHi();
    }
}
