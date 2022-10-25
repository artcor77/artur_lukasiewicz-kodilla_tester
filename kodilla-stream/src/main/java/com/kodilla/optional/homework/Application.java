package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Meghan", new Teacher("John")));
        students.add(new Student("Danny", null));
        students.add(new Student("Liz", null));
        students.add(new Student("Robert", new Teacher("Mike")));

        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", " + "Teacher: " + undefinedTeacher(student));
        }
    }

    public static String undefinedTeacher(Student student) {

        Teacher undefinedTeacher = new Teacher("<undefined>");
        String teacher = Optional.ofNullable(student.getTeacher()).orElse(undefinedTeacher).getName();

        return teacher;
    }
}
