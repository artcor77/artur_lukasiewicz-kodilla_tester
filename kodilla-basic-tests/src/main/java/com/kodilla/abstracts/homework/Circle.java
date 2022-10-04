package com.kodilla.abstracts.homework;

public class Circle extends Shape{
    static final double PI = 3.1415927;
    private double r;
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void calculateCircuit() {
        System.out.println("Circuit of the circle is: "+2*PI*r);
    }

    @Override
    public void calculateField() {
        System.out.println("Field of the circle is: "+PI*r*r);
    }
}
