package com.softserve.edu06.pt;

abstract class Car {
    String model;
    int maxSpeed;
    int yearOfProduction;

    Car(String model, int maxSpeed, int yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    abstract void run();

    abstract void stop();
}