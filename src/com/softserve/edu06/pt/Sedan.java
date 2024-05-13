package com.softserve.edu06.pt;

class Sedan extends Car {
    Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    void run() {
        System.out.println("Sedan is running");
    }

    @Override
    void stop() {
        System.out.println("Sedan stopped");
    }
}
