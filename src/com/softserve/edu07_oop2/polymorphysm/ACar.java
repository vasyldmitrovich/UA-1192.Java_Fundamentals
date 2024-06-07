package com.softserve.edu07_oop2.polymorphysm;

public abstract class ACar {
    private double maxSpeed;

    public double getMaxSpeed( ) { return maxSpeed; }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    abstract void carRides( );
}
