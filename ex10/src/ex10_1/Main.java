package ex10_1;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Volvo", 55, 20, false);
        Car car2 = new Car("Mercedes", 75, 10, false);
        Truck truck1 = new Truck("WW", 35, 8, false,260);
        Truck truck2 = new Truck("WW", 35, 8, false,0);
        Truck truck3 = new Truck("WW", 35, 8, false,100);

        Car[] cars = {car1, car2, truck1, truck2, truck3};

        // we will check how far each vahicle can drive with 250 liters of fuel
        double fuel = 50;

        System.out.println("All cars:");
        for (Car c: cars) {
            System.out.println(c.toString() + ", with " + fuel + " l vehicle can drive " +  c.range(fuel) + " km");
        }

        for (Car c: cars) {
            c.setAirConditionIsTurnOn(true);
        }


        System.out.println("\nAll cars with turned on air condition:");
        for (Car c: cars) {
            System.out.println(c.toString()+ ", with " + fuel + " l vehicle can drive " +  c.range(fuel) + " km");
        }

    }
}
