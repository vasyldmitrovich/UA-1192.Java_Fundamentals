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

    public static void arrSort(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].yearOfProd < cars[j + 1].yearOfProd) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }// Move this method to Apphw


    public static void printArr(Car[] cars) {
        System.out.println("|--------------------------------------------------------------|");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i] + "\n");
        }
        System.out.println("|--------------------------------------------------------------|");

    }// Move this method to Apphw


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

    public static Car[] getCarsByYear(Car[] cars,int userYear) {
        Car [] sortsCar = new Car[cars.length];
        System.out.println("Cars with the specified year:");
        int counter = 0;
        int index = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearOfProd() == userYear) {
                System.out.println(cars[i] + "\n");
                counter++;
                sortsCar[index++]=cars[i];
            }
        }
        if (counter == 0) {
            System.out.println("There are no cars with the specified year of manufacture");
        }
        return Arrays.copyOf(sortsCar,index);
    }// Move this method to Apphw

}
