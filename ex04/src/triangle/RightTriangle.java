package triangle;

public class RightTriangle {

    public boolean isRigthTriangle(Triangle triangle){
        if(triangle.a>triangle.b && triangle.a > triangle.c) {
            return Math.pow(triangle.c,2) + Math.pow(triangle.b,2) == Math.pow(triangle.a,2);
        }else if(triangle.b>triangle.a && triangle.b > triangle.c) {
            return Math.pow(triangle.c,2) + Math.pow(triangle.a,2) == Math.pow(triangle.b,2);
        } else{
            return Math.pow(triangle.a,2) + Math.pow(triangle.b,2) == Math.pow(triangle.c,2);
        }
    }
}
