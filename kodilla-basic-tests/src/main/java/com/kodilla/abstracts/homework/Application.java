package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.calculateCircuit();
        square.calculateField();

        Circle circle = new Circle(3.5);
        circle.calculateCircuit();
        circle.calculateField();

        RectangularTriangle rectangularTriangle = new RectangularTriangle(4,5);
        rectangularTriangle.calculateCircuit();
        rectangularTriangle.calculateField();
    }
}
