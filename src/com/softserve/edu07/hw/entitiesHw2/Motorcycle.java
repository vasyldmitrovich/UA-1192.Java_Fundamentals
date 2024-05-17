package com.softserve.edu07.hw.entitiesHw2;

public class Motorcycle extends GroundVehicle{
    private int maxSpeed;
    public Motorcycle(int passengers, int maxSpeed) {
        super(passengers);
        this.maxSpeed=maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    void drive() {
        System.out.println("I'm driving motorcycle with max speed "+maxSpeed+" with "+ getPassengers()+" passengers");
    }
}
