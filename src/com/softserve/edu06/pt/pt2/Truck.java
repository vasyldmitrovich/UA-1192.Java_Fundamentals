package com.softserve.edu06.pt.pt2;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("The Truck is running.");

    }

    public void stop() {
        System.out.println("The Truck is stopped.");

    }

}
