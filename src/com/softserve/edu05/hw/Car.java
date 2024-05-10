package com.softserve.edu05.hw;

import java.util.Objects;

public class Car {

    private String type;
    private int yearOfProduction;
    private int engineCapacity;

    Car () {
        this.type = "BMW Q8";
        this.yearOfProduction = 2012;
        this.engineCapacity = 2995;
    }


    Car (String type, int yearOfProduction, int engineCapacity) {
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

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
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
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && engineCapacity == car.engineCapacity && Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, yearOfProduction, engineCapacity);
    }
}
