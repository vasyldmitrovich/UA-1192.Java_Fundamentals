package com.softserve.edu06.pt;

public class Sedan extends Car{
    public Sedan(String model, int maxSpeed, int yearOfProduction) {
        super(model, maxSpeed, yearOfProduction);
    }

    @Override
    public void run() {
        System.out.println(getModel() + " sedan is running with speed " + getMaxSpeed()*0.5 + " now!");

    }

    @Override
    public void stop() {
        System.out.println(getModel() + " sedan stopped!");
    }
}
