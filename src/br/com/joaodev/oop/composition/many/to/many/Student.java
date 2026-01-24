package br.com.joaodev.oop.composition.many.to.many;

import java.util.ArrayList;
import java.util.List;

public class Student {

    final String name;
    final List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    Course getCourseByName(String courseName) {
        for (Course course : this.courses) {
            if (course.name.equalsIgnoreCase(courseName)) {
                return course;
            }
        }

        return null;
    }

    void addCourse(Course course) {
        this.courses.add(course);
        course.addStudent(this);
    }
}
