package ex16_01;

import java.util.*;

public class Results {

    static TreeSet<Integer> loadResults(){
        TreeSet < Integer> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        String result;

        System.out.println("Write result of player. If you want to stop, write \"STOP\"");
        while(!(result=sc.nextLine()).equals("STOP")){
            set.add(Integer.valueOf(result));
            System.out.println("Write another result or write \"STOP\"");

        }
        return set;
    }

}
