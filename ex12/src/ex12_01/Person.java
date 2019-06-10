package ex12_01;
//Person(firstName, lastName, age, pesel)
public class Person{
    private String firstaName;
    private String lastName;
    private String pesel;
    private int age;

    public Person(String firstaName, String lastName, String pesel, int age) {
        this.firstaName = firstaName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
    }

    public String getFirstaName() {
        return firstaName;
    }

    public void setFirstaName(String firstaName) {
        this.firstaName = firstaName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstaName + " " + lastName + " " + ", pesel:" + pesel + ", age: " + age;
    }
}
