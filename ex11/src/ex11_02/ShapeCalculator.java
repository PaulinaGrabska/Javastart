package ex11_02;

public class ShapeCalculator extends LineCalc implements Calc2D,Calc3D {

    @Override
    public double shapeArea(GeometricShape shape) {
        if (shape instanceof Circle){
            Circle circle = (Circle) shape;
            return circle.getRadius()*circle.getRadius()*Math.PI;
        }else if(shape instanceof Rectangle){
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getSideA()*rectangle.getSideB();
        }
        return 0;
    }

    @Override
    public double volume(Shape3D shape) {
        if (shape instanceof Ball){
            Ball ball = (Ball) shape;
            return 4/3*Math.PI*Math.pow(ball.getRadius(),3);
        }else if(shape instanceof Cube){
            Cube cube= (Cube) shape;
            return Math.pow(cube.getSideA(),3);
        }
        return 0;
    }

    void printInfo(Shape shape){
            System.out.print(shape.toString());
            if(shape instanceof Line2D) {
                Line2D line = (Line2D) shape;
                System.out.print(lineLength(line));
            }else if(shape instanceof GeometricShape) {
                GeometricShape gs = (GeometricShape) shape;
                System.out.print(shapeArea(gs));
            }else if(shape instanceof Shape3D) {
                Shape3D s3D = (Shape3D) shape;
                System.out.print(volume(s3D));
            }
    }
/*
    void printInfo(Shape shape){
        if(shape instanceof Line2D) {
            Line2D line = (Line2D) shape;
            System.out.print("Line designated by the coordinates [" + line.getP1().getX() + ", " + line.getP1().getY() + "]["+
                    line.getP2().getX() + ", " + line.getP2().getY() + "] has the length ");
        }else if(shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.print("Circle with radius " + circle.getRadius() + " has the area ");
        }else if(shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.print("Rectangle with sides " + rectangle.getSideB() + " and " + rectangle.getSideA() + " has the area ");
        }else if(shape instanceof Cube) {
            Cube cube = (Cube) shape;
            System.out.print("Cube with side " + cube.getSideA()+ " has the volume ");
        }else if(shape instanceof Ball) {
            Ball ball = (Ball) shape;
            System.out.print("Ball with radius " + ball.getRadius() + " has the volume ");
        }
    }
*/
}
