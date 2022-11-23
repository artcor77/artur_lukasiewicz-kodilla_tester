package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.naming.NameNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldReturnCorrectValueForAddWhenOneNumberIsZero() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        //When
        double result = bean.add(5.5, 0);
        //Then
        assertEquals(5.5, result);
    }

    @Test
    public void shouldReturnCorrectValueForAddWhenTwoNumberAreZero() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        //When
        double result = bean.add(0, 0);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void shouldReturnCorrectValueForAddWhenNumbersAreMinus() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        //When
        double result = bean.add(-5, -5);
        //Then
        assertEquals(-10, result);
    }

    @Test
    public void shouldReturnCorrectValueForSubtractWhenOneNumberIsZero() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        //When
        double result = bean.subtract(5.5, 0);
        //Then
        assertEquals(5.5, result);
    }

    @Test
    public void shouldReturnCorrectValueForSubtractWhenTwoNumbersAreZero() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        //When
        double result = bean.subtract(0, 0);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void shouldReturnCorrectValueForSubtractWhenOneNumbersAreMinus() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        //When
        double result = bean.subtract(-100, -50);
        //Then
        assertEquals(-50, result);
    }

    @Test
    public void shouldReturnCorrectValueForMultiplyWhenOneNumberIsZero() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        //When
        double result = bean.multiply(5.5, 0);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void shouldReturnCorrectValueForMultiplyWhenTwoNumbersAreZero() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        //When
        double result = bean.multiply(0, 0);
        //Then
        assertEquals(0, result);
    }

    @Test
    public void shouldReturnCorrectValueForMultiplyWhenNumbersAreMinus() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        //When
        double result = bean.multiply(-5, -5);
        //Then
        assertEquals(25, result);
    }

    @Test
    public void shouldReturnCorrectValueForDivideWhenOneNumberIsZero() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        //When Then
        assertEquals(Double.NaN, bean.divide(10, 0));
    }

    @Test
    public void shouldReturnCorrectValueForDivideWhenTwoNumbersAreZero() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        //When Then
        assertEquals(Double.NaN, bean.divide(0, 0));
    }

    @Test
    public void shouldReturnCorrectValueForDivideWhenNumbersAreMinus() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        //When
        double result = bean.divide(-100, -50);
        //Then
        assertEquals(2, result);
    }

    @Test
    public void shouldDisplayWork() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double result = bean.divide(-100, -50);
        //When
        Display bean2 = context.getBean(Display.class);
        double value = bean2.display(result);
        //Then
        assertEquals(2, value);
    }
}