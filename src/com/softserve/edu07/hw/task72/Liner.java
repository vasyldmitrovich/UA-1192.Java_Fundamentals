package com.softserve.edu07.hw.task72;

public class Liner extends WaterVehicle{
    private int floors;


    public Liner(){}

    @Override
    public void isSailing(){
        System.out.println("The liner is sailing");
    }

    public int getFloors(){
        return floors;
    }

    public void setFloors(int floors){
        this.floors = floors;
    }
}
