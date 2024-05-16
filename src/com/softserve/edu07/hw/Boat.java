package com.softserve.edu07.hw;

class Boat extends WaterVehicle {
    private int volume;

    public Boat() {
        this.volume = 100;
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
