package ex13_02;

public class NumberOutOfBoundsException extends RuntimeException {

    public NumberOutOfBoundsException() {
        super("N should be <= 1 and >= array.length/2 ");
    }
}
