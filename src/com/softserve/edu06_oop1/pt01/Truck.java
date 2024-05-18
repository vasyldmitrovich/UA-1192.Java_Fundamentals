package com.softserve.edu06_oop1.pt01;

public class Truck extends Car {
    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println(model + " start to running ");
    }

    @Override
    public void stop() {
        System.out.println(model + " stop to move ");
    }
}

