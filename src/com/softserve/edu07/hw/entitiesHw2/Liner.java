package com.softserve.edu07.hw.entitiesHw2;

public class Liner extends WaterVehicle{

    private int floors;
    public Liner(int passengers,int floors){
        super(passengers);
        this.floors = floors;
    }

    @Override
    void isSailing() {
        System.out.printf("I'm not Sailing"+"\nI have %d passengers and %d flours\n",getPassengers(),floors);
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
