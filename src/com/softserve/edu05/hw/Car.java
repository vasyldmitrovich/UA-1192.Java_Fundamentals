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


    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    static void sort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                if (cars[j].getYearOfProduction() < cars[j + 1].getYearOfProduction()) {
                    var swap = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = swap;
                }
            }
        }

    }
}
