package com.kodilla.collections.adv.maps.homework;

import com.kodilla.collections.adv.maps.complex.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {

    public static void main(String[] args) {

        Map<Principal, School> school = new HashMap<>();

        Principal john = new Principal("John", "Stevenson");
        Principal jessie = new Principal("Jessie", "Pinkman");
        Principal bart = new Principal("Bart", "Simpson");

        School first = new School("First", Arrays.asList(25,26,27,28,29,30));
        School second = new School("Second", Arrays.asList(25,26,27,28));
        School third = new School("Third", Arrays.asList(28,29,30));

        school.put(john, first);
        school.put(jessie, second);
        school.put(bart, third);

        for (Map.Entry<Principal, School> schoolEntry : school.entrySet()) {
            System.out.println("---------------");
            System.out.println("Principal: " + schoolEntry.getKey().getFirstName() + " "
                    + schoolEntry.getKey().getLastName());
            System.out.println("School: " + schoolEntry.getValue().getNameOfSchool());
            System.out.println("Number of students: " + schoolEntry.getValue().getSumOfStudents());
        }
    }
}
