package ex10_1;

public class Vehicle {

    private String name;
    private double capacity;
    private double fuelConsumption;


    public Vehicle(String name, double capacity, double fuelConsumption) {
        this.name = name;
        this.capacity = capacity;
        this.fuelConsumption = fuelConsumption;
    }

    double range(double fuel){
        return fuel/fuelConsumption*100;
    }


    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return  name +
                " - capacity: " + capacity +
                " l , fuelConsumption: " + fuelConsumption + " l/100 km";
    }
}
