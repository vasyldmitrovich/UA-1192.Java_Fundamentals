package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        task1();
//        task2();
        task3();
    }

    private static void task1() {
        MonthDaysCalculator.task();
        SumProductCalculator.task();
        ResultsFinder.task();
    }

    private static void task2() {
        do {

            System.out.println("Input first number: ");
            double firstName = scanner.nextDouble();

            System.out.println("Input second number: ");
            double secondNumber = scanner.nextDouble();

            System.out.println("Sum of calculated numbers: " + (firstName + secondNumber));

            System.out.println("Do you want to continue? (Y/N): ");
            String answer = scanner.next();

            if (!"Y".equals(answer)) {
                break;
            }

        } while (true);
    }

    private static void task3() {

        Car[] cars = {
                new Car(CarType.BUS, 2009, 2.0f),
                new Car(CarType.HEAVY_DUTY_TRUCK, 2012, 5.5f),
                new Car(CarType.AUTOMOBILE, 2019, 1.8f),
                new Car(CarType.PICKUP, 2022, 3.6f),
        };

        System.out.println("\nCreated cars:\n");

        for (Car car : cars) {
            System.out.println(car);
        }

        Arrays.sort(cars, Comparator.comparing(Car::getYearOfProduction));

        System.out.println("\nSorted cars by year of production:\n");

        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\nInput value to search car: ");
        String searchValue = scanner.nextLine();

        List<Car> filteredCars = Arrays
                .stream(cars)
                .filter(item -> item.getType().getName().equalsIgnoreCase(searchValue))
                .toList();

        for (Car car : filteredCars) {
            System.out.println(car);
        }
    }
}
