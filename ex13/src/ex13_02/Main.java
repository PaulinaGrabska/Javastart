package ex13_02;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 1};

        count(numbers);

    }

    static void count(int[] tab){
        Random rand = new Random();
        int N = rand.nextInt((tab.length / 2 - 1)) + 1;
        System.out.println("N is: " + N);
        int[] sum = new int[N];

        int parts = tab.length / N;
        int rest = tab.length % N;
        int rest2=0;
        int elements = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < parts; j++) {
                sum[i] += tab[elements];
                elements++;
                if(rest2==i&&rest2<rest){
                    sum[i]+=tab[elements];
                    elements++;
                    rest2++;
                }
            }

        }

//        for (int i = 0; i < rest; i++) {
//            sum[i]
//        }
        System.out.print("[");
        for (int s:sum) {
            System.out.print(s+ " ");
        }
        System.out.println("]");
    }

}