package ex18;

public class Euler6 {

    public static void main(String[] args) {

        Euler6 eu = new Euler6();

        System.out.println(eu.differeceBetweenSquares(10));
        System.out.println(eu.differeceBetweenSquares(8));
        System.out.println(eu.differeceBetweenSquares(5));

    }


    int differeceBetweenSquares(int number){

        int sum=0;
        int square=0;

        for (int i = 1; i <= number; i++) {

            sum+=i;
            square+=i*i;
        }
       return sum*sum - square;

    }


}
