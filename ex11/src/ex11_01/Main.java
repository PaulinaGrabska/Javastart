package ex11_01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int noDogs = 0;
        Dog[] dogs = new Dog[3];

        while (noDogs < dogs.length) {
            Dog newDog = createDog();
            if (!inTable(dogs, newDog)) {
                addDog(dogs, newDog, noDogs);
                noDogs++;
            } else {
                System.out.println("This dog already exist in table. Try again");
            }
        }

        if (noDogs >= dogs.length) {
            System.out.println("Your table with dogs is full.\n All dogs:");
            System.out.println(Arrays.toString(dogs));
        }
    }


    static boolean inTable(Dog [] dogs, Dog dog){
        for (int i = 0; i <dogs.length ; i++) {
            if (dogs[i]!=null&&dogs[i].equals(dog)) {
                return true;
            }
        }return false;
    }

    static Dog createDog(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of dog: ");
        String name = sc.nextLine();

        System.out.println("Enter age of dog: ");
        int age = sc.nextInt();
        sc.nextLine();

       return new Dog(name, age);
    }

    static void addDog(Dog [] dogs,Dog dog, int noDogs){
        dogs[noDogs] = dog;
    }


}
