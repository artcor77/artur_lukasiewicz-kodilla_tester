package com.kodilla.basic_assertion;

//Wewnątrz utworzonego pakietu dodaj klasę Calculator,
// a w niej dwie metody: jedną dodającą dwie liczby, a drugą odejmującą jedną liczbę od drugiej.
public class Calculator {

    public int sum(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public double exponentiation(int a, int b) {
        return Math.pow(a,b);
    }

}
