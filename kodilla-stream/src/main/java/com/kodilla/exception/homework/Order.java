package com.kodilla.exception.homework;

import java.util.Objects;

public class Order {
    String number;
    public Order(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                '}';
    }
}
