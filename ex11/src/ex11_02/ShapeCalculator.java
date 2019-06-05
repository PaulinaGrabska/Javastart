package ex11_02;

public class ShapeCalculator extends LineCalc implements Calc2D,Calc3D {

    @Override
    public double circleArea(Circle circle) {
        return circle.getRadius()*circle.getRadius()*Math.PI;
    }

    @Override
    public double rectangleArea(Rectangle rectangle) {
        return rectangle.getSideA()*rectangle.getSideB();
    }

    @Override
    public double ballVolume(Ball ball) {
        return 4/3*Math.PI*Math.pow(ball.getRadius(),3);
    }

    @Override
    public double cubeVolume(Cube cube) {
        return Math.pow(cube.getSideA(),3);
    }
}
