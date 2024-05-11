package com.softserve.edu05.hw;

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
    }

    public static void printArr(Car[] cars) {
        System.out.println("|--------------------------------------------------------------|");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i] + "\n");
        }
        System.out.println("|--------------------------------------------------------------|");

    }

    public static void getCarsByYear(Car[] cars) {
        System.out.println("Enter the year of manufacture of the car to search");
        int userYear = scanner.nextInt();
        System.out.println("Cars with the specified year:");
        int counter = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearOfProd() == userYear) {
                System.out.println(cars[i] + "\n");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("There are no cars with the specified year of manufacture");
        }
    }
}
