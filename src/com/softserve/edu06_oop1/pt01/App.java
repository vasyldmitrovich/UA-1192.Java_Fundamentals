package com.softserve.edu06_oop1.pt01;

import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String... args) {// All good
        Car[] cars = new Car[4];
        cars[0] = new Truck("Nissan X-Trail", 180, 2023);
        cars[1] = new Sedan("BMW 7 Series", 200, 2024);
        cars[2] = new Truck("Chevrolet Silverado", 170, 2024);
        cars[3] = new Sedan("Hyundai Sonata 2023", 190, 2023);

        for (Car car : cars) {
            System.out.println("Model: " + car.model);
            System.out.println("Max Speed: " + car.maxSpeed);
            System.out.println("Year of Production: " + car.yearOfProduction);
            car.run();
            car.stop();
            System.out.println();

            System.out.println("--------------------------------------------");
        }


    }
}
