package ex10_1;

public class Car extends Vehicle{


    private boolean airConditionIsTurnOn;


    public Car(String name, double capacity, double fuelConsumption, double maxFuelConsumption, boolean airConditionIsTurnOn) {
        super(name, capacity, fuelConsumption, maxFuelConsumption);
        this.airConditionIsTurnOn = airConditionIsTurnOn;
    }

    public boolean isAirConditionIsTurnOn() {
        return airConditionIsTurnOn;
    }



    public void setAirConditionIsTurnOn(boolean airConditionIsTurnOn) {
        this.airConditionIsTurnOn = airConditionIsTurnOn;
    }

    boolean changeAirCondition(boolean change){
        if(airConditionIsTurnOn!=change) {
            if (change){
                if (getFuelConsumption() + 0.8 <= getMaxFuelConsumption()) {
                    setFuelConsumption(getFuelConsumption() + 0.8);
                    setAirConditionIsTurnOn(change);
                    return true;
                } else {
                    return false;
                }
            }else{
                setFuelConsumption(getFuelConsumption() - 0.8);
                setAirConditionIsTurnOn(change);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String aircond= "OFF";
        if(airConditionIsTurnOn){
            aircond= "ON";
        }
        return super.toString() + ", air condition is turned " + aircond;
    }
}
