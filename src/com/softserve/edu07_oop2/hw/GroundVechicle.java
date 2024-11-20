package com.softserve.edu07_oop2.hw;

public abstract class GroundVechicle extends Passengers implements Vehicle {

    public GroundVechicle() {
    }

    public GroundVechicle(int passengers) {
        super(passengers);
    }

    abstract void drive();

}
