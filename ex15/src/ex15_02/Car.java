package ex15_02;
/*
- typ pojazdu (np. motocykl, samochód, samochód ciężarowy)
- marka
- model
- rocznik
- przebieg
- numer VIN (unikalny ciąg liczb i znaków, możesz zmyślić)
 */

public class Car {
    private String type;
    private String brand;
    private int year;
    private int mileage;
    private String VIN;

    public Car(String type, String brand, int year, int mileage, String VIN) {
        this.type = type;
        this.brand = brand;
        this.year = year;
        this.mileage = mileage;
        this.VIN = VIN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return "\ntype:" + type +
                ", brand:" + brand +
                ", year:" + year +
                ", mileage:" + mileage +
                ", VIN:" + VIN;
    }
}
