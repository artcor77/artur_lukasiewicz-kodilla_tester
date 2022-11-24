package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldReturnCorrectMessageWhenWeightIsUnderZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String notification = bean.sendPackage("Warsaw", -1);
        Assertions.assertEquals("Package not delivered to: Warsaw", notification);
    }

    @Test
    public void shouldReturnCorrectMessageWhenWeightIsZero() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String notification = bean.sendPackage("Warsaw", 0);
        assertEquals("Package not delivered to: Warsaw", notification);
    }

    @Test
    public void shouldReturnCorrectMessageWhenWeightIsOver30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String notification = bean.sendPackage("Warsaw", 31);
        assertEquals("Package not delivered to: Warsaw", notification);
    }
}