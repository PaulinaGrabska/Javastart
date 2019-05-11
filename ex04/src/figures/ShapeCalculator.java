package figures;

public class ShapeCalculator {

    double squareArea(Square square){
        return square.a*square.a;
    }
    double circleArea(Circle cirle){
        return cirle.r*cirle.r*Math.PI;
    }
    double trianglePerimeter(Triangle triangle){
        return triangle.a+triangle.b + triangle.c;
    }
    double rectPerimeter(Rectangle rectangle){
        return 2*rectangle.a + 2*rectangle.b;
    }

}
