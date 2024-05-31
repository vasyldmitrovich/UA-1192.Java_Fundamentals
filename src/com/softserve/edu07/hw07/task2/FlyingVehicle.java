package com.softserve.edu07.hw07.task2;

public class FlyingVehicle implements Vehicle {
    public void fly() {
        System.out.println("The flying vehicle is flying.");
    }

    public void land() {
        System.out.println("The flying vehicle is landing.");
    }

    @Override
    public void drive() {
        fly();
    }
}
