package com.kodilla.jacoco;

public class Year {

    private int leapYear;

    public Year(int leapYear) {
        this.leapYear = leapYear;
    }

    public boolean isLeap() {
        if (leapYear % 4 == 0) {
            if (leapYear % 100 == 0) {
                if (leapYear % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
