package com.softserve.edu07.hw.homework2;

public abstract class Passengers {

    protected int passengers;

    public Passengers () {
        this.passengers = 15;
    }

    public Passengers (int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
