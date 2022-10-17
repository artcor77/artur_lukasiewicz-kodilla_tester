package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("A", 1.5, true));
        stamps.add(new Stamp("B", 2.5, false));
        stamps.add(new Stamp("C", 1.7, true));
        stamps.add(new Stamp("D", 2.7, false));
        stamps.add(new Stamp("E", 1.0, true));
        stamps.add(new Stamp("A", 1.5, true));  // taki sam
        stamps.add(new Stamp("C", 1.7, true));  // taki sam

        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}
