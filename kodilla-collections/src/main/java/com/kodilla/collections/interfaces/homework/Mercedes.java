package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {
    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;
    public Mercedes(int increaseSpeed, int decreaseSpeed) {
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
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
    }
}
