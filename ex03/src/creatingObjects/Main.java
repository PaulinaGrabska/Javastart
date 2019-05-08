package creatingObjects;

public class Main {

    public static void main(String[] args) {

     Desk desk1 = new Desk();
     Desk desk2 = new Desk();

     desk1.length = 20;
     desk1.height = 100;
     desk1.width = 120;

     desk2.length = 40;
     desk2.height = 80;
     desk2.width = 150;

        System.out.printf("Dismensions of desk 1 : %dcm x %dcm x %dcm \n",desk1.length, desk1.width, desk1.height);
        System.out.printf("Dismensions of desk 2 : %dcm x %dcm x %dcm \n",desk2.length, desk2.width, desk2.height);

    }

}
