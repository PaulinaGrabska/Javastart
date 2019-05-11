package figures;

public class Rectangle {

    int a;
    int b;

    public Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }

    double calculateArea(){
        return a*b/2;
    }

    double calculatePerimeter(){
        return 2*a+2*b;
    }
}
