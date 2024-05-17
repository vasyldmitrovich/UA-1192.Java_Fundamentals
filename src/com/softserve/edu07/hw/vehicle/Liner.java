package com.softserve.edu07.hw.vehicle;

public class Liner extends WaterVehicle {

    private int floors;

    public Liner(int passenger, int floors) {
        super(passenger);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }


    @Override
    public void isSailing() {
        System.out.println("Liner is sailing now, it has " + floors + " floors and " + getPassenger() + " passengers!");
    }
}
