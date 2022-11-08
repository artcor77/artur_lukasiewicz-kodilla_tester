package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public List<Order> getOrderByDateRange(LocalDate fromDate, LocalDate toDate) {
        return orders
                .stream()
                .filter(order -> order.getDate().isAfter(fromDate))
                .filter(order -> order.getDate().isBefore(toDate))
                .collect(Collectors.toList());
    }

    public List<Order> getOrderByValueRange(double minValue, double maxValue) {
        return orders
                .stream()
                .filter(order -> order.getValue() >= minValue)
                .filter(order -> order.getValue() >= maxValue)
                .collect(Collectors.toList());
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
