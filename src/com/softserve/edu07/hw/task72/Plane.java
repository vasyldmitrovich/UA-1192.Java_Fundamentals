package com.softserve.edu07.hw.task72;

public class Plane extends FlyingVehicle{
    private int maxDistance;

    public Plane(){}

    @Override
    public void fly() {
        System.out.println("The plane is flying");
    }

    @Override
    public void land() {
        System.out.println("The plane is landing");
    }


}
