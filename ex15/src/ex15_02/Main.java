package ex15_02;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

       InspectionStation is = new InspectionStation();

        is.getCars().add(new Car("Opel", "Meriva", 2010, 11000, "222"));
        is.getCars().add(new Car("Opel", "Astra", 2000, 32000, "456"));
        is.getCars().add(new Car("Volswagen", "Golf", 1997, 500, "455"));


        int option;

        System.out.println(is.toString());
        showOptions();

        while((option=sc.nextInt())!=0) {
            switch (option) {
                case 1:
                    is.addToQueue(createCar());
                    System.out.println(is.toString());
                    break;
                case 2:
                    is.getCars().poll();
                    System.out.println(is.toString());
            }
            showOptions();
        }
           System.out.println("End of inspection");
    }


    static Car createCar(){
        System.out.println("Enter type: ");
        String type = sc.nextLine();
        System.out.println("Enter brand: ");
        String brand = sc.nextLine();
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        System.out.println("Enter mileage: ");
        int mileage = sc.nextInt();
        System.out.println("Enter VIN: ");
        String vin = sc.nextLine();

        return new Car(type,brand,year,mileage,vin);
    }


    static void showOptions(){
        System.out.println("Choose option: \n 0 - end of car inpection \n " +
                "1 - add new Car for inpection \n 2 - load next car to inspect");
    }


}
