package creatingObjects;

public class Main {

    public static void main(String[] args) {

     Desk desk1 = new Desk(20, 100, 120);
     Desk desk2 = new Desk(40,80,150);

        System.out.printf("Dismensions of desk 1 : %dcm x %dcm x %dcm \n",desk1.length, desk1.width, desk1.height);
        System.out.printf("Dismensions of desk 2 : %dcm x %dcm x %dcm \n",desk2.length, desk2.width, desk2.height);

    }
}
