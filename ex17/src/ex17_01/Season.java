package ex17_01;
/* Każda wartość powinna przechowywać polską nazwę danej pory roku oraz tablicę z miesiącami, które wchodzą
w skład danej pory roku (załóżmy gru, sty, lut - zima, mar, kwi, maj - wiosna, cze, lip, sie - lato, wrz,
paz, lis - jesień).  */

public enum Season {
    SPRING("wiosna", new String[]{"mar", "kwi", "maj"}),
    SUMMER("lato",new String[]{"cze", "lip", "sie"}),
    AUTUMN("jesien", new String[]{"wrz","paz","lis"}),
    WINTER("zima", new String[]{"gru","sty","lut"});

    private String description;
    private String [] months;

    Season(String description, String[] months) {
        this.description = description;
        this.months = months;
    }

    public String getDescription() {
        return description;
    }

    public String[] getMonths() {
        return months;
    }

    static String [] converter(String des){
        for (Season s:Season.values()) {
            if(des.equals(s.description)){
                return s.months;
            }
        }
        return null;
    }
}
