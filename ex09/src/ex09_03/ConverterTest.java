package ex09_03;

public class ConverterTest {

    public static void main(String[] args) {

        for (int i = 1; i < 8 ; i++) {
            System.out.println(i + " dzien tygodnia to " + CalendarConverter.convertDayToString(i));
        }
    }
}
