package figures;

public class Circle {

    int r;

    public Circle(int r){
        this.r=r;
    }

    double calculateArea(){
        return 2*r*Math.PI;
    }

    double calculatePerimeter(){
        return Math.PI*r*r;
    }
}
