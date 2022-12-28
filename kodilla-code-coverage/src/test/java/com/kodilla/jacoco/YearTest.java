package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YearTest {

    @Test
    void shouldBeLeapYearIfDivisibleBy400() {
        //given
        Year year = new Year(1600);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfDivisibleBy100ButNoBy4() {
        //given
        Year year = new Year(1700);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy4() {
        //given
        Year year = new Year(2016);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }

    @Test
    void shouldBeLeapYearIfDivisibleBy4And100And400() {
        //given
        Year year = new Year(1600);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }

    @Test
    void shouldNotBeLeapYearIfNotDivisibleBy4And100And400() {
        //given
        Year year = new Year(1689);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }
}