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

    public static Car drawCar() {

        int increaseSpeed = getRandomIncreaseSpeed();
        int drawnCars = random.nextInt(3);
        if (drawnCars == 0)
            return new Mercedes(increaseSpeed,0);
        else if (drawnCars == 1)
            return new BMW(increaseSpeed, 0);
        else {
            return new Audi(increaseSpeed, 0);
        }
    }

    public static int getRandomIncreaseSpeed() {
        return random.nextInt(200)+1;
    }
}
