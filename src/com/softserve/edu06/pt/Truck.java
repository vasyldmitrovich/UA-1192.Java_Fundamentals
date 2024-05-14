package com.softserve.edu06.pt;

public class Truck extends Car{
    public Truck (String model, int maxSpeed, int yearOfProduction){
        super(model, maxSpeed, yearOfProduction);
    }
    @Override
    public void run() {
        System.out.println(getModel() + " truck is running with speed " + getMaxSpeed()*0.65 + " now!");
    }

    @Override
    public void stop() {
        System.out.println(getModel() + " truck stopped!");
    }


}
