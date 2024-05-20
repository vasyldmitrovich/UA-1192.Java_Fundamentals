package com.softserve.edu07.hw.travel;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat() {
        setPassengers(15);
        System.out.println("Boat is created. Number of passengers: " + getPassengers());
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Boat is sailing");
    }
}
