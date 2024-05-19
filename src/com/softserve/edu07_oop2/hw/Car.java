package com.softserve.edu07_oop2.hw;

public class Car extends GroundVechicle{

    private String model;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(int passengers, String model) {
        super(passengers);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void drive() {

    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
