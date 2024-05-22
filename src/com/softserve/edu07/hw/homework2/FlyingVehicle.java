package com.softserve.edu07.hw.homework2;

public abstract class FlyingVehicle extends Passengers implements Vehicle {

    public FlyingVehicle () {
        this.passengers = 5;
    }

    public FlyingVehicle (int passenger) {
        this.passengers = passenger;
    }

    public void fly() {
        System.out.println("The vehicle takes off");
    }

    public void land() {
        System.out.println("The vehicle lands");
    }
}
