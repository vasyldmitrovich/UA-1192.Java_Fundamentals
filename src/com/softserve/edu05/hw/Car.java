package com.softserve.edu05.hw;

import java.util.Objects;
import java.util.Scanner;

public class Car {
    private String type;// Why public ???
    private int yearOfProduction;
    private double engineCapacity;

    private static final Scanner SCANNER = new Scanner(System.in);

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public static int getInfo(String prompt) {
        System.out.println(prompt);
        return SCANNER.nextInt();
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
        return yearOfProduction == car.yearOfProduction && Double.compare(car.engineCapacity, engineCapacity) == 0 && Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, yearOfProduction, engineCapacity);
    }
}
