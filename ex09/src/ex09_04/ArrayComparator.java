package ex09_04;

public class ArrayComparator {

    boolean compare(int [] a, int [] b){
        boolean same=true;

        if(a==null||b==null){
            throw new NullPointerException("One of the table is empty");
        }
        if(a.length!=b.length){
            return false;
        }
        for (int i = 0; i <a.length ; i++) {
            if(!(a[i]==b[i])){
                return false;
            }
        }
        return same;
    }

    boolean compare(int [][] a, int [][] b) {
        boolean same = true;

        if (a == null || b == null) {
            throw new NullPointerException("One of the table is empty");
        }
        if(a.length!=b.length){
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (!(a[i][j] == b[i][j])) {
                    return false;
                }
            }
        }
            return same;
        }
}
