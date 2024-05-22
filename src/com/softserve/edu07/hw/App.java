package com.softserve.edu07.hw;

import com.softserve.edu06.pt.Truck;
import com.softserve.edu07.hw.employee.ContractEmployee;
import com.softserve.edu07.hw.employee.Employee;
import com.softserve.edu07.hw.employee.SalariedEmployee;
import com.softserve.edu07.hw.vehicle.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {

    public static final Random RAND = new Random(System.currentTimeMillis());
    private static final String[] NAMES = {"Nick", "Rosaline", "Mike", "Shone", "Elizabeth"};

    private static final double FIXED_HOURLY_SALARY = 200;

    public static void main(String[] args) {// Good
        System.out.println("Task 1");
        demonstrateEmployeeTask();
        System.out.println();

        System.out.println("Task 2");
        demonstrateVehicleTask();
    }

    private static void demonstrateEmployeeTask() {
        List<Employee> employees = generateEmployees(6);
        //default sorting by worker's month salary in descending order
        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println("\t" + employee);
        }

        printAverageSalaries();
    }

    private static List<Employee> generateEmployees(int size) {
        List<Employee> employees = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            Employee employee;
            String name = NAMES[RAND.nextInt(NAMES.length)];

            if (RAND.nextBoolean()) {
                employee = new SalariedEmployee(name, FIXED_HOURLY_SALARY);
            } else {
                double hourlyRate = (RAND.nextInt(200) + 100) + RAND.nextDouble();
                int workingHours  = RAND.nextInt(200) + 50;
                employee = new ContractEmployee(name, hourlyRate, workingHours);

            }

            employee.setEmployeeId(String.valueOf(i));
            employees.add(employee);
        }

        return employees;
    }

    private static void printAverageSalaries() {
        double salariedAverage = SalariedEmployee.calculateSalariedWorkersAverageRate();
        double contractAverage = ContractEmployee.calculateContractWorkersAverageRate();
        double allWorkersAverage = Employee.calculateAllWorkersAverageRate();

        System.out.printf("Average salaried workers rate per hour: %.2f%n", salariedAverage);
        System.out.printf("Average contract workers rate per hour: %.2f%n", contractAverage);
        System.out.printf("Average all workers rate per hour: %.2f%n", allWorkersAverage);
    }

    private static void demonstrateVehicleTask() {
        List<Vehicle> vehicles = getAllVehicleTypes();

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getClass().getSimpleName() + ": ");

            if (vehicle instanceof Passengers) {
                System.out.println("Passengers in vehicle: " +
                        ((Passengers) vehicle).getPassengers());
            }

            if (vehicle instanceof WaterVehicle) {
                ((WaterVehicle) vehicle).isSailing();
            } else if (vehicle instanceof FlyingVehicle) {
                ((FlyingVehicle) vehicle).fly();
            } else if (vehicle instanceof GroundVehicle) {
                ((GroundVehicle) vehicle).drive();
            } else {
                System.out.println("Unknown vehicle type...");
            }

            System.out.println();
        }
    }

    private static List<Vehicle> getAllVehicleTypes() {
        List<Vehicle> vehicles = new ArrayList<>(7);
        vehicles.add(new Liner());
        vehicles.add(new Boat());
        vehicles.add(new Plane());
        vehicles.add(new Helicopter());
        vehicles.add(new Bus());
        vehicles.add(new Motorcycle());
        vehicles.add(new Car());
        return vehicles;
    }
}
