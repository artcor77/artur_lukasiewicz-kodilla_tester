package com.kodilla.inheritance.homework;

public class ApplicationSystem {
    public static void main(String[] args) {

        Win10 win10 = new Win10(2015);
        win10.yearOfRelease();
        win10.turnOn();

        Win11 win11 = new Win11(2021);
        win11.yearOfRelease();
        win11.turnOff();

    }
}
