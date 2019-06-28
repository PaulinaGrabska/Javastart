package ex15_02;
/* - po wciśnięciu 0 program powinien zakończyć swoje działanie,
- po wciśnięciu 1 program powinien wczytać informacje o nowym pojeździe i pojazd ten powinien zostać dodany do kolejki,
- po wciśnięciu 2 z kolejki powinien zostać pobrany kolejny pojazd, który zostanie poddany przeglądowi. */

import java.util.LinkedList;

public class InspectionStation {

    private LinkedList <Car> cars;

    public InspectionStation() {
        cars=new LinkedList<>();
    }

    public LinkedList<Car> getCars() {
        return cars;
    }

    public void setCars(LinkedList<Car> cars) {
        this.cars = cars;
    }


    void addToQueue(Car car){
        cars.add(car);
    }

    @Override
    public String toString() {
        return "InspectionStation : " + cars;
    }
}
