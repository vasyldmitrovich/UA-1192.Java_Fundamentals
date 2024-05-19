package com.softserve.edu07_oop2.hw;

public class Boat extends WaterVechicle{

    private int volume;

    public Boat() {
    }

    public Boat(int volume) {
        this.volume = volume;
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
    void isSailing() {

    }

    @Override
    public String toString() {
        return "Boat{" +
                "volume=" + volume +
                '}';
    }
}
