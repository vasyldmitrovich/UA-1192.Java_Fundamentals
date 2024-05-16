package com.softserve.edu07.hw.vehicle;

import java.util.Random;

public abstract class Passengers implements Vehicle {

    protected static final Random RAND = new Random();

    protected int passengers;

    public Passengers() {}

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        if (passengers < 0) {
            passengers = 0;
        }
        this.passengers = passengers;
    }
}
