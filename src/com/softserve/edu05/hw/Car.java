package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Objects;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car() {
    }

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public static void hw3Cars(Car[] cars) {
        System.out.println("Enter car's year of production: ");
        boolean found = false;
        int input = Hw1_1.getNumber();
        for (var car : cars) {
            if (car.getYearOfProduction() == input) {
                System.out.println(car);
                found = true;
            }
        }
        if (!found) {
            System.out.printf("There aren't any cars %d year of production.", input);
        }
        System.out.println("-".repeat(40) + "CARS SORTING" +  "-".repeat(40));
        carsSort(cars);
    }

    public static Car[] carsSort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getYearOfProduction() < cars[j + 1].getYearOfProduction()) {
                    var swap = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = swap;
                }
            }
        }
        for (var car : cars) {
            System.out.println(car);
        }
        return cars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (yearOfProduction != car.yearOfProduction) return false;
        if (Double.compare(engineCapacity, car.engineCapacity) != 0) return false;
        return Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = type != null ? type.hashCode() : 0;
        result = 31 * result + yearOfProduction;
        temp = Double.doubleToLongBits(engineCapacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
