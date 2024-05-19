package com.softserve.edu07_oop2.hw;

public class Liner extends WaterVechicle{

    private int floors;

    public Liner() {
    }

    public Liner(int floors) {
        this.floors = floors;
    }

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    void isSailing() {

    }

    @Override
    public String toString() {
        return "Liner{" +
                "floors=" + floors +
                '}';
    }
}
