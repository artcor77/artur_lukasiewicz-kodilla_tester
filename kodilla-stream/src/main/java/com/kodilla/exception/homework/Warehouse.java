package com.kodilla.exception.homework;

import java.util.*;
import java.util.stream.Collectors;

public class Warehouse {
    List<Order> orders = new ArrayList<>();
    public void addOrder(Order order) {
        List<Order> newOrder = orders;
        newOrder.add(order);
    }

    public List<Order> getOrder(String number) {
        List<Order> numberOfOrder = orders
                .stream()
                .filter(order -> order.getNumber() == number)
                .collect(Collectors.toList());
        return numberOfOrder;
    }
}
