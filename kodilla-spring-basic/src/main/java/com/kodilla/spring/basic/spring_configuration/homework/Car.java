package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {

    public boolean hasHeadlightsTurnedOn(LocalTime localTime);

    public String getCarType();
}