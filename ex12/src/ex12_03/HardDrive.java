package ex12_03;

public class HardDrive extends Part{

    private double capacity; // in GB

    public HardDrive(String model, String producent, String serialNo, double capacity) {
        super(model, producent, serialNo);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacity: " + capacity + " GB";
    }
}
