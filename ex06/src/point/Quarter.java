package point;

public class Quarter {


    public String whichQuarter(Point point) {
        if (point.getX() > 0 && point.getY() > 0) {
            return "I";
        } else if (point.getX() > 0 && point.getY() < 0) {
            return "II";
        } else if (point.getX() < 0 && point.getY() < 0) {
            return "III";
        } else if (point.getX() < 0 && point.getY() > 0) {
            return "IV";
        } else if (point.getY() == 0 && point.getX() == 0) {
            return "The point lies in the center of coordinate system";
        } else{
            if (point.getY() == 0) {
                return "the axis X";
            }else{
                return "the axis Y";
            }
        }
    }
}
