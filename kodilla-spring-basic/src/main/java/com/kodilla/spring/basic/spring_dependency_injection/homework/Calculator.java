package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    private Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double sum = a + b;
        display.display(sum);
        return sum;
    }

    public double subtract(double a, double b) {
        double sub = a - b;
        display.display(sub);
        return sub;
    }

    public double multiply(double a, double b) {
        double mul = a * b;
        display.display(mul);
        return mul;
    }

    public double divide(double a, double b) {
        double div = a / b;
        display.display(div);
        return div;
    }
}
