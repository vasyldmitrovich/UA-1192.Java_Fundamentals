package com.softserve.edu06.pt.PracticalTask1;

import com.softserve.edu06.pt.PracticalTask1.Car;

public class Truck extends Car {

    public Truck () {
        super("Hyundai", 200, 2024);
    }

    public Truck (String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
