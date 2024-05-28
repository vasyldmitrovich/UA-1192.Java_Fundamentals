package com.softserve.edu07_oop2.hw.hw2;

public class Boat extends Passengers implements WaterVehicle {
    private int volume;

    public Boat(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean isSailing() {
        // Implement logic for sailing
        return true;
    }
}





