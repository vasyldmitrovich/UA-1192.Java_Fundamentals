package com.softserve.edu07.hw.hw2;

public class Motorcycle extends GroundVehicle {
    int maxSpeed;

    Motorcycle(int maxSpeed, int passengers) {
        this.setPassengers(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
            System.out.println("On the rode");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void info() {
        System.out.println("Type: " + getClass().getSimpleName() + "\nPassengers: " + getPassengers() +
                "\nMax speed: " + getMaxSpeed());
        drive();
        System.out.println("-------------------");
    }
}