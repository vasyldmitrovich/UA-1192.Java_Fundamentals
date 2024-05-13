package com.softserve.edu05.hw;

import java.util.Objects;

public class Car {// Respect it is good

    private String type;
    private int yearOfProd;
    private double engineCapacity;

    public Car(String type, int yearOfProd, double engineCapacity) {
        this.type = type;
        this.yearOfProd = yearOfProd;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProd == car.yearOfProd &&
                Double.compare(engineCapacity, car.engineCapacity) == 0 &&
                Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, yearOfProd, engineCapacity);
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProd=" + yearOfProd +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
