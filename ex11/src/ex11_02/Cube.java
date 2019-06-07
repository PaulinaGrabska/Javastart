package ex11_02;

public class Cube extends Shape3D {

    private double sideA;

    public Cube(double sideA) {
        this.sideA = sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public String toString() {
        return "Cube with side " + getSideA()+ " has the volume ";
    }
}
