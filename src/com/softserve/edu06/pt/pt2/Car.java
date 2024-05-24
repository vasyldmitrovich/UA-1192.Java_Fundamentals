package com.softserve.edu06.pt.pt2;

public abstract class Car {
    String model;
    int maxSpeed;
    int yearOfProduction;

    public abstract String run();

    public abstract String stop();

    @Override
    public String toString() {
        return "-".repeat(40) + "\n" + "Model: " + model + '\n' +
                "Max speed: " + maxSpeed + " km/h" + "\n" +
                "Year of production: " + yearOfProduction + "\n" +
                run() + " and " + stop() + "\n" + "-".repeat(40) + "\n";
    }
}
