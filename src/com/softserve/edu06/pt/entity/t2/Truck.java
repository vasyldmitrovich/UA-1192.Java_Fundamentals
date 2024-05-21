package com.softserve.edu06.pt.entity.t2;

public class Truck extends Car {
    public Truck() {
    }

    public Truck(String model, float maxSpeed, String yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("The truck is running.");
    }

    @Override
    public void stop() {
        System.out.println("The truck has stopped.");
    }
}
