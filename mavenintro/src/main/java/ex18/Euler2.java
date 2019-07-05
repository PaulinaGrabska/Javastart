package ex18;

public class Euler2 {


    public static void main(String[] args) {

        Euler2 eu =  new Euler2();

        System.out.println(eu.sumFib(4000000));

      //  System.out.println(eu.fib(10));

    }

//    public static int fib(int n){
//        if ((n==1)||(n==2))
//            return 1;
//        else
//            return fib(n-1)+fib(n-2);
//    }


    int sumFib(int limit){
        int n1=0,n2=1,n3=0,i;
        int sum=0;

        if(limit==1){
            return 0;
        }

        while(sum<=limit) {

                if (n3 % 2 == 0) {
                    sum += n3;
                }
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;

        }
        return sum;
    }





}
