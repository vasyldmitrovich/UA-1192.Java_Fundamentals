package com.softserve.edu07.hw.hw2;

public abstract class Passengers {
    private int passengers;

    public Passengers() {
    }

    public abstract int getPassengers();

    public abstract void setPassengers(int passengers);

    @Override
    public String toString() {
        return "Passengers{" +
                "passengers=" + passengers +
                '}';
    }
}
