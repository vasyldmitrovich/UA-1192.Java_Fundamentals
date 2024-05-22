package com.softserve.edu07.hw.homework2;

public class Motorcycle extends GroundVehicle{

    private int maxSpeed;

    public Motorcycle () {
        this.passengers = 1;
        this.maxSpeed = 300;
    }

    public Motorcycle (int passengers, int maxSpeed) {
        this.passengers = passengers;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        System.out.println("The motorcycle drives");
    }
}
