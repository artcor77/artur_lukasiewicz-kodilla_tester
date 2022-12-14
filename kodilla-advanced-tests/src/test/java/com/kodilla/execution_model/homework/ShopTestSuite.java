package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    private static Shop initShop() {
        Shop shop = new Shop();
        Order order1 = new Order(250, LocalDate.of(2022, 11, 7), "Art07");
        Order order2 = new Order(50.50, LocalDate.of(2022, 5, 10), "Bar12");
        Order order3 = new Order(2500.40, LocalDate.of(2022, 2, 15), "ano");
        Order order4 = new Order(300, LocalDate.of(2021, 1, 30), "mar20");
        Order order5 = new Order(800.60, LocalDate.of(2020, 12, 1), "bet56");
        Order order6 = new Order(300, LocalDate.of(2021, 1, 30), "mar20");
        Order order7 = new Order(800.60, LocalDate.of(2020, 12, 1), "bet56");

        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        shop.addOrder(order4);
        shop.addOrder(order5);
        shop.addOrder(order6);
        shop.addOrder(order7);
        return shop;
    }
    private Shop shop;

    @BeforeEach
    public void init() {
        shop = initShop();
    }
    @Test
    public void shouldReturnCorrectOrdersListSize() {
        assertEquals(5, shop.getSize());
    }

    @Test
    public void shouldReturnCorrectSumOfOrdersValue() {
        assertEquals(3901.5, shop.sumOfOrdersValue());
    }

    @Test
    public void shouldAddOrderWhenTheSameOrderAlreadyExist() {
        //given
        shop.addOrder(new Order(250, LocalDate.of(2022, 11, 7), "Art07"));
        //when then
        assertEquals(5, shop.getSize());
    }

    @Test
    public void shouldReturnCorrectOrdersFromDateRange() {
        // given
        Set<Order> expectedResult = Set.of(new Order(250, LocalDate.of(2022,11,7), "Art07"),
                new Order(50.50, LocalDate.of(2022,5,10), "Bar12"),
                new Order(2500.40, LocalDate.of(2022,2,15), "ano"));
        // when then
        assertEquals(expectedResult, shop.getOrderByDateRange(LocalDate.of(2022,1,1),
                LocalDate.of(2022,12,31)));
    }

    @Test
    public void shouldReturnCorrectOrdersFromDateRangeWhenDatesAreOutOfRange() {
        //given
        Set<Order> expectedResult = Set.of();
        //when then
        assertEquals(expectedResult, shop.getOrderByDateRange(LocalDate.of(2020,1,1),
                LocalDate.of(2020,11,30)));
    }

    @Test
    public void shouldReturnCorrectOrdersFromValueRange() {
        //given
        Set<Order> expectedResult = Set.of(new Order(800.60, LocalDate.of(2020, 12, 1), "bet56"));
        //when then
        assertEquals(expectedResult, shop.getOrderByValueRange(800, 2500.39));
    }

    @Test
    public void shouldReturnCorrectOrdersFromValueRangeWhenValuesAreTheSame() {
        //given
        Set<Order> expectedResult = Set.of(new Order(800.60, LocalDate.of(2020, 12, 1), "bet56"));
        //when then
        assertEquals(expectedResult, shop.getOrderByValueRange(800.6, 800.6));
    }

    @Test
    public void shouldReturnCorrectOrdersFromValueRangeWhenValuesAreOutOfRange() {
        assertEquals(Set.of(), shop.getOrderByValueRange(5000, 8000));
    }
}