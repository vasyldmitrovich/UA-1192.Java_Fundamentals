package com.softserve.edu06.pt;

import java.util.Arrays;

public class Task62 {

    public static String execute(){
        Car[] cars = new Car[6];

        System.out.println("Lest make some cars to run");
        cars[0] = new Truck("Volvo", 160, 2020);
        cars[1] = new Truck("Scania", 140, 2019);
        cars[2] = new Sedan("Hyundai", 180, 2020);
        cars[3] = new Sedan("BMW", 240, 2006);
        cars[4] = new Sedan("Toyota", 240, 2016);
        cars[5] = new Sedan("Mercedes", 300, 2021);

        for (Car car: cars) {
            System.out.println(car.run());
        }

        for (Car car: cars) {
            System.out.println(car.stop());
        }

        return Arrays.toString(cars);
    }
}
