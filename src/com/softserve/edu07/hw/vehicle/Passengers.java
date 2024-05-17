package com.softserve.edu07.hw.vehicle;

public abstract class Passengers {
    private int passengers;


    public Passengers(int passenger) {
        this.passengers = passenger;
    }

    public int getPassenger() {
        return passengers;
    }

    public void setPassenger(int passenger) {
        this.passengers = passenger;
    }
}
