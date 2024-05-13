package com.softserve.edu05.hw;

import java.util.*;
import java.util.stream.Collectors;

public class Task53 {



    public static HashSet<Car> getByYear(Car[] cars, int year) {
        HashSet<Car> filteredCars = new HashSet<>();

        if (year < 1885) {
            System.out.println("Sorry, only horses were then");
        } else {
            for (Car car : cars) {
                if (car.getProductionYear() == year) filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    public static List<Car> sortByYear(Car[] cars) {
        return Arrays.stream(cars).sorted(Comparator.comparing(Car::getProductionYear)).collect(Collectors.toList());
    }

    public static void execute() {
        //initialize four instances of class Car
        Car[] cars = new Car[]{
                new Car("Dresla model Ge", 2025, 1500),
                new Car("Jeep Shyrokii", 2016, 2500),
                new Car("Mazda Lopata", 2016, 3500),
                new Car("Chevrolet Zvezdolet", 2025, 6400)
        };

        //Output result for cars of certain model year (enter year in the console)
        System.out.println("Will filter all models of a particular year");
        HashSet<Car> filtered = getByYear(cars, CustomScanner.scanInt());
        if (filtered.size() > 0) {
            System.out.println("Models of this year: " + filtered);
        } else {
            System.out.println("No suitable models");
        }

        //Output result for cars sorted cars by the year of production
        System.out.println("All cars sorted by production year:");
        System.out.println(sortByYear(cars));

    }


}
