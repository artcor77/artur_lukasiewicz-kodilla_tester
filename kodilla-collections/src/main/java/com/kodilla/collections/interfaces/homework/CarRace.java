package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes(30, 10);
        doRace(mercedes);
        BMW bmw = new BMW(50, 30);
        doRace(bmw);
        Audi audi = new Audi(40, 10);
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
