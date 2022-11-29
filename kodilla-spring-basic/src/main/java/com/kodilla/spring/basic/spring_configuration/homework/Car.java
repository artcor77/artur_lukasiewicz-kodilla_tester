package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {

    final LocalTime LIGHTSTURNON = LocalTime.of(19, 59, 59);
    final LocalTime LIGHTSTURNOFF = LocalTime.of(6, 0);


    public boolean hasHeadlightsTurnedOn(LocalTime localTime);

    public String getCarType();
}