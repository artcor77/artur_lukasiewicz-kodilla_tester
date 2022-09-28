package com.kodilla.intro;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        String firstText = year+" is a leap year";
        String secondText = year+" is not a leap year";

        System.out.println(year);
        System.out.println(firstText);
        System.out.println(secondText);

        if (year%4 == 0 && year%100 !=0 || year%400 == 0) {
            System.out.println(firstText);
        } else {
            System.out.println(secondText);
        }
    }

}