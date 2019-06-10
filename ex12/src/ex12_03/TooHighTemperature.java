package ex12_03;

public class TooHighTemperature extends RuntimeException {
    public TooHighTemperature() {
        super("You can't increase timing because the temperature will be too high");
    }
}
