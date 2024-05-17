package com.softserve.edu07.hw.entitiesHw2;

public class Car extends GroundVehicle{
    private String model;
    public Car(int passengers,String model) {
        super(passengers);
        this.model=model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {
        System.out.println("I'm driving car "+model+" with "+ getPassengers()+" passengers");
    }
}
