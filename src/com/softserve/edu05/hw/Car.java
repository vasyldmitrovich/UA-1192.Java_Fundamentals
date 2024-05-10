package com.softserve.edu05.hw;

import java.util.Objects;

public class Car {

    private CarType type;

    private int yearOfProduction;

    float engineCapacity;

    public Car() {
        this.type = null;
        this.yearOfProduction = 0;
        this.engineCapacity = 0;
    }

    public Car(CarType type, int yearOfProduction, float engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProduction == car.yearOfProduction && Float.compare(engineCapacity, car.engineCapacity) == 0 && type == car.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, yearOfProduction, engineCapacity);
    }
}
