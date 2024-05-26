package com.softserve.edu07.hw.hw2;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Liner(2, 300),
                new Boat(50, 2),
                new Plane(5000, 150),
                new Helicopter(11000, 4500, 4),
                new Bus("Stryiska street", 30),
                new Car("Toyota GR86", 2),
                new Motorcycle(300, 1)
        };
        for (var vehicle : vehicles) {
            vehicle.info();
        }

    }
}

