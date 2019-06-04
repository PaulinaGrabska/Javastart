package ex10_1;

public class Vehicle {

    private String name;
    private double capacity;
    private double fuelConsumption;
    private double maxFuelConsumption;


    public Vehicle(String name, double capacity, double fuelConsumption, double maxFuelConsumption) {
        this.name = name;
        this.capacity = capacity;
        this.fuelConsumption = fuelConsumption;
        this.maxFuelConsumption = maxFuelConsumption;
    }

    double range(double fuel){
        return fuel/fuelConsumption*100;
    }


    public double getMaxFuelConsumption() {
        return maxFuelConsumption;
    }

    public void setMaxFuelConsumption(double maxFuelConsumption) {
        this.maxFuelConsumption = maxFuelConsumption;
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
                " l , fuel consumption: " + fuelConsumption + " l/100 km, " + "Max fuel cons. " + maxFuelConsumption + " l/100 km";
    }
}
