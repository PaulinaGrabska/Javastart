package ex16_01;

public class Result implements Comparable{

    private String name;
    private int result;

    public Result(String name, int result) {
        this.name = name;
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


//    public int compareTo(Result o) {
//        if(this.result>o.result)
//            return 1;
//        else if(this.result==o.result)
//            return 0;
//        else
//            return -1;
//    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
