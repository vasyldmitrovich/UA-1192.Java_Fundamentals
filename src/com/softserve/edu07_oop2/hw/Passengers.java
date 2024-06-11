package com.softserve.edu07_oop2.hw;

public abstract class Passengers {

    private int passengers;

    public Passengers() {
    }

    public Passengers(int passengers) {
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Passengers{" +
                "passengers=" + passengers +
                '}';
    }
}