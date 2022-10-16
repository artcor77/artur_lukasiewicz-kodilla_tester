package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.Random;

public class CarsApplication {

    private static final Random random = new Random();

    public static void main(String[] args) {

        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    private static Car drawRandomCar() {

        int drawnCars = random.nextInt(3);
        if (drawnCars == 0)
            return new Mercedes();
        else if (drawnCars == 1)
            return new BMW();
        else {
            return new Audi();
        }
    }

    private static void increaseSpeedRandom(Car car) {

        for (int i = 0; i < random.nextInt(5) + 1; i++)
            car.increaseSpeed();
    }

    private static Car drawCar() {
        Car car = drawRandomCar();
        increaseSpeedRandom(car);
        return car;
    }
}
