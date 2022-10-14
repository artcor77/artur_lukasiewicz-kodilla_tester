package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;


public class CarUtils {

    public static void describeCar(Car car) {

        car.increaseSpeed();
        System.out.println("-----------------------------");
        System.out.println("Brand: " + getCarBrand(car));
        System.out.println("Speed: " + car.getSpeed());
    }

    private static String getCarBrand(Car car) {
        if (car instanceof Mercedes)
            return "Mercedes";
        else if (car instanceof BMW)
            return "BMW";
        else if (car instanceof Audi)
            return "Audi";
        else
            return "Unknown brand";
    }
}
