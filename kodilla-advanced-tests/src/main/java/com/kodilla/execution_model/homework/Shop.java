package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Shop {
    private Set<Order> orders = new HashSet<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Set<Order> getOrderByDateRange(LocalDate fromDate, LocalDate toDate) {
        return orders
                .stream()
                .filter(order -> order.getDate().isAfter(fromDate))
                .filter(order -> order.getDate().isBefore(toDate))
                .collect(Collectors.toSet());
    }

    public Set<Order> getOrderByValueRange(double minValue, double maxValue) {
        return orders
                .stream()
                .filter(order -> order.getValue() >= minValue)
                .filter(order -> order.getValue() <= maxValue)
                .collect(Collectors.toSet());
    }

    public int getSize() {
        return orders.size();
    }

    public double sumOfOrdersValue() {
        double sum = 0;
        for (Order order : orders)
            sum += order.getValue();
        return sum;
    }
}
