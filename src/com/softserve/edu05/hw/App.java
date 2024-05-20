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

        Car.hw3Cars(cars);
        Randomizer.RandomizerApp();
    }
}

