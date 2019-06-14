package ex12_01;
/*wczytaj od użytkownika dane o jednej osobie, utwórz obiekt tego typu i wyświetl informacje o tej osobie na ekranie. */

import java.util.Scanner;

public class PersonCreation {

    Scanner sc = new Scanner(System.in);

    void createPerson(){
        System.out.println("Enter first name: ");
        String fn;
        if((fn= sc.nextLine()).length()<2||fn==null){
            throw new NameUndefinedException();
        }

        System.out.println("Enter last name: ");
        String ln = sc.nextLine();

        if((ln.length()<2||ln==null)){
            throw new NameUndefinedException();
        }
        System.out.println("Enter pesel: ");
        String pesel = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();
        if(age<1){
            throw new IncorrectAgeException();
        }

        Person person = new Person(fn, ln,pesel,age);

        System.out.println(person);


    }

}
