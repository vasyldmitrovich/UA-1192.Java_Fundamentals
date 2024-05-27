package com.softserve.edu07.hwork;

public abstract class FlyingVehicle extends Passengers implements Vehicle{

    public FlyingVehicle() {
    }

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    abstract void fly();

    abstract void land();

}
