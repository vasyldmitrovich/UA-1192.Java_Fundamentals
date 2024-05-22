package com.softserve.edu07.hw.homework2;

public class Boat extends WaterVehicle{

    private int volume;

    public Boat () {
        this.passengers = 2;
        this.volume = 3;
    }

    public Boat (int passenger, int volume) {
        this.passengers = passenger;
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
        System.out.println("The boat is sailing");
    }
}
