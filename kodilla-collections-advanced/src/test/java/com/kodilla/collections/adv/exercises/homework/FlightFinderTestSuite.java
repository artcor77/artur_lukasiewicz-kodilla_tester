package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> departuresResult = flightFinder.findFlightsFrom("WRO");
        //then
        assertEquals(List.of(new Flight("WRO", "WAW"), new Flight("WRO", "GDA")), departuresResult);
    }

    @Test
    public void testFindFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> arrivalsResult = flightFinder.findFlightsTo("WRO");
        //then
        assertEquals(List.of(new Flight("WAW", "WRO"), new Flight("GDA", "WRO")), arrivalsResult);
    }
}