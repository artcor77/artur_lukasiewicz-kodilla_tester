package com.kodilla.abstracts.homework;

public class Square extends Shape{
    private double a;
    public Square(double a) {
        this.a = a;
    }

    @Override
    public void calculateCircuit() {
        System.out.println("Circuit of the square is: "+a*4);
    }

    @Override
    public void calculateField() {
        System.out.println("Field of the square is: "+a*a);
    }
}
