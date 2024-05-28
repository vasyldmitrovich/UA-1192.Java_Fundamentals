package com.softserve.edu07_oop2.hw02;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat() {
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {

    }
}
