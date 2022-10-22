package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {

        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("WRO", "WAW"));
        flights.add(new Flight("WAW", "WRO"));
        flights.add(new Flight("WRO", "GDA"));
        flights.add(new Flight("GDA", "WRO"));
        flights.add((new Flight("WAW", "KRK")));

        return flights;
    }
}
