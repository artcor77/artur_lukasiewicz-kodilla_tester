package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {
    private int speed;
    private int increaseSpeed = 40;
    private int decreaseSpeed = 10;
    public Audi() {
        speed = 0;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed += increaseSpeed;
    }

    @Override
    public void decreaseSpeed() {
        speed -= decreaseSpeed;
        if (speed < 0 ) {
            speed = 0;
        }
    }
}
