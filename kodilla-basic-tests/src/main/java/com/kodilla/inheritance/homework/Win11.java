package com.kodilla.inheritance.homework;

public class Win11 extends OperatingSystem {

    public Win11(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("Win11 was turned on");
    }
    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("Win11 was turned off");
    }
}
