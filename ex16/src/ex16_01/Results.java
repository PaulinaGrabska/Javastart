package ex16_01;

import java.util.*;

public class Results {

    static List<Result> loadResults(){
 //       TreeSet < Integer> set = new TreeSet<>();
        List <Result> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String result=null;
        String name=null;


        do{
            System.out.println("Write name of result. If you want to stop, write \"STOP\"");
            name=sc.nextLine();

            System.out.println("Write value of result. If you want to stop, write \"STOP\"");
            result=sc.nextLine();

            list.add(new Result(name, Integer.valueOf(result)));
        }
        while(!((name.equals("STOP"))||((result.equals("STOP")))));

        Collections.sort(list);
        return list;
    }

}
