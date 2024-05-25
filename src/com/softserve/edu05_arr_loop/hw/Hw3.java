package com.softserve.edu05_arr_loop.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Hw3 {
    public static void hw3Cars(Car[] cars) {
        // Sorting cars by year of production
        Arrays.sort(cars, (c1, c2) -> Integer.compare(c1.getYearOfProduction(), c2.getYearOfProduction()));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year of production to search for: ");
        int searchYear = scanner.nextInt();

        System.out.println("Cars from the year " + searchYear + ":");
        for (Car car : cars) {
            if (car.getYearOfProduction() == searchYear) {
                System.out.println(car);
            }
        }

        System.out.println("\nCars sorted by year of production:");
        for (Car car : cars) {
            System.out.println(car);
        }

        scanner.close();
    }
}
