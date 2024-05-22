package com.softserve.edu05.hw;

import java.util.Scanner;

import static java.util.Arrays.sort;

public class Hw3 {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String... args) {
        Car[] cars = {
                new Car("Audi", 2005, 100),
                new Car("Mitsubishi", 2016, 500),
                new Car("BMV", 2001, 450),
                new Car("Audi", 2020, 700),
        };

        System.out.println("Enter model year: ");
        int i = SCANNER.nextInt();
        boolean found = false;
        for (var car : cars) {
            if (car.getYear_of_production() == i) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There are no cars with this year ");
        }

        System.out.println("From this table ");

        sort(cars);
        for (var car : cars) {
            System.out.println(car);
        }
    }

    static void sort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getYear_of_production() > cars[j + 1].getYear_of_production()) {
                    var swap = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = swap;
                }
            }
        }
    }
}


class Car {// Move to file Car.java

    String type;// Make private fields
    int year_of_production;
    double capacity;

    public Car(String type, int year_of_production, double capacity) {
        this.type = type;
        this.year_of_production = year_of_production;
        this.capacity = capacity;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year_of_production=" + year_of_production +
                ", capacity=" + capacity +
                '}';
    }
}
