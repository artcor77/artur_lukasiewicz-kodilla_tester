package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {
    private int speed;
    private int increaseSpeed = 30;
    private int decreaseSpeed = 10;
    public Mercedes() {
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
