package com.softserve.edu07.hwork;

public abstract class GroundVehicle extends Passengers implements Vehicle{

    public GroundVehicle() {
    }

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    abstract void drive();


}
