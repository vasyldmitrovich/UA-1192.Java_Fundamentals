package com.softserve.edu05.hw;

public class Car {

    private String type;
    private int yearOfProduction;
    private int engineCapacity;

    public Car() {
    }

    public Car(String type, int yearOfProduction, int engineCapacity) {
        this.engineCapacity = engineCapacity;
        this.type = type;
        this.yearOfProduction = yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}

