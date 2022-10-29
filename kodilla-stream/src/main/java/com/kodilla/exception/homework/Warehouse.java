package com.kodilla.exception.homework;

import java.util.*;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();   //Lista zamówień

    public Order addOrder(Order order) {   //Dodaje zamówienia do listy
        orders.add(order);
        return order;
    }

    public Order getOrder(String number) throws OrderDoesntExistException {  //Wyszukuje konkretne zamówienie z wyjątkiem
        return orders
                .stream()
                .filter(order -> order.getNumber() == number)
                .findFirst()
                .orElseThrow(OrderDoesntExistException::new);
    }
}
