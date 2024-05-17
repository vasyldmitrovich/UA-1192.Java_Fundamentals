package com.softserve.edu07.hw.entitiesHw2;

public abstract class WaterVehicle extends Passengers implements Vehicle{
    public WaterVehicle(int passengers){
        super(passengers);
    }
     abstract void isSailing();
}
