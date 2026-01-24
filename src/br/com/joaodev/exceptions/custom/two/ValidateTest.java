package br.com.joaodev.exceptions.custom.two;

import br.com.joaodev.exceptions.others.Student;

public class ValidateTest {

    public static void main(String[] args) {

        try {
            Student student = new Student("John", 7);
            Validate.student(student);
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        } catch (NumberOutsideRangeException e) {
            System.out.println(e.getMessage());
        }

        try {
            Validate.student(null);
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        } catch (NumberOutsideRangeException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End!");
    }
}
