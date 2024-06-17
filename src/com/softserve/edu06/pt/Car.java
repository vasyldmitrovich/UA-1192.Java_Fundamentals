package com.softserve.edu06.pt;

public abstract class Car {
    protected String model;
    protected int maxSpeed;
    protected int yearOfProduction;

    public Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void run();
    public abstract void stop();

    @Override
    public String toString() {
        return "Model: " + model + ", Max Speed: " + maxSpeed + ", Year of Production: " + yearOfProduction;
    }
}
