package ex09_04;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        ArrayComparator comparator = new ArrayComparator();

        int [] a={1,2,3};
        int [] b={1,2,3};

        int [][] c={{1,2},{3,4}};
        int [][] d={{1,2},{3,5}};

        System.out.println("Array a: " + Arrays.toString(a));
        System.out.println("Array b: " + Arrays.toString(b));
        System.out.println(" Are array []a and []b the same? " + comparator.compare(a,b));

        System.out.println("Array c: " + Arrays.toString(c[0])+ Arrays.toString(c[1]));
        System.out.println("Array d: " + Arrays.toString(d[0])+ Arrays.toString(d[1]));
        System.out.println(" Are array [][]c and [][]d the same? " + comparator.compare(c,d));


    }

}
