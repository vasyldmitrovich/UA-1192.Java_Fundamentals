package com.softserve.edu06.pt;

public class Truck extends Car{

    public Truck(){}

    public Truck(String model, int maxSpeed, int yearOfProduction){
        setModel(model);
        setMaxSpeed(maxSpeed);
        setYearOfProduction(yearOfProduction);
    }

    @Override
    public String run() {
        return String.format("Track %s runs with max speed %d km/h", getModel(), getMaxSpeed());
    }

    @Override
    public String stop() {
        return String.format("Track %s stops", getModel());
    }
}
