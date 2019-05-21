package point;

public class Quarter {

    private Point point;

    public Quarter(Point point) {
        this.point = point;
    }

    public Point getPoint() {
        return point;
    }

    public String whichQuarter(){
        if(point.getX()>0&&point.getY()>0){
            return "I";
        }else if(point.getX()>0&&point.getY()<0){
            return "II";
        }else if(point.getX()<0&&point.getY()<0){
            return "III";
        }else if(point.getX()<0&&point.getY()>0) {
            return "IV";
        }else{
            return null;
        }
    }
}
