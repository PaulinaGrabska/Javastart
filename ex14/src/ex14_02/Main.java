package ex14_02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/*Stwórz plik, w którym zapiszesz co najmniej kilkanaście liczb, wśród których część powinna się powtarzać.
Plik powinien mieć taki format, aby było Ci go wygodnie odczytać w programie.
Następnie napisz program, w którym zliczysz ilość wystąpień poszczególnych liczb i wyświetl je na ekranie.
Wydruk na ekranie powinien być posortowany zgodnie z naturalną kolejnością liczb.  Przykładowo dla pliku, w którym byłyby liczby:

na ekranie powinniśmy zobaczyć:
2 – liczba wystąpień: 2
5 – liczba wystąpień: 1
6 – liczba wystąpień: 1
9 – liczba wystąpień: 2  */
public class Main {

    public static void main(String[] args) {

        String file = "numbers.txt";

        System.out.println("Numbers:");
        List <Integer> list = readNumbers(file);
        System.out.println(list.toString());

        sameNumbers(list);

    }

    static int countRepetition(List <Integer> list, int num){
        int counter=0;
        for (Integer i :list) {
            if(i == num){
                counter++;
            }
        }
        return counter;
    }

    static void sameNumbers(List <Integer> list){
       TreeSet <Integer> set = listToSet(list);
        for (Integer i :set) {
            System.out.println(i + " - appears in the list: " + countRepetition(list,i) + " times");
        }

    }


    static List < Integer> readNumbers(String file){
        List<Integer> list = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line =null;
            while((line=br.readLine())!=null){
                list.add(Integer.valueOf(line));
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        return list;
    }

    static TreeSet<Integer> listToSet(List<Integer> list){
        TreeSet <Integer> set = new TreeSet<>();
        for (Integer i :list) {
            set.add(i);
        }
        return set;
    }
}
