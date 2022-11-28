package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CarFactoryTestSuite {

    @Test
    public void shouldHeadLightsTurnedOnFrom8pm() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carForTheSeason");
        //When
        boolean headLightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(20, 0));
        //Then
        assertTrue(headLightsTurnedOn);
    }

    @Test
    public void shouldHeadLightsTurnedOnTo6am() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carForTheSeason");
        //When
        boolean headLightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(5, 59, 59));
        //Then
        assertTrue(headLightsTurnedOn);
    }

    @Test
    public void shouldHeadLightsTurnedOffAt6am() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carForTheSeason");
        //When
        boolean headLightsTurnedOn = car.hasHeadlightsTurnedOn(LocalTime.of(6, 0));
        //Then
        assertFalse(headLightsTurnedOn);
    }

    @Test
    public void shouldChosenCorrectCarForNow() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carForTheSeason");
        //When
        String carType = car.getCarType();
        //Then
        Assertions.assertEquals("Sedan", carType);
    }
}