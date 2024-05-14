package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = new Car[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for car " + (i + 1) + ":");
            System.out.print("Type: ");
            String type = scanner.nextLine();
            System.out.print("Year of production: ");
            int yearOfProduction = scanner.nextInt();
            System.out.print("Engine capacity: ");
            double engineCapacity = scanner.nextDouble();
            scanner.nextLine();

            cars[i] = new Car(type, yearOfProduction, engineCapacity);
        }

        System.out.print("\nEnter the year to filter cars: ");
        int yearFilter = scanner.nextInt();
        System.out.println("Cars of year " + yearFilter + ":");
        for (Car car : cars) {
            if (car.getYearOfProduction() == yearFilter) {
                System.out.println(car);
            }
        }

        Arrays.sort(cars, Comparator.comparingInt(Car::getYearOfProduction));

        System.out.println("\nSorted cars by year:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
