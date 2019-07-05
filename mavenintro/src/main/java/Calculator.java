public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.euler(1000);
        System.out.println(result);
    }


    public int divide(int a, int b)
    {
        return a/b;
    }

    public int euler(int a){
        int result=0;

        for (int i = 1; i <a ; i++) {
            if(i%3==0 || i%5==0){
                result+=i;
            }
        }
        return result;
    }
}
