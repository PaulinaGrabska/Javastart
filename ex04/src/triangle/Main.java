package triangle;

public class Main {

    public static void main(String[] args) {

        RightTriangle rt = new RightTriangle();

        System.out.println("Is it right triangle? " + rt.isRigthTriangle(new Triangle(3,4,5)));
    }
}
