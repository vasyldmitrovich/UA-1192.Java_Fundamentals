package com.softserve.edu07.hwork;

public class Plane extends FlyingVehicle{

    private int maxDistance;

    public Plane() {
    }

    public Plane(int passengers, int maxDistance) {
        super(passengers);
        this.maxDistance = maxDistance;
    }

    @Override
    void fly(){
    }

    @Override
    void land(){
    }
}
