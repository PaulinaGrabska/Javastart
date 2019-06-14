package ex13_02;

public class Main {


    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 1};
        int n = 3;
        System.out.println("N is: " + n);

        try {
            System.out.print("[");
            for ( int i :sumArray(numbers, n)) {
                System.out.print(i + " ");
            }
            System.out.println("]");
        } catch (ArrayIndexOutOfBoundsException | NumberOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    static int[] sumArray(int[] tab, int n) {
        int[] sum;
        if (n > tab.length) {
            throw new ArrayIndexOutOfBoundsException("Array has only " + tab.length + " elements, " + tab.length + " < " + n);
        }

        if (n <1 || n > tab.length/2) {
            throw new NumberOutOfBoundsException();
        } else {
            sum = new int[n];
            int parts = tab.length / n;
            int rest = tab.length % n;
            int rest2 = 0;
            int elements = 0;
            for (int i = 0; i < n; i++) {
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
        }
        return sum;

    }
}