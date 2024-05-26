package com.softserve.edu07.hw.hw2;

public class Motorcycle extends GroundVehicle {
    int maxSpeed;

    Motorcycle(int maxSpeed, int passengers) {
        this.setPassengers(passengers);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void drive() {
        if (getPassengers() <= 0) {
            System.out.println("Motorcycle is on parkingspace");
        } else System.out.println("Motorcycle is riding");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void info() {
        String gap = "\n";
        System.out.println("-".repeat(40) + gap + "Type: " + getClass().getSimpleName() + gap + "Passengers: " + getPassengers() +
                gap + "Max speed: " + getMaxSpeed() + gap);
        drive();
        System.out.println(gap + "-".repeat(40));
    }
}
