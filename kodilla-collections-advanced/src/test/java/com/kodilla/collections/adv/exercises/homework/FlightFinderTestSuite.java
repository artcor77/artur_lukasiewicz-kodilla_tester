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
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("WRO", "WAW"));
        expectedList.add(new Flight("WRO", "GDA"));
        assertEquals(expectedList, departuresResult);
    }

    @Test
    public void testFindFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> arrivalsResult = flightFinder.findFlightsTo("WRO");
        //then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("WAW", "WRO"));
        expectedList.add(new Flight("GDA", "WRO"));
        assertEquals(expectedList, arrivalsResult);
    }
}