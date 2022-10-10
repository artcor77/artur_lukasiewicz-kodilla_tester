package com.kodilla.school;

import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;

public class GradesTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        Grades grades = new Grades();
        int[] values = grades.getValues();
        assertEquals(3.66, 0, values.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);

        int[] values = grades.getValues();
        assertEquals(3.66, 2, values.length);
        assertEquals(3.66, 4, values.length);
        assertEquals(3.66, 2, values.length);
    }
    @Test
    public void shouldCalculateAverage() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.001);
    }
    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        Grades grades = new Grades();
        assertEquals(0, grades.getAverage(), 0.001);
    }
}
