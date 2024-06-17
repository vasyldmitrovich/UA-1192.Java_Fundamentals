package com.softserve.edu07.hw.hw2;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int volume, int passengers) {
        setPassengers(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void isSailing() {
        System.out.println(getClass().getSimpleName() + " is sailing");
    }

    public void info() {
        System.out.println("Type: " + getClass().getSimpleName() + "\nVolume: " + getVolume() + "\nPassengers: " + getPassengers());
        isSailing();
        System.out.println("-------------------");
    }
}
