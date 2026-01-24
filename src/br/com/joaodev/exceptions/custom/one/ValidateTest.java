package br.com.joaodev.exceptions.custom.one;

import br.com.joaodev.exceptions.others.Student;

public class ValidateTest {

    public static void main(String[] args) {

        try {
            Student student = new Student("John", 7);
            Validate.student(student);
            Validate.student(null);
        } catch (EmptyStringException e) {
            System.out.println(e.getMessage());
        } catch (NumberOutsideRangeException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End!");
    }
}
