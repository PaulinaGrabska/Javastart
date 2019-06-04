package ex10_1;

public class Truck extends Car{

    private double cargoWeight;

    public Truck(String name, double capacity, double fuelConsumption, double maxFuelConsumption, boolean airConditionIsTurnOn, double cargoWeight) {
        super(name, capacity, fuelConsumption, maxFuelConsumption, airConditionIsTurnOn);
        this.cargoWeight = cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
        if(cargoWeight/100>=1) {
            setFuelConsumption(((int)cargoWeight/100)*0.5+getFuelConsumption());
        }
    }


    @Override
    boolean changeAirCondition(boolean change){
        if(isAirConditionIsTurnOn()!=change) {
            if (change) {
                if (getFuelConsumption() + 1.6 <= getMaxFuelConsumption()) {
                    setFuelConsumption(getFuelConsumption() + 1.6);
                    setAirConditionIsTurnOn(change);
                    return true;
                } else {
                    return false;
                }
            } else {
                setFuelConsumption(getFuelConsumption() - 1.6);
                setAirConditionIsTurnOn(change);
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return super.toString() + ", cargo weight: " + cargoWeight + " kg";
    }

}
