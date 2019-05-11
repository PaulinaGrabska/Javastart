package figures;

public class Square {

    int a;

    public Square(int a){
        this.a=a;
    }

    double calculateArea(){
        return a*a;
    }

    double calculatePerimeter(){
        return 4*a;
    }

}
