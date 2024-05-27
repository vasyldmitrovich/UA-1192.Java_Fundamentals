package com.softserve.edu06_oop1.pt;


import com.softserve.edu06_oop1.pt.pt2.Car;

public class Truck extends Car {

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println("Truck " + model + " is running.");
    }

    @Override
    public void stop() {
        System.out.println("Truck " + model + " has stopped.");
    }
}
