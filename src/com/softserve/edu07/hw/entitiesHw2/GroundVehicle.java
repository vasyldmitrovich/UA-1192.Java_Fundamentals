package com.softserve.edu07.hw.entitiesHw2;

public abstract class GroundVehicle extends Passengers implements  Vehicle{
   public GroundVehicle(int passengers){
       super(passengers);
   }
   abstract void drive();
}
