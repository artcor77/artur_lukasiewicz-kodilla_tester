package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private double value;
    private LocalDate date;
    private String userLogin;

    public Order(double value, LocalDate date, String userLogin) {
        this.value = value;
        this.date = date;
        this.userLogin = userLogin;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getUserLogin() {
        return userLogin;
    }

    @Override
    public String toString() {
        return "Order{" +
                "value=" + value +
                ", date=" + date +
                ", userLogin='" + userLogin + '\'' +
                '}';
    }
}
