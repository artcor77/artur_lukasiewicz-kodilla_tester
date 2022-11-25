package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Configuration
public class CarFactory {

    @Bean
    public SUV createSUV() {
        return new SUV();
    }

    @Bean
    public Car carSelection() {
        Car car;
        Random generator = new Random();
        List<String> seasons = Arrays.asList("Winter", "Spring", "Summer", "Autumn");
        int select = generator.nextInt(3);
        seasons.get(select);
        if (select == 0) {
            car = new SUV();
        } else if (select == 2) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        return car;
    }
}
