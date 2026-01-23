package oop.encapsulation;

public class Person {

    private String name;
    private String lastName;
    private int age;

    Person(String name, String lastName, int age) {
        setName(name);
        setLastName(lastName);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        age = Math.abs(age);
        if (age > 0 && age <= 120) {
            this.age = age;
        }
    }

    public String getFullName() {
        return this.getName() + " " + this.getLastName();
    }

    @Override
    public String toString() {
        return "Hello, my name is " + getFullName()
                + " and my age is: " + getAge();
    }
}
