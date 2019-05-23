package sumAndEvens;
/*
Napisz program, który wyświetla wszystkie liczby parzyste od 0 do 100 w konsoli a na końcu wyświetla dodatkowo ich sumę.
 */
public class Main {

    public static void main(String[] args) {

        int sum=0;

        for (int i = 0; i <= 100; i++) {
            if(i%2==0 && i!=0) {
                System.out.print(i + " ");
                sum+=i;
            }
        }

        System.out.println("\nSum of even numbers: " + sum);

    }
}
