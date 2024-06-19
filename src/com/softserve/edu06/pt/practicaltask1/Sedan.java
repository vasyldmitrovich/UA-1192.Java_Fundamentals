package com.softserve.edu06.pt.practicaltask1;

public class Sedan extends Car {

    public Sedan () {
        super("Nissan", 240, 2005);
    }

    public Sedan (String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}