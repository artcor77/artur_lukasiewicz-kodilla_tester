package com.kodilla.abstracts.homework;

public class Circle extends Shape{

    private double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double calculateCircuit() {
        return 2*Math.PI*r;
    }
    @Override
    public double calculateField() {
        return Math.PI*r*r;
    }
}
