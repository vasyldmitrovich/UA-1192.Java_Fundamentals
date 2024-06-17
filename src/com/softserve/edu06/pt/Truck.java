package com.softserve.edu06.pt;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println(model + " truck is running.");
    }

    @Override
    public void stop() {
        System.out.println(model + " truck has stopped.");
    }
}
