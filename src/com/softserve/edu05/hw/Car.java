package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Car {
    public static Scanner scanner = new Scanner(System.in);
    private String type;
    private int yearOfProd;
    private int endineCapacity;

    private Car() {

    }

    public Car(String type, int yearOfProd, int endineCapacity) {
        this.type = type;
        this.yearOfProd = yearOfProd;
        this.endineCapacity = endineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public void setYearOfProd(int yearOfProd) {
        this.yearOfProd = yearOfProd;
    }

    public int getEndineCapacity() {
        return endineCapacity;
    }

    public void setEndineCapacity(int endineCapacity) {
        this.endineCapacity = endineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProd=" + yearOfProd +
                ", endineCapacity=" + endineCapacity +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfProd == car.yearOfProd && endineCapacity == car.endineCapacity && Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, yearOfProd, endineCapacity);
    }


}
