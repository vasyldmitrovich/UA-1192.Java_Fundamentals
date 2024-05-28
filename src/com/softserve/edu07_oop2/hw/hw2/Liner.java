package com.softserve.edu07_oop2.hw.hw2;

public class Liner extends Passengers implements WaterVehicle {
    private int floors;

    public Liner(int floors) {
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public boolean isSailing() {
        // Implement logic for sailing
        return true;
    }
}







