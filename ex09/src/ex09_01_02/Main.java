package ex09_01_02;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        createAnShowArray();
    }

    static Random r = new Random();

    public static void createAnShowArray(){
        int [] array = new int [20];
        for (int i = 0; i < array.length; i++) {
            if(i<10) {
                array[i] = r.nextInt(11);
            }else{
                array[i] = array[array.length - i - 1];
            }
            System.out.print(array[i] + " ");
        }

    }

}
