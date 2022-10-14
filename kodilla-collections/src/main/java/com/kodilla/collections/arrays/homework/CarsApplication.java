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
        int speed = getRandomIncreaseSpeed(random);
        if (drawnCars == 0)
            return new Mercedes(speed, 0);
        else if (drawnCars == 1)
            return new BMW(speed, 0);
        else {
            return new Audi(speed, 0);
        }
    }

    private static int getRandomIncreaseSpeed(Random random) {
        return random.nextInt(250);
    }
}
