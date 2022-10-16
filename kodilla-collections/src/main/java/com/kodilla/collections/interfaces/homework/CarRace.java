package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes();
        doRace(mercedes);
        BMW bmw = new BMW();
        doRace(bmw);
        Audi audi = new Audi();
        doRace(audi);
    }
    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Speed: " + car.getSpeed());
    }
}
