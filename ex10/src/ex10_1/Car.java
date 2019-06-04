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
    }

    void changeAirCondition(boolean change){
        setAirConditionIsTurnOn(change);
        if(airConditionIsTurnOn==true){
            setFuelConsumption(getFuelConsumption()+0.8);
        }else{
            setFuelConsumption(getFuelConsumption()-0.8);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", air condition is turned on: " + airConditionIsTurnOn;
    }
}
