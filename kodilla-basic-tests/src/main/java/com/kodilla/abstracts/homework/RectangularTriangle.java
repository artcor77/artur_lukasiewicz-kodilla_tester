package com.kodilla.abstracts.homework;

public class RectangularTriangle extends Shape {

    private double a,b,c,h;
    public RectangularTriangle(double a,double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculateCircuit() {
        return a+b+c;
    }

    @Override
    public double calculateField() {
        return (a*b)/2;
    }
}
