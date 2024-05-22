package com.softserve.edu07.hw.homework2;

public class Liner extends WaterVehicle{

    private int floors;

    public Liner () {
        this.passengers = 10;
        this.floors = 4;
    }

    public Liner (int passenger, int floors) {
        this.passengers = passenger;
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
        System.out.println("The liner is sailing");
    }
}
