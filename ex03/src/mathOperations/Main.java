package mathOperations;

public class Main {

    public static void main(String[] args) {

        Math math = new Math();


        int num1 = 3;
        double num2 = 3.5;

        System.out.println("Method 1: Is " + num1 + " an even number? " + math.isEven(num1));

        System.out.println("\nMethod 2: Is " + num1 + " an odd number? " + math.isOdd(num1));

        System.out.println("\nMethod 3: The field of circle with radius " + num2 + " is " + math.circleField(num2));

        System.out.println("\nMethod 4: The number " + num1 + " to the power of 2 is " + math.power(num1));

    }
}
