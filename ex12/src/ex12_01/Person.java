package ex12_01;
//Person(firstName, lastName, age, pesel)
public class Person{
    private String firstName;
    private String lastName;
    private String pesel;
    private int age;

    public Person(String firstName, String lastName, String pesel, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setPesel(pesel);
        setAge(age);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.length()<2||firstName==null){
            throw new NameUndefinedException();
        }else
            this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.length()<2||lastName==null){
            throw new NameUndefinedException();
        }else
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
        if(age<1){
            throw new IncorrectAgeException();
        }else
            this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + ", pesel:" + pesel + ", age: " + age;
    }
}
