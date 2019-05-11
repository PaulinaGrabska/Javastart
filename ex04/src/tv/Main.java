package tv;

public class Main {

    public static void main(String[] args) {

        Televisor tv = new Televisor();

        tv.showStatus();

        tv.turnOn();
        tv.showStatus();

        tv.turnOff();
        tv.showStatus();

    }
}
