package numbers03;
/*
Napisz program, który wyświetli na ekranie liczby z przedziału [0, 3] ze zmianą co 0.1, 
czyli wynik powinien wyglądać tak: 
0, 0.1, 0.2, 0.3, …, 3 
Program napisz w dwóch wersjach z wykorzystaniem pętli while oraz do…while
 */
public class Main {

    public static void main(String[] args) {
/*
        for (double i = 0; i <3 ; i+=0.1) {
            System.out.print(i + ", ");
        }
*/
        double i =0;
        while(i<=3.1){
            System.out.print(i+", ");
            i+=0.1;
        }
        System.out.println();

        double y=0;
        do{
            System.out.print(y+", ");
            y+=0.1;
        }while(y<=3.1);

        System.out.println();
    }
}
