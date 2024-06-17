package com.softserve.edu07.hw.hw2;

public abstract class FlyingVehicle extends Passengers implements Vehicle{
    int passengers;

    public abstract void fly();

    public abstract void land();

    @Override
    public int getPassengers() {
        return passengers;
    }

    @Override
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
