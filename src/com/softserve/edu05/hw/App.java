package com.softserve.edu05.hw;

import java.util.*;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Enter month number");
        int month = scanner.nextInt();

        int days = MonthDaysCalculator.calculateMonthDays(month);
        System.out.println("Days in month: " + days);

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input integer number: ");
            arr[i] = scanner.nextInt();
        }

        int result = SumOrProductCalculator.calculateSumOrProduct(arr);
        System.out.println("Result: " + result);

        arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input integer number: ");
            arr[i] = scanner.nextInt();
        }

        StatsCalculatorResult response = ArrayStatsCalculator.calculateStats(arr);

        System.out.println("Second positive position: " + response.getSecondPositivePosition());
        System.out.println("Min value: " + response.getMin());
        System.out.println("Min position: " + response.getMinPosition());
        System.out.println("Product of even number exclude 0: " + response.getProductOfEvenNumbers());
    }

    public static void task2() {
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

    public static void task3() {

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

    public static void task4() {
        Random random = new Random();
        int number = random.nextInt(10);

        System.out.println("Try to guess number: ");

        do {
            int guess = scanner.nextInt();

            if (number == guess) {
                System.out.println("Congratulations! You guessed the number!");
                break;
            }

            if (number > guess) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Too high, try again");
            }

        } while (true);
    }
}
