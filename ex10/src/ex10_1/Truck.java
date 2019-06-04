package ex10_1;

public class Truck extends Car{

    private double cargoWeight;

    public Truck(String name, double capacity, double fuelConsumption, boolean airConditionIsTurnOn, double cargoWeight) {
        super(name, capacity, fuelConsumption, airConditionIsTurnOn);
        setCargoWeight(cargoWeight);
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
        if(cargoWeight/100>=1) {
            setFuelConsumption(((int)cargoWeight/100)*0.5+getFuelConsumption());
        }
    }


    @Override
    void changeAirCondition(boolean change){
        setAirConditionIsTurnOn(change);
        if(isAirConditionIsTurnOn()==true){
            setFuelConsumption(getFuelConsumption()+1.6);
        }else{
            setFuelConsumption(getFuelConsumption()-1.6);
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", cargo weight: " + cargoWeight + " kg";
    }

}
