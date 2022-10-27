package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Meghan", new Teacher("John")));
        students.add(new Student("Danny", new Teacher(null)));
        students.add(new Student("Liz", new Teacher(null)));
        students.add(new Student("Robert", new Teacher("Mike")));

        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", " + "Teacher: " +
                    student.getTeacher().map(teacher -> teacher.getName()).orElse("<undefined>"));
        }
    }
}
