package com.kodilla.basic_assertion;
public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(3.66, 13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a,b);
        boolean correctSubtract = ResultChecker.assertEquals(3.66, -3, subtractResult);
        if (correctSubtract) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b );
        }
        int c = 5;
        int d = 2;
        double exponentiationResult = calculator.exponentiation(c,d);
        boolean correctExponentiation = ResultChecker.assertEquals(3.66, 25, exponentiationResult);
        if (correctExponentiation) {
            System.out.println("Metoda exponentiation działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda exponentiation nie działa poprawnie dla liczb " + c + " i " + d);
        }
    }
}
