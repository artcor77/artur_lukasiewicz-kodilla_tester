package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();             //Dodaje przykładowe zamówienia
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));
        warehouse.addOrder(new Order("789"));
        warehouse.addOrder(new Order("123456789"));

        try {
            Order isOrderInWarehouse = warehouse.getOrder("13");             //Wyszukuje nieistniejące zamówienie
            System.out.println("Order availability: " + isOrderInWarehouse);       //Jeśli istnieje
        } catch (OrderDoesntExistException e) {
            System.out.println(e.getMessage());                              //Jesli nieistnieje
        } finally {
            System.out.println("Thank you for choosing our warehouse");      //Sekcja finally
        }
    }
}
