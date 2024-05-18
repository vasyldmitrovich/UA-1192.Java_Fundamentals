package com.softserve.edu06.ptask;

public class Truck extends Car {

    public Truck(String model, double maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck is running.");
    }

    @Override
    public void stop() {
        System.out.println("Truck has stopped.");
    }
}

