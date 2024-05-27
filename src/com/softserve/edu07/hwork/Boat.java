package com.softserve.edu07.hwork;

public class Boat extends WaterVehicle{

    private int volume;

    public Boat() {
    }

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing(){
    }
}
