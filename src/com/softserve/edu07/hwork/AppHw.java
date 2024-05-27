package com.softserve.edu07.hwork;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class AppHw {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        Employee[] employees = {
                new SalariedEmployee("AD345", "Marina", "RET5436", 50.0, 100),
                new SalariedEmployee("AD970", "Olena", "GO89UI", 40.0, 150),
                new ContractEmployee("AS345", "Tanya", "HP8940", 2000),
                new ContractEmployee("AS832", "Ira", "UI546N", 3000)
        };

        Arrays.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());

        for (Employee employee : employees) {
            System.out.println("Employee ID is: " + employee.getEmployeeId() +
                    ". Employee name is: " + employee.getName() +
                    ". Average monthly wage of employee is: " + employee.calculatePay());
        }
    }

    public static void task2() {
        Passengers[] passengers = {
                new Liner(200, 2),
                new Boat(7, 150),
                new Plane(100, 1000),
                new Helicopter(6, 3000, 4),
                new Bus(30, "Kyiv - Lviv"),
                new Motorcycle(2, 150),
                new Car(5, "Subaru")
        };

        for (var passenger : passengers) {
            if (passenger instanceof WaterVehicle) {
                ((WaterVehicle) passenger).isSailing();
            }
            if (passenger instanceof FlyingVehicle) {
                ((FlyingVehicle) passenger).fly();
                ((FlyingVehicle) passenger).land();
            }
            if (passenger instanceof GroundVehicle) {
                ((GroundVehicle) passenger).drive();
            }
        }
    }
}
