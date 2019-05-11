package figures;

public class Triangle {

    int a;
    int b;
    int c;
    int h;

    public Triangle(int a, int b, int c, int h){
        this.a=a;
        this.b=b;
        this.c=c;
        this.h=h;
    }

    double calculateArea(){
        return a*h/2;
    }

    double calculatePerimeter(){
        return a+b+c;
    }


}
