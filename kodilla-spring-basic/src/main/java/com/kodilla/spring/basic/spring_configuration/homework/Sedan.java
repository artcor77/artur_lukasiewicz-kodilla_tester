package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class Sedan implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime localTime) {
        if ((localTime.isAfter(LIGHTSTURNON) || localTime.isBefore(LIGHTSTURNOFF))) {
            return true;
        }
        return false;
    }

    @Override
    public String getCarType() {
        return "Sedan";
    }
}
