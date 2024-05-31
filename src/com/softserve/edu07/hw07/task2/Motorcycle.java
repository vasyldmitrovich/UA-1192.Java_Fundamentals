package com.softserve.edu07.hw07.task2;

public class Motorcycle extends GroundVehicle {
    private String model;
    private int maxHeight;

    public Motorcycle() {
        this.model = "";
        this.maxHeight = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }
}
