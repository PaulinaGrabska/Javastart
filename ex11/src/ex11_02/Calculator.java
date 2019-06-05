package ex11_02;

public class Calculator {

    public static void main(String[] args) {

        Line2D line = new Line2D(new Point(4,5), new Point(-1,9));
        LineCalc lc = new LineCalc();

        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(2,3);
        Ball ball = new Ball(3);
        Cube cube = new Cube(4);
        ShapeCalculator shCalc = new ShapeCalculator();

        System.out.println("Length of line " + lc.lineLength(line));
        System.out.println("Circle area " + shCalc.circleArea(circle));
        System.out.println("Rectangle area " + shCalc.rectangleArea(rectangle));
        System.out.println("Ball volume " + shCalc.ballVolume(ball));
        System.out.println("Cube volume " + shCalc.cubeVolume(cube));

    }
}
