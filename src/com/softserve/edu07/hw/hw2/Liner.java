package com.softserve.edu07.hw.hw2;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int floors, int passengers) {
        setPassengers(passengers);
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        if (getPassengers() > 30) {
            System.out.println(getClass().getSimpleName() + " is in cruising");
        } else System.out.println(getClass().getSimpleName() + " staying in port");

    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void info() {
        String gap = "\n";
        System.out.println("-".repeat(40) + gap + "Type: " + getClass().getSimpleName() + gap +
                "Floors: " + getFloors() + gap + "Passengers: " + getPassengers() + gap);
        isSailing();
        System.out.println(gap + "-".repeat(40));
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
