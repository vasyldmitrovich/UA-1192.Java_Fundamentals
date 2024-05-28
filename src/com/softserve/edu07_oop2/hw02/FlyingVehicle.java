package com.softserve.edu07_oop2.hw02;

abstract class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle() {
    }

    abstract void fly();

    abstract void land();

}
