package room;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(27, 33, true, 33, 400);
        Room room2 = new Room(17, 60, false, 110, 500);
        Room room3 = new Room(7, 23, true, 85, 350);

        System.out.println("Current temperature in Room 1 is " + room1.getTemperature() );
        room1.decreaseOne();
        System.out.println("After decreasing the temperature in Room 1 is " + room1.getTemperature() );
        System.out.println("The time of cooling: " + room1.timeOfCooling());

        System.out.println("\nCurrent temperature in Room 2 is " + room2.getTemperature() );
        room2.decreaseOne();
        System.out.println("After decreasing the temperature in Room 2 is " + room2.getTemperature() );
        System.out.println("The time of cooling: " + room2.timeOfCooling());

        System.out.println("\nCurrent temperature in Room 3 is " + room3.getTemperature() );
        room3.decreaseOne();
        System.out.println("After decreasing the temperature in Room 3 is " + room3.getTemperature() );
        System.out.println("The time of cooling: " + room3.timeOfCooling());
    }
}
