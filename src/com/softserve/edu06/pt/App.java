package com.softserve.edu06.pt;

import java.util.Scanner;

public class App {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
        Car[] cars = new Car[4];
        cars[0] = new Truck("Ford F-150", 180, 2023);
        cars[1] = new Sedan("Toyota Camry", 200, 2022);
        cars[2] = new Truck("Chevrolet Silverado", 170, 2024);
        cars[3] = new Sedan("Honda Accord", 190, 2023);

        for (Car car : cars) {
            System.out.println("Model: " + car.model);
            System.out.println("Max Speed: " + car.maxSpeed);
            System.out.println("Year of Production: " + car.yearOfProduction);
            car.run();
            car.stop();
            System.out.println();
        }
    }
}
