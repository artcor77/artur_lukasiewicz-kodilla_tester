package com.kodilla.abstracts.homework;

public class RectangularTriangle extends Shape {

    private double a,b,c,h;
    public RectangularTriangle(double a,double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void calculateCircuit() {
        System.out.println("Circuit of the triangle is: "+(a+b+c));
    }

    @Override
    public void calculateField() {
        System.out.println("Field of the triangle is: "+(a*b)/2);
    }
}
