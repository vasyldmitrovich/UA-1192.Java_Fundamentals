package com.softserve.edu05.hw;
public class App {

    public static void main(String[] args) {
        Hw1_1.hwDoTask1();
        Hw1_2.hwDoTask2();
        Hw1_3.hwDoTask3();
        Hw2.hw2Task();

        Car[] cars = {
            new Car("Sedan", 2020, 2.0),
            new Car("Liftback", 2018, 2.0),
            new Car("Suv", 2014, 4.0),
            new Car("Coupe", 2021, 3.7),
        };

        hw3Cars(cars);
        Randomizer.RandomizerApp();
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
}

