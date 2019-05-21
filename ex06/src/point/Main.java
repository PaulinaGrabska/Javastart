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

        Quarter quarter = new Quarter(new Point(x,y));

        String quart = quarter.whichQuarter();

        if(quart!=null) {
            System.out.println("The point lies in the " + quart + " quarter of the coordinate system.\n");
        }else{
            System.out.println("One of the coordinates of the point lies on at least one of the axes.\n");
        }


    }
}
