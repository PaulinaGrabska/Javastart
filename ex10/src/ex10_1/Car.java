package ex10_1;

public class Car extends Vehicle{


    private boolean airConditionIsTurnOn;


    public Car(String name, double capacity, double fuelConsumption, boolean airConditionIsTurnOn) {
        super(name, capacity, fuelConsumption);
        this.airConditionIsTurnOn = airConditionIsTurnOn;
    }


    public boolean isAirConditionIsTurnOn() {
        return airConditionIsTurnOn;
    }



    public void setAirConditionIsTurnOn(boolean airConditionIsTurnOn) {
        this.airConditionIsTurnOn = airConditionIsTurnOn;
        if(airConditionIsTurnOn){
            setFuelConsumption(getFuelConsumption()+0.8);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", aircondition is turned on: " + airConditionIsTurnOn;
    }
}
