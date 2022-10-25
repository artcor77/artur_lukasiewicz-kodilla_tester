package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    @Test
    public void shouldReturnTeacherName() {

        Teacher teacher = new Teacher("John");

        Student student = new Student("Meghan", teacher);

        assertEquals("John", Application.undefinedTeacher(student));
    }

    @Test
    public void shouldReturnTeacherNullName() {

        Teacher teacher = null;

        Student student = new Student("Meghan", teacher);

        assertEquals("<undefined>", Application.undefinedTeacher(student) );
    }
}
