package line;

public class Main {

    public static void main(String[] args) {

        Line l1 = new Line(new Point(3,5), new Point(6,9));
        Line l2 = new Line(new Point(0,0), new Point(3,4));

        LongerLine l = new LongerLine();
        System.out.println("The length of line1: " + l.lineLength(l1) + " and the line2: " + l.lineLength(l2) + "\n");


        Line longerLine = l.getLonger(l1,l2);


        if(longerLine!=null){
                System.out.println("The longer line -> TOP: " + longerLine.getTop().getX()+"," + longerLine.getTop().getY() + ", BOTTOM: "
                        + longerLine.getBottom().getX()+"," + longerLine.getBottom().getY()
                        + " with length " + l.lineLength(longerLine));
        }else {
            System.out.println("The lines are equal.");
        }

    }

}
