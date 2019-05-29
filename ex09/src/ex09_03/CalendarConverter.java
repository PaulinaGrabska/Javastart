package ex09_03;

public class CalendarConverter {

    static final int MONDAY = 1;
    static final int THUESDAY = 2;
    static final int WEDNESDAY = 3;
    static final int THURSDAY = 4;
    static final int FRIDAY = 5;
    static final int SATURDAY = 6;
    static final int SUNDAY = 7;


    static String convertDayToString(int dayNumber){
        switch(dayNumber){
            case MONDAY:
                return "Poniedzialek";
            case THUESDAY:
                return "Wtorek";
            case WEDNESDAY:
                return "Sroda";
            case THURSDAY:
                return "Czwartek";
            case FRIDAY:
                return "Piatek";
            case SATURDAY:
                return "Sobota";
            case SUNDAY:
                return "Niedziela";
            default:
                return "Wpisales zly numer tygodnia";
        }
    }

}
