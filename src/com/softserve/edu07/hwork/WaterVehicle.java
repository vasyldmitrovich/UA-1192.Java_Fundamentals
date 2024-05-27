package com.softserve.edu07.hwork;

public abstract class WaterVehicle extends Passengers implements Vehicle{

    public WaterVehicle() {
    }

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();

}
