package line;

public class LongerLine {

    public int lineLength(Line line){
        int xLength = Math.abs(line.getTop().getX()-line.getBottom().getX());
        int yLength = Math.abs(line.getTop().getY()-line.getBottom().getY());

        return (int)Math.sqrt((xLength*xLength + yLength*yLength));
    }

    public void getLonger(Line l1, Line l2){
        if(lineLength(l1)>lineLength(l2)){
            System.out.println("The longer line -> TOP: " + l1.getTop().getX()+"," + l1.getTop().getY() + ", BOTTOM: " + l1.getBottom().getX()+"," + l1.getBottom().getY()
            + " with length " + lineLength(l1));
        }else if(lineLength(l1)==lineLength(l2)){
            System.out.println("The lines are equal");
        }else{
            System.out.println("The longer line -> TOP: " + l2.getTop().getX() + "," + l2.getTop().getY() + ", BOTTOM: " + l2.getBottom().getX() + "," + l2.getBottom().getY()+
                    " with length " + lineLength(l2));
        }
    }

}
