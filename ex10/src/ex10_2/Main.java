package ex10_2;

public class Main {

    public static void main(String[] args) {

        int [] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] array2 = new int[10];
        int [] array3 = null;


        System.out.println("Array 1 before:");
        printArray(array1);

        reverseElements(array1, 5);

        System.out.println("\nArray 1 after:");
        printArray(array1);

        // reverse array 2
        System.out.println("\nArray 2 before:");
        printArray(array2);

        reverseElements(array2, 5);

        System.out.println("\nArray 2 after:");
        printArray(array2);


        System.out.println("\nArray 3 before:");
        printArray(array3);

        reverseElements(array3, 5);

        System.out.println("\nArray 3 after:");
        printArray(array3);

    }


    static void reverseElements(int [] array, int number){
        if (array == null) {
            System.out.println("The array is empty");
        }else{
            if(number>array.length){
                System.out.println("The number is bigger that the number of elements in the array.");
            }else {
                int swap=0;
                for (int i = 0; i < number / 2; i++) {
                    swap = array[i];
                    array[i]=array[number - 1 - i];
                    array[number - 1 - i] = swap;
                }
            }
        }
     }


     static void printArray(int [] array){
         if(array!=null) {
             System.out.print("[");
             for (int i = 0; i < array.length; i++) {
                 if (i == array.length - 1) {
                     System.out.print(array[i] + "]");
                 } else {
                     System.out.print(array[i]+ ",");
                 }
             }
         }
     }
}
