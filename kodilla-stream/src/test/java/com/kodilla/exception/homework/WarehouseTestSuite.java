package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGetOrder_withException() {
        //given
        Warehouse warehouse = new Warehouse();
        //when
        //then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("0"));
    }
    @Test
    public void testIsOrderInWarehouse() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("456"));

        // when
        Order isOrderInWarehouse = warehouse.getOrder("123");
        // then
        assertEquals(isOrderInWarehouse.getNumber(), warehouse.getOrder("123").getNumber());
    }
}