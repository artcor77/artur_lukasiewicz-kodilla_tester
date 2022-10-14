package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.Random;

public class CarsApplication {

    private static Random random;

    public static void main(String[] args) {

        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {

        Random random = new Random();
        int drawnCars = random.nextInt(3);
        int increaseSpeed = getRandomIncreaseSpeed();
        if (drawnCars == 1)
            return new Mercedes(increaseSpeed);
        else if (drawnCars == 2)
            return new BMW(increaseSpeed);
        else {
            return new Audi(increaseSpeed);
        }
        return drawCar();
    }

    private static int getRandomIncreaseSpeed() {
        return random.nextInt(250);
    }
}
