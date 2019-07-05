package ex18;

public class Tax {


    public static void main(String[] args) {

        Tax tax = new Tax();

    }


    int countTax(int income){
        if(income<=85528){
               return (int) (0.18*(income-556.02));
        }else{
            return (int)(14839.02+(0.32*(income-85528)));
        }
    }

}
