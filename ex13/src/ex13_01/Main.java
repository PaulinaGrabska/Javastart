package ex13_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {

        String file = "employees.csv";

        Person [] people = readFile(file);

        Company c = new Company();

        System.out.println("Average salary " + c.averageSalary(people));
        System.out.println("Smallest salary " + c.smallestSalary(people));
        System.out.println("Biggest salary " + c.biggestSalary(people));
        System.out.println("Number of employees in each department:" );
        c.countDepartamentEmployees(people, "it");
        c.countDepartamentEmployees(people, "Support");
        c.countDepartamentEmployees(people, "Management");


    }


    static Person [] readFile(String file){
        int lines = countLines(file);
        Person [] people = new Person[lines];
        int pep=0;
        try(BufferedReader br = new BufferedReader(new FileReader(file));){
            String line =null;
            while((line=br.readLine())!=null){
                String [] p =line.split(";");
                people[pep] = new Person(p[0], p[1],p[2],p[3], Integer.valueOf(p[4]));
                pep++;
            }

        }catch(IOException e){
            e.printStackTrace();
        }
        return people;
    }

    static int countLines(String file){
        int i=0;
        try(FileReader fr = new FileReader(file);
            BufferedReader bfr = new BufferedReader(fr)) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return i;
    }

}
