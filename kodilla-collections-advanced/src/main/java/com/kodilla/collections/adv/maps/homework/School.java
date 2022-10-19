package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {

    private String nameOfSchool;
    private List<Integer> students = new ArrayList<>();

    public School(String nameOfSchool, List<Integer> students) {
        this.nameOfSchool = nameOfSchool;
        this.students = students;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public List<Integer> getStudents() {
        return students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(nameOfSchool, school.nameOfSchool) && Objects.equals(students, school.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSchool, students);
    }

    @Override
    public String toString() {
        return "School{" +
                "nameOfSchool='" + nameOfSchool + '\'' +
                ", students=" + students +
                '}';
    }

    public int getSumOfStudents() {
        int sum = 0;
        for (int students : students) {
            sum += students;
        }
        return sum;
    }
}
