package ex09_01;


import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        createAnShowArray();

    }


    static Random r = new Random();

    public static void createAnShowArray(){
        int [] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i]=r.nextInt(11);
        }

        System.out.print(Arrays.toString(array).replace(',',' ').replace('[', ' ').replace(']', ' '));

        int swap;
        for (int i = 0; i < array.length/2; i++) {
            swap = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = swap;
        }
        System.out.print(Arrays.toString(array).replace(',',' ').replace('[', ' ').replace(']', ' '));
    }

}
