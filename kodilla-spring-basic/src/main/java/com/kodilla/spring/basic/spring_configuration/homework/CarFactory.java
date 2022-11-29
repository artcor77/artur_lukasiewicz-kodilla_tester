package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.time.Month;
import java.time.MonthDay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Configuration
public class CarFactory {

    @Bean
    public Car carForTheSeason() {
        Car car;
        if (MonthDay.now().isAfter(MonthDay.of(Month.DECEMBER, 20)) &&
                MonthDay.now().isBefore(MonthDay.of(Month.MARCH, 23))) {
            car = new SUV();
        } else if (MonthDay.now().isAfter(MonthDay.of(Month.JUNE, 20)) &&
                MonthDay.now().isBefore(MonthDay.of(Month.SEPTEMBER, 23))) {
            car = new Cabrio();
        } else {
            car = new Sedan();
        }
        return car;
    }
}