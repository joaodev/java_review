package br.com.joaodev.exceptions.custom.two;

import br.com.joaodev.exceptions.others.Student;

public class Validate {

    private Validate() {}

    public static void student(Student student) throws EmptyStringException, NumberOutsideRangeException {

        if (student == null) {
            throw new IllegalArgumentException("The student is null!");
        }

        if (student.name == null || student.name.trim().isEmpty()) {
            throw new EmptyStringException("name");
        }

        if (student.grade < 0 || student.grade > 10) {
            throw new NumberOutsideRangeException("grade");
        }
    }
}
