package ex12_01;

public class Main {

    public static void main(String[] args) {
        PersonCreation pc = new PersonCreation();

        try {
            pc.createPerson();
        }catch(NameUndefinedException|IncorrectAgeException e){
            System.out.println(e.getMessage());
        }

    }
}
