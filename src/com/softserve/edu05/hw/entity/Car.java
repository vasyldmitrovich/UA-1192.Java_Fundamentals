package com.softserve.edu05.hw.entity;

import com.softserve.edu05.pt.entity.Employee;

import java.util.Comparator;

public class Car implements Comparable<Car> {
    private String type;
    private String yearOfProduction;
    private int engineCapacity;

    public Car() {
    }

    public Car(String type, String yearOfProduction, int engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(String yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction='" + yearOfProduction + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return this.yearOfProduction.compareTo(o.yearOfProduction);
    }// Ok
}
