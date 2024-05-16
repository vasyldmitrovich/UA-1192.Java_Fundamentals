package com.softserve.edu07.hw;

class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
        this.floors = 1;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("Liner is sailing");
    }
}
