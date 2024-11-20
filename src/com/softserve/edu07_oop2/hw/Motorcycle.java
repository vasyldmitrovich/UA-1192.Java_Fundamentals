package com.softserve.edu07_oop2.hw;

public class Motorcycle extends GroundVechicle{

    private int maxSpeed;

    public Motorcycle() {
    }

    public Motorcycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {

    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
