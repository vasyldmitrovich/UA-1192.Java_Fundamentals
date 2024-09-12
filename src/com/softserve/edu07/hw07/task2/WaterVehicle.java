package com.softserve.edu07.hw07.task2;

public class WaterVehicle implements Vehicle {
    public void isSailing() {
        System.out.println("The water vehicle is sailing.");
    }

    @Override
    public void drive() {
        isSailing();
    }
}
