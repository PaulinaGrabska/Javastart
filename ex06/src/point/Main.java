package point;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        System.out.println("Enter X: ");
        int x = user.nextInt();
        user.nextLine();

        System.out.println("Enter Y: ");
        int y = user.nextInt();
        user.nextLine();

        Quarter quarter = new Quarter();

        String quart = quarter.whichQuarter(new Point(x,y));

        System.out.println("The point lies in the " + quart + " of the coordinate system.\n");

    }
}
