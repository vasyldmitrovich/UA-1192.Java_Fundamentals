package com.softserve.edu07.hw.travel;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner() {
        setPassengers(300);
        System.out.println("Liner is created. Number of passengers: " + getPassengers());
    }

    @Override
    public void isSailing() {
        System.out.println("Liner is sailing");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}
