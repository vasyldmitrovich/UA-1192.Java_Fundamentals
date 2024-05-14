package com.softserve.edu05.hw;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String toString() {
        return "Type: " + type + ", Year of Production: " + yearOfProduction + ", Engine Capacity: " + engineCapacity;
    }
}
