package ex11_01;

import java.util.Objects;

public class Dog {

    private String name;
    private int age;


    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(name, dog.name);
    }

    @Override
    public String toString() {
        return  name + " " + age + " years old ";
    }
}

