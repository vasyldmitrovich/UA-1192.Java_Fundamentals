package com.softserve.edu07.hw.vehicle;

public class Liner extends WaterVehicle {

    private static final int AVERAGE_TEAM = 50;

    private int floors;

    public Liner() {
        passengers = AVERAGE_TEAM;
        floors = 3;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        if (floors < 1) {
            floors = 1;
        }
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        if (passengers == 0) {
            System.out.println("No passengers are here. Standing in docks");
        } else if (passengers > AVERAGE_TEAM) {
            System.out.println("Many people are here. It's travel, liner's sailing");
        } else {
            System.out.println("Only team on the liner. Standing in port");
        }
    }
}
