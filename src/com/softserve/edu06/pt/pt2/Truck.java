package com.softserve.edu06.pt.pt2;

public class Truck extends Car {
    private boolean run = true;
    private boolean stop = true;

    public Truck() {
    }

    public Truck(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String run() {
        if (run) {
            return "it can run";
        }
        return null;
    }

    @Override
    public String stop() {
        if (stop) {
            return "it can stop";
        }
        return null;
    }
}
