package com.softserve.edu07.hw;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        System.out.println("\nDemonstrate task 1\n");
        task1();// This is good

        System.out.println("\nDemonstrate task 2\n");
        task2();// And this task is good
    }

    public static void task1() {
        Employee[] employees = {
                new ContractEmployee("id-1", 10, 40, "12345"),
                new SalariedEmployee("id-2", 1000, "sec-234"),
                new ContractEmployee("id-3", 15, 35, "12346"),
                new SalariedEmployee("id-4", 5000, "sec-235"),
        };

        Arrays.sort(employees, (o1, o2) -> {
            if ((o1 instanceof ContractEmployee || o1 instanceof SalariedEmployee) &&
                    (o2 instanceof ContractEmployee || o2 instanceof SalariedEmployee)) {

                return (int) (((Payment) o2).calculatePay() - ((Payment) o1).calculatePay());

            }
            throw new ClassCastException();
        });

        System.out.println("Employees sorted buy average pay in descending order");

        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeId());
        }

    }

    public static void task2() {
        Vehicle[] vehicles = {
                new Boat(),
                new Liner(),
                new Plane(),
                new Helicopter(),
                new Bus(),
                new Motorcycle(),
                new Car(),
        };

        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof WaterVehicle) {
                ((WaterVehicle) vehicle).isSailing();
            }
            if (vehicle instanceof FlyingVehicle) {
                ((FlyingVehicle) vehicle).fly();
                ((FlyingVehicle) vehicle).land();
            }
            if (vehicle instanceof GroundVehicle) {
                ((GroundVehicle) vehicle).drive();
            }
        }
    }
}
