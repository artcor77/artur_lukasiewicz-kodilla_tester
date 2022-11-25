package com.kodilla.spring.basic.spring_configuration.homework;

import com.kodilla.spring.basic.spring_configuration.Animal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CarFactoryTestSuite {

    @Test
    public void shouldHeadLightsTurnedOnFrom8pm() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SUV suv = (SUV) context.getBean("createSUV");
        //When
        boolean headLightsTurnedOn = suv.hasHeadlightsTurnedOn(LocalTime.of(20, 0));
        //Then
        assertTrue(headLightsTurnedOn);
    }

    @Test
    public void shouldHeadLightsTurnedOnTo6am() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SUV suv = (SUV) context.getBean("createSUV");
        //When
        boolean headLightsTurnedOn = suv.hasHeadlightsTurnedOn(LocalTime.of(5, 59, 59));
        //Then
        assertTrue(headLightsTurnedOn);
    }

    @Test
    public void shouldHeadLightsTurnedOffAt6am() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        SUV suv = (SUV) context.getBean("createSUV");
        //When
        boolean headLightsTurnedOn = suv.hasHeadlightsTurnedOn(LocalTime.of(6, 0));
        //Then
        assertFalse(headLightsTurnedOn);
    }

    @Test
    public void shouldCreateRandomAnimal() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carSelection");
        //When
        String carType = car.getCarType();
        System.out.println(carType);
        //Then
        List<String> possibleCarTypes = Arrays.asList("SUV", "Cabrio", "Sedan");
        Assertions.assertTrue(possibleCarTypes.contains(carType));
    }
}