package com.softserve.edu06_oop1.pt.pt2;

public class Sedan extends Car {// Nice

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Sedan " + model + " is running.");
    }

    @Override
    public void stop() {
        System.out.println("Sedan " + model + " has stopped.");
    }
}