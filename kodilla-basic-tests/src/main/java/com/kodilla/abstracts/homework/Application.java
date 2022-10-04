package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Circuit of the square is: "+square.calculateCircuit());
        System.out.println("Field of the square is: "+square.calculateField());

        Circle circle = new Circle(3.5);
        System.out.println("Circuit of the circle is: "+circle.calculateCircuit());
        System.out.println("Field of the circle is: "+circle.calculateField());

        RectangularTriangle rectangularTriangle = new RectangularTriangle(4,5);
        System.out.println("Circuit of the trangle is: "+rectangularTriangle.calculateCircuit());
        System.out.println("Field of the triangle is: "+rectangularTriangle.calculateField());
    }
}
