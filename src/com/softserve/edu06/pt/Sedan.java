package com.softserve.edu06.pt;

public class Sedan extends Car {

    public Sedan() {
    }

    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        setModel(model);
        setMaxSpeed(maxSpeed);
        setYearOfProduction(yearOfProduction);
    }

    @Override
    public String run() {
        if(getModel().equalsIgnoreCase("bmw")){
        return String.format("Sedan %s runs to repair station", getModel());
        } else {
            return String.format("Sedan %s runs with max speed %d km/h", getModel(), getMaxSpeed());
        }

    }

    @Override
    public String stop() {
        return String.format("Sedan %s stops", getModel());
    }
}
