package com.softserve.edu07.hw.task72;

public class Boat extends WaterVehicle{
    private int volume;


    public Boat(){}

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    @Override
    public void isSailing(){
        System.out.println("The boat is sailing");
    }


}
