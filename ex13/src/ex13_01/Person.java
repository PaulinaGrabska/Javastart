package ex13_01;

import java.util.Objects;

public class Person {

    private String fn;
    private String ln;
    private String pesel;
    private String department;
    private int salary;

    public Person(String fn, String ln, String pesel, String department, int salary) {
        this.fn = fn;
        this.ln = ln;
        this.pesel = pesel;
        this.department = department;
        this.salary = salary;
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return salary == person.salary &&
                Objects.equals(fn, person.fn) &&
                Objects.equals(ln, person.ln) &&
                Objects.equals(pesel, person.pesel) &&
                Objects.equals(department, person.department);
    }

}
