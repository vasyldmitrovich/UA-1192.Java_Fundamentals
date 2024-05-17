package com.softserve.edu07.hw.vehicle;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int passenger) {
        super(passenger);
    }

    public abstract void fly();

    public abstract void land();
}
