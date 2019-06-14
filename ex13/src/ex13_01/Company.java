package ex13_01;

public class Company {


    int averageSalary(Person[] people) {
        int totalSalary = 0;
        for (Person p : people) {
            totalSalary += p.getSalary();
        }
        return totalSalary / people.length;
    }


    int smallestSalary(Person[] people) {
        int smallestSalary = people[0].getSalary();
        for (int i = 0; i < people.length - 1; i++) {
            if (people[i + 1].getSalary() < people[i].getSalary()) {
                smallestSalary = people[i + 1].getSalary();
            }
        }
        return smallestSalary;
    }


    int biggestSalary(Person[] people) {
        int biggestSalary = people[0].getSalary();
        for (int i = 0; i < people.length - 1; i++) {
            if (people[i + 1].getSalary() > people[i].getSalary()) {
                biggestSalary = people[i + 1].getSalary();
            }
        }
        return biggestSalary;
    }


    void countDepartamentEmployees(Person[] people, String department) {
        int i=0;

        for (Person p: people) {
            if(p.getDepartment().equals(department)) {
                i++;
            }
        }
        System.out.println(department + " - " + i);


    }

}




/*        String [] departments;
        int countDepartments=1;
        for (int i = 0; i < people.length-1; i++) {
            if(people[i].getDepartment().equals(people[i+1].getDepartment())){
                countDepartments++;
            }
        }
        departments = new String[countDepartments];
        int [] empInDep = new int[departments.length];

        for (int i = 0; i < people.length; i++) {
            int dep=0;
            if(i==0){
                departments[i]=createDepartment(people[i]);
                dep++;
                empInDep[i]++;
            }else {
                if (!people[i-1].getDepartment().equals(people[i].getDepartment())) {
                    departments[dep]=createDepartment(people[i]);
                    dep++;
                }else{
                    empInDep[dep]++;
                }
            }
        }

//        for (int i = 0; i <empInDep.length ; i++) {
//            people[i].getDepartment().equals(people[i + 1].getDepartment()
//        }

        for (int i = 0; i <departments.length ; i++) {
            System.out.println(departments[i] + " " + empInDep[i] + " employees");
        }

    }

 */