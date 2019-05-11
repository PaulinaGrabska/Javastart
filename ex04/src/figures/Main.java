package figures;

public class Main {

    public static void main(String[] args) {

        ShapeCalculator calc = new ShapeCalculator();

        System.out.println("Circle area: "+ calc.circleArea(new Circle(3)));

        System.out.println("Square area: " + calc.squareArea(new Square(2)));

        System.out.println("Triangle perimeter: "+ calc.trianglePerimeter(new Triangle(3,4,5)));

        System.out.println("Rectangle perimeter: "+ calc.rectPerimeter(new Rectangle(5,7)));

    }
}
