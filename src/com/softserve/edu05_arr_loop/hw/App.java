package com.softserve.edu05_arr_loop.hw;

public class App {
    public static void main(String[] args) {
        Hw1.main(args);
        Hw2.main(args);
        Hw4.main(args);


        Car car1 = new Car("Suzuki", 2010, 2.0);
        Car car2 = new Car("SUV", 2015, 2.5);
        Car car3 = new Car("Coupe", 2010, 1.8);
        Car car4 = new Car("Hatchback", 2018, 1.6);

        Car[] cars = {car1, car2, car3, car4};

        Hw3.hw3Cars(cars);
    }
    }







