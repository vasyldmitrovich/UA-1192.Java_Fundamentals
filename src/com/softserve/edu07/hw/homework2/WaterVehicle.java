package com.softserve.edu07.hw.homework2;

public abstract class WaterVehicle extends Passengers implements Vehicle{

    public WaterVehicle () {
        this.passengers = 10;
    }

    public WaterVehicle (int passengers) {
        this.passengers = passengers;
    }

    public void isSailing() {
        System.out.println("The vehicle is sailing");
    }
}
