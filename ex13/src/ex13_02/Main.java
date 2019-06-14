package ex13_02;

public class Main {


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 1};
        int N = 7;
        System.out.println("N is: " + N);

        try {
            count(numbers, N);
        } catch (ArrayIndexOutOfBoundsException | NumberOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void count(int[] tab, int N) {

        if (N > tab.length) {
            throw new ArrayIndexOutOfBoundsException("Array has only " + tab.length + " elements, " + tab.length + " < " + N);
        }

        if (N <1 || N > tab.length/2) {
            throw new NumberOutOfBoundsException();
        } else {
            int[] sum = new int[N];
            int parts = tab.length / N;
            int rest = tab.length % N;
            int rest2 = 0;
            int elements = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < parts; j++) {
                    sum[i] += tab[elements];
                    elements++;
                    if (rest2 == i && rest2 < rest) {
                        sum[i] += tab[elements];
                        elements++;
                        rest2++;
                    }
                }
            }

            System.out.print("[");
            for (int s : sum) {
                System.out.print(s + " ");
            }
            System.out.println("]");
        }


    }
}