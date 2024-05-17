package com.softserve.edu07.hw.vehicle;

public abstract class GroundVehicle extends Passengers implements Vehicle {
    public GroundVehicle(int passenger) {
        super(passenger);
    }

    public abstract void drive();
}
