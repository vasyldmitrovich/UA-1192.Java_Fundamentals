package com.softserve.edu05.hw;

import java.util.Objects;

public class Car {// Good

    private String type;
    private int productionYear;
    private int capacity;

    public Car() {
    }

    public Car(String type, int productionYear, int capacity) {
        this.type = type;
        this.productionYear = productionYear;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear && capacity == car.capacity && Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, productionYear, capacity);
    }

    @Override
    public String toString() {
        return type + " - " + productionYear;
    }
}
