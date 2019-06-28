package ex15_01;
/*W programie zdefiniuj metodę, która na podstawie nazwy pliku zwróci mapę, w której kluczami będą kody krajów,
natomiast wartościami będą obiekty reprezentujące kraj. Obiekty reprezentujące kraj powinny przechowywać inforamcje o kodzie,
nazwie i ludności danego państwa.
Po wczytaniu danych z pliku do mapy, poproś użytkownika o podanie kodu kraju, dla którego chciałby wyświetlić statystyki
i je mu zaprezentuj.   Przykładowy wydruk programu:
Podaj kod kraju, o którym chcesz zobaczyć informacje:
PL
Polska (PL) ma 38000000 ludności.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        String file = "countries.csv";
        Map<String,Country> countryMap = readFile(file);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a code of country PL/ENG/USA/FRA");
        System.out.println(countryMap.get(sc.nextLine().toString()));


    }


    static Map<String,Country> readFile(String file){
        List<String> list = new ArrayList<>();
        Map<String,Country> countryMap = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line =null;
            while((line=br.readLine())!=null){
                list.add(line);
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        for (String s :list) {
            String [] array =s.split(";");
            countryMap.put(array[0], new Country(array[0],array[1],Integer.valueOf(array[2])));
        }
        return countryMap;
    }




}
