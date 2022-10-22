package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.getFlightsTable;

public class FlightFinder {

    public List<Flight> findFlightsFrom(String departure) {

        List<Flight> departuresResult = new ArrayList<>();
        for (Flight flight : getFlightsTable()) {
            if (flight.getDeparture().equals(departure))
                departuresResult.add(flight);
        }
        return departuresResult;
    }

    public List<Flight> findFlightsTo(String arrival) {

        List<Flight> arrivalsResult = new ArrayList<>();
        for (Flight flight : getFlightsTable()) {
            if (flight.getArrival().equals(arrival))
                arrivalsResult.add(flight);
        }
        return arrivalsResult;
    }
}
