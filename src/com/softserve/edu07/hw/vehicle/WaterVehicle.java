package com.softserve.edu07.hw.vehicle;

public abstract class WaterVehicle extends Passengers implements Vehicle {
    public WaterVehicle(int passenger) {
        super(passenger);
    }

    public abstract void isSailing();
}
