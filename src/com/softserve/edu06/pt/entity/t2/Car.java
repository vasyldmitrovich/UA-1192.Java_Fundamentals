package com.softserve.edu06.pt.entity.t2;


public class Car {// Maybe this class should be abstract
    private String model;
    private float maxSpeed;
    private String yearOfProduction;

    public void run(){
    }
    public void stop(){
    }

    public Car() {
    }

    public Car(String model, float maxSpeed, String yearOfProduction) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                '}';
    }
}
