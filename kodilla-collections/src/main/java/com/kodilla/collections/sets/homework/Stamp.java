package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {

    // pola na nazwę oraz wymiary znaczka, a także informację o tym, czy znaczek jest ostemplowany czy nie.
    private String nameOfStamp;
    private double dimensions;
    private boolean stamped;

    public Stamp(String nameOfStamp, double dimensions, boolean stamped) {
        this.nameOfStamp = nameOfStamp;
        this.dimensions = dimensions;
        this.stamped = stamped;
    }

    public String getNameOfStamp() {
        return nameOfStamp;
    }

    public double getDimensions() {
        return dimensions;
    }

    public boolean isStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.dimensions, dimensions) == 0 && stamped == stamp.stamped && Objects.equals(nameOfStamp, stamp.nameOfStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfStamp, dimensions, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "nameOfStamp='" + nameOfStamp + '\'' +
                ", dimensions=" + dimensions +
                ", stamped=" + stamped +
                '}';
    }
}
