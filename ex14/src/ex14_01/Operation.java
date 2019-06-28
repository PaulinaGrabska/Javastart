package ex14_01;
/*
wyświetl je w kolejności odwrotnej niż były wprowadzone
oblicz sumę i ją wyświetl w postaci a+b+c+…=x, gdzie a, b, c to liczby wprowadzone przez użytkownika a x to obliczona suma.
Wyświetl i największą i najmniejszą z wprowadzonych liczb */


import java.util.List;

public class Operation {


    void reversedList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(list.size() - i - 1) + " ");
        }
    }


    void sum(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            if (list.indexOf(i) == list.size()-1) {
                System.out.print(i + "=");
            }else {
                System.out.print(i + "+");
            }
            sum += i;
        }
        System.out.print(sum);

    }


    int minNumber(List<Integer> list) {
        int min = list.get(0);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) < list.get(i)) {
                min = list.get(i + 1);
            }
        }
        return min;
    }

    int maxNumber(List<Integer> list) {
        int max = list.get(0);

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1) > list.get(i)) {
                max = list.get(i + 1);
            }
        }
        return max;
    }


}


