package com.softserve.edu07.hw.vehicle;

public class Boat extends WaterVehicle {

    private int volume;

    public Boat() {
        volume = 3;
        passengers = 2;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void isSailing() {
        if (passengers == 0) {
            System.out.println("No driver in the boat");
        } else if (passengers > 5) {
            System.out.println("Can't sail, too many people");
        } else {
            System.out.println("Sailing...");
        }
    }
}
