package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }
    @Test
    public void testExponentiation() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;
        int c = -5;
        int e = 0;

        // Uwzględnij liczbę mniejszą, większą od zera i równą zero.
        // Użyj delty.
        
        double exponentiationResult = calculator.exponentiation(a, b);
        assertEquals(25, exponentiationResult);
        double exponentiationResultMinus = calculator.exponentiation(c, b);
        assertEquals(25, exponentiationResultMinus);
        double exponentiationResultZero = calculator.exponentiation(e, b);
        assertEquals(0, exponentiationResultZero);
        double exponentiationResultZeroExp = calculator.exponentiation(b, e);
        assertEquals(1, exponentiationResultZeroExp,0.001);
        double exponentiationResultMinusExp = calculator.exponentiation(b, c);
        assertEquals(0.031, exponentiationResultMinusExp,0.001);
    }
}
