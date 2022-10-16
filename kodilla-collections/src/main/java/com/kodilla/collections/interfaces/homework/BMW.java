package com.kodilla.collections.interfaces.homework;

public class BMW implements Car {
    private int speed;
    private int increaseSpeed = 50;
    private int decreaseSpeed = 30;
    public BMW() {
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
