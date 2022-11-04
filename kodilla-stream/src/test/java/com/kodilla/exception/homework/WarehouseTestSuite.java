package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void shouldThrowExceptionWhenOrderDoesNotExist() {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("0"));
    }
    @Test
    public void shouldNotThrowExceptionWhenOrderExists() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));
        // when
        Order result = warehouse.getOrder("123");
        // then
        assertEquals(result, new Order("123"));   //nadpisana metoda equals & hashCode w klasie Order
    }
}