package com.softserve.edu06.pt;

class Truck extends Car {
    Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Truck is running");
    }

    @Override
    void stop() {
        System.out.println("Truck stopped");
    }
}
