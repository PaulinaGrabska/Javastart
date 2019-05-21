package names;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        String name;
        String [] names = new String [3];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter " + (i+1) + " name: ");
            name = user.nextLine();
            names[i] = name;
        }


        System.out.println("All names in the array: ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }

    }

}
