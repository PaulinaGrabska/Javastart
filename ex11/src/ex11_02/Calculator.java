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

        Shape [] shapes = {line, circle, rectangle, ball, cube};

        for (Shape s: shapes) {
            shCalc.printInfo(s);
            if (s instanceof Line2D) {
                System.out.println(lc.lineLength((Line2D) s));
            } else if (s instanceof GeometricShape) {
                System.out.println(shCalc.shapeArea((GeometricShape) s));
            } else if (s instanceof Shape3D) {
                System.out.println(shCalc.volume((Shape3D) s));
            }
        }


/*
        System.out.println("Length of line " + lc.lineLength(line));
        System.out.println("Circle area " + shCalc.shapeArea(circle));
        System.out.println("Rectangle area " + shCalc.shapeArea(rectangle));
        System.out.println("Ball volume " + shCalc.volume(ball));
        System.out.println("Cube volume " + shCalc.volume(cube));
*/
    }
}
