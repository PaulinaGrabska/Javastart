package ex11_01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int noDogs=0;
        Dog [] dogs = new Dog [3];
        boolean sameDog=false;

        Scanner sc = new Scanner(System.in);

        //{new Dog("Latka", 15), new Dog("Ciapek", 5), new Dog("Azor", 7)};

        while(noDogs<dogs.length) {
            sameDog=false;
            System.out.println("Enter name of dog: ");
            String name = sc.nextLine();

            System.out.println("Enter age of dog: ");
            int age = sc.nextInt();
            sc.nextLine();

            Dog newDog = new Dog(name, age);
            if(noDogs>0) {
                for (int i = 0; i <noDogs ; i++) {
                    if (dogs[i].equals(newDog)) {
                        System.out.println("This dog already exist in table. Try again");
                        sameDog = true;
                    }
                }
            }
            if (!sameDog) {
                dogs[noDogs] = newDog;
                noDogs++;
            }
        }

        if(noDogs>=dogs.length){
            System.out.println("Your table with dogs is full.\n All dogs:");
            System.out.println(Arrays.toString(dogs));
        }

    }
}
