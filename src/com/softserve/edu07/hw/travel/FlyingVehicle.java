package com.softserve.edu07.hw.travel;

public abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    public abstract void fly();

    public abstract void land();

}
