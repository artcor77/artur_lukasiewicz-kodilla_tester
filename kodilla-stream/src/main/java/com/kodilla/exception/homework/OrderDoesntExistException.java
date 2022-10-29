package com.kodilla.exception.homework;

public class OrderDoesntExistException extends Exception {

    public OrderDoesntExistException(String orderNumber) {
        super(String.format("Order with id %s does not exist", orderNumber));
    }
}
