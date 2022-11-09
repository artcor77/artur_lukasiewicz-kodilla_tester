package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();
    Order a = new Order(250, LocalDate.of(2022,11,7), "Art07");
    Order b = new Order(50.50, LocalDate.of(2022,5,10), "Bar12");
    Order c = new Order(2500.40, LocalDate.of(2022,2,15), "ano");
    Order d = new Order(300, LocalDate.of(2021,1,30), "mar20");
    Order e = new Order(800.60, LocalDate.of(2020,12,1), "bet56");
    Order f = new Order(300, LocalDate.of(2021,1,30), "mar20");
    Order g = new Order(800.60, LocalDate.of(2020,12,1), "bet56");

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(a);
        shop.addOrder(b);
        shop.addOrder(c);
        shop.addOrder(d);
        shop.addOrder(e);
        shop.addOrder(f);
        shop.addOrder(g);
    }

    @Test
    public void shouldReturnCorrectOrdersListSize() {
        assertEquals(7, shop.getSize());
    }
    @Test
    public void shouldReturnCorrectSumOfOrdersValue() {
        assertEquals(5002.1, shop.sumOfOrdersValue());
    }
    @Test
    public void shouldAddOrderWhenTheSameOrderAlreadyExist() {
        shop.addOrder(a);
        assertEquals(7, shop.getSize());
    }
    @Test
    public void shouldReturnCorrectOrdersFromDateRange() {
        assertEquals(Set.of(a, b, c), shop.getOrderByDateRange(LocalDate.of(2022,1,1),
                LocalDate.of(2022,12,31)));
        assertEquals(Set.of(), shop.getOrderByDateRange(LocalDate.of(2020,1,1),
                LocalDate.of(2020,11,30)));
    }
    @Test
    public void shouldReturnCorrectOrdersFromValueRange() {
        assertEquals(Set.of(e, g), shop.getOrderByValueRange(800, 2500.39));
    }
    @Test
    public void shouldReturnCorrectOrdersFromValueRangeWhenValuesAreTheSame() {
        assertEquals(Set.of(e, g), shop.getOrderByValueRange(800.6, 800.6));
    }
    @Test
    public void shouldReturnCorrectOrdersFromValueRangeWhenValuesAreOutOfRange() {
        assertEquals(Set.of(), shop.getOrderByValueRange(5000, 8000));
    }
}