package com.softserve.edu07.hw.hw2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int floors, int passengers) {
        setPassengers(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
            System.out.println(getClass().getSimpleName() + " in sea");
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void info() {

        System.out.println("Type: " + getClass().getSimpleName() + "\n Floors: " + getFloors() + "" + "\n Passengers: " + getPassengers());
        isSailing();
        System.out.println("-------------------");
    }

    @Override
    public int getPassengers() {
        return super.getPassengers();
    }

    @Override
    public void setPassengers(int passengers) {
        super.setPassengers(passengers);
    }
}