package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException() {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("0"));
    }
}