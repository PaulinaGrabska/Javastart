package ex09_02;

public class MathOperation {


    public static int sum(int a){
        int sum=0;
        while(a/10>0){
            sum+=a%10;
            a/=10;
        }
        return sum + a%10;
    }

}
