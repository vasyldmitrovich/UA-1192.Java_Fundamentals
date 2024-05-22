package com.softserve.edu07.hw.homework2;

public abstract class GroundVehicle extends Passengers implements Vehicle{

    public GroundVehicle () {
        this.passengers = 20;
    }

    public GroundVehicle (int passengers) {
        this.passengers = passengers;
    }

    public void drive() {
        System.out.println("The vehicle drives");
    }
}
