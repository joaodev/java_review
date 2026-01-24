package br.com.joaodev.oop.encapsulation;

public class PersonTest {

    public static void main(String[] args) {

        Person person = new Person("John", "Doe", 32);
        person.setAge(33);
        System.out.println(person.getAge());
        System.out.println(person);
    }
}
