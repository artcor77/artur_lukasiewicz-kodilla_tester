package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.arrays.homework.CarUtils.describeCar;

public class CarsListApplication {  //Dodaj do niego klasę CarsListApplication z metodą main

    public static void main(String[] args) {

        //  Wewnątrz metody main stwórz kolekcję samochodów (typu ArrayList),
        //  której typem elementów będzie dowolna klasa implementująca interfejs Car
        List<Car> cars = new ArrayList<>();
        cars.add(new Mercedes());
        cars.add(new Mercedes());
        Audi audi = new Audi();
        cars.add(audi);
        cars.add(new BMW());
        cars.add(new BMW());
        cars.add(new BMW());

        //Dodaj do kolekcji kilka różnych samochodów i wyświetl w pętli for-each zawartość kolekcji,
        // używając przygotowanej wcześniej metody describeCar z klasy CarUtils
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        // Usuń jeden z samochodów z kolekcji, używając do tego metody remove(int index)
        cars.remove(1);

        // Usuń jeden z samochodów z kolekcji, używając do tego metody remove(Object o)
        cars.remove(audi);

        //  Ponownie wyświetl zawartość kolekcji, a także informację o jej rozmiarze
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("-----------------------------");
        System.out.println("Collection's size: " + cars.size());
    }
}
