package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime localTime) {
        if ((localTime.isAfter(LocalTime.of(19, 59, 59)) || localTime.isBefore(LocalTime.of(6, 0)))) {
            return true;
        }
        return false;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
