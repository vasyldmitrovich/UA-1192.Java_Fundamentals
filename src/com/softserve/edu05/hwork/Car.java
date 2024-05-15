package com.softserve.edu05.hwork;

public class Car {
    private String type;
    private int year_of_production;
    private double engine_capacity;

    public Car(String type, int year_of_production, double engine_capacity) {
        this.type = type;
        this.year_of_production = year_of_production;
        this.engine_capacity = engine_capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    @Override
    public String toString() {
        return "Car {" +
                "type - " + type +
                ", year of production - " + year_of_production +
                ", engine capacity - " + engine_capacity +
                '}';
    }
}