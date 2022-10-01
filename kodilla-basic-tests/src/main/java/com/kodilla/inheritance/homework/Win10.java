package com.kodilla.inheritance.homework;

public class Win10 extends OperatingSystem {

    public Win10(int year) {
        super(year);
    }

    public void turnOn() {
        super.turnOn();
        System.out.println("Win10 was turned on");
    }
    public void turnOff() {
        super.turnOff();
        System.out.println("Win10 was turned off");
    }
}
