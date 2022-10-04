package com.kodilla.abstracts.homework;

public class Square extends Shape{
    private double a;
    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateCircuit() {
        return a*4;

    }

    @Override
    public double calculateField() {
        return a*a;
    }
}
