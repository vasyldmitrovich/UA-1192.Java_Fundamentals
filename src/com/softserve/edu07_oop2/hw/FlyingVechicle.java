package com.softserve.edu07_oop2.hw;

public abstract class FlyingVechicle extends Passengers implements Vehicle {

    public FlyingVechicle() {
    }

    public FlyingVechicle(int passengers) {
        super(passengers);
    }

    abstract void fly();

    abstract void land();

}
