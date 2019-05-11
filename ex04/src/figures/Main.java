package figures;

public class Main {

    public static void main(String[] args) {


        Circle cir = new Circle(3);
        System.out.println("Circle area: "+ cir.calculateArea());

        Square sq = new Square(2);
        System.out.println("Square area: " + sq.calculateArea());

        Triangle tr = new Triangle(3,4,5, 6);
        System.out.println("Triangle perimeter: "+ tr.calculatePerimeter());

        Rectangle rec = new Rectangle(5,7);
        System.out.println("Rectangle perimeter: "+ rec.calculatePerimeter());

    }
}
