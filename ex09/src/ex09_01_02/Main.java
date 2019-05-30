package ex09_01_02;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        createAnShowArray();
    }

    static Random r = new Random();

    public static void createAnShowArray(){
        int [] array = new int [10];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(11);
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[array.length - i - 1] + " ");
        }

    }

}
