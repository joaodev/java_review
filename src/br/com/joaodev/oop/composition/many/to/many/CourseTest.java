package br.com.joaodev.oop.composition.many.to.many;

public class CourseTest {

    public static void main(String[] args) {

        Student student1 = new Student("John");
        Student student2 = new Student("Jane");
        Student student3 = new Student("Peter");

        Course course1 = new Course("Java");
        Course course2 = new Course("Python");
        Course course3 = new Course("C#");

        course1.addStudent(student1);
        course1.addStudent(student2);

        course2.addStudent(student1);
        course2.addStudent(student3);

        student1.addCourse(course3);
        student2.addCourse(course3);
        student3.addCourse(course3);

        for (Student student : course1.students) {
            System.out.println("Hello " + student.name + "!");
            System.out.println("You are enrolled in Course 1!");
        }

        System.out.println(student1.courses.get(0).students);

        Course locatedCourse = student1.getCourseByName("Java");
        if (locatedCourse != null) {
            System.out.println("Located course: " + locatedCourse.name);
            System.out.println("Course students: " + locatedCourse.students);
        }
    }
}
