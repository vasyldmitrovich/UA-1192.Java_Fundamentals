package com.softserve.edu07.hw.task72;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;

    public Motorcycle(){}


    @Override
    public void drive() {
        System.out.println("The motorcycle is going");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
