package com.softserve.edu06_oop1.pt.pt2;

import com.softserve.edu06_oop1.pt.Truck;

public class App {
    public static void main(String[] args) {
        Car car1 = new Truck("Ford F-150", 120, 2018);
        Car car2 = new Sedan("Toyota Camry", 180, 2020);
        Car car3 = new Truck("Ram 1500", 130, 2019);
        Car car4 = new Sedan("Honda Accord", 190, 2021);

        Car[] cars = {car1, car2, car3, car4};

        for (Car car : cars) {
            System.out.println(car);
            car.run();
            car.stop();
        }
    }
}
