package com.softserve.edu07.hw.vehicle;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passenger, int volume) {
        super(passenger);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        System.out.println("Boat is sailing now, it has " + volume + " volume and " + getPassenger() + " passengers!");
    }
}
