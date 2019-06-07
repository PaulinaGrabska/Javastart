package ex11_02;

public class Line2D extends Shape2D {

    private Point p1;
    private Point p2;


    public Line2D(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Line designated by the coordinates [" + getP1().getX() + ", " + getP1().getY() + "]["+
                getP2().getX() + ", " + getP2().getY() + "] has the length ";
    }
}
