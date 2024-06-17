package com.softserve.edu07.hw.hw2;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = {

                new Plane(8000, 210),
                new Helicopter(2231, 3000, 2),
                new Bus("Bandery str", 42),
                new Boat(15, 7),
                new Motorcycle(230, 0),
                new Car("Mercedes B200", 3),
                new Liner(5, 1500)

        };
        for (var vehicle : vehicles) {
            vehicle.info();
        }
    }
}
