package com.softserve.edu07.hw.entitiesHw2;

public class Boat extends WaterVehicle{
    private int volume;
    public Boat(int passenger,int volume){
        super(passenger);
        this.volume=volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    void isSailing() {
        System.out.printf("I'm  Sailing"+"\nI have %d passengers and %d volume\n",getPassengers(),volume);
    }
}
