package line;

public class Main {

    public static void main(String[] args) {

        Line l1 = new Line(new Point(3,5), new Point(1,1));
        Line l2 = new Line(new Point(0,0), new Point(3,4));

        LongerLine l = new LongerLine();
        System.out.println("The length of line 1: " + l.lineLength(l1) + " and the line 2: " + l.lineLength(l2) + "\n");
        l.getLonger(l1,l2);

    }

}
