package com.softserve.edu07_oop2.hw;

public abstract class WaterVechicle extends Passengers implements Vehicle {

    public WaterVechicle() {
    }

    public WaterVechicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();

}
