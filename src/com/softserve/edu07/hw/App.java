package com.softserve.edu07.hw;

import com.softserve.edu07.hw.vehicle.*;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        System.out.println("Task 1: ");
        task1Hw();
        System.out.println("Task 2: ");
        task2Hw();
    }

    public static void task1Hw() {
        Employee[] employees = {
                new SalariedEmployee("John", "120SD13", 50, 160, "1NJD32NLWQ3"),
                new SalariedEmployee("Bob", "09KLL12", 60, 140, "123SKDJ12"),
                new ContractEmployee("Dave", "844ODS0", 9600.50, "18293DM"),
                new ContractEmployee("Max", "012SDK2", 11200.30, "827DKS3")
        };
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println("EmployeeID: " + employee.getEmployeeId() + ", name: " + employee.getName() + ", average monthly wage: " + employee.calculatePay());
        }
    }

    public static void task2Hw() {
        Passengers[] passengers = {
                new Liner(250, 3),
                new Boat(10, 300),
                new Plane(190, 800),
                new Helicopter(8, 4000, 3),
                new Bus(15, "Berlin-Munich"),
                new Motorcycle(1, 140),
                new Car(3, "Tesla")
        };
        for (var passenger : passengers) {
            if (passenger instanceof FlyingVehicle) {
                ((FlyingVehicle) passenger).fly();
                ((FlyingVehicle) passenger).land();
                System.out.println("=".repeat(50));
            }
            if (passenger instanceof WaterVehicle) {
                ((WaterVehicle) passenger).isSailing();
                System.out.println("=".repeat(50));
            }
            if (passenger instanceof GroundVehicle) {
                ((GroundVehicle) passenger).drive();
                System.out.println("=".repeat(50));
            }
        }
    }
}
