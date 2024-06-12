package com.softserve.edu07.hw;

import com.softserve.edu05.hw.Car;
import com.softserve.edu07.hw.homework1.ContractEmployee;
import com.softserve.edu07.hw.homework1.Employee;
import com.softserve.edu07.hw.homework1.Payment;
import com.softserve.edu07.hw.homework1.SalariedEmployee;
import com.softserve.edu07.hw.homework2.*;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// All good, nice
        homework1();
        System.out.println("End of first homework");
        homework2();
        System.out.println("End of second homework");
    }

    public static void homework1() {
        Employee [] employees = new Employee[4];
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        ContractEmployee contractEmployee = new ContractEmployee();
        employees [0] = salariedEmployee;
        employees [1] = contractEmployee;
        int fixMonthPay;
        int hourlyRate;
        int hoursWorked;

        System.out.println("Enter the Id for salaried employee");
        String employeeId = sc.nextLine();
        System.out.println("Enter the social security number for salaried employee");
        String socialSecNum = sc.nextLine();
        System.out.println("Enter the name for your salaried employee");
        String name = sc.nextLine();
        System.out.println("Enter the hourly rate for salaried employee");

        try {
            hourlyRate = sc.nextInt();
            System.out.println("Enter hours worked for salaried employee");
            hoursWorked = sc.nextInt();
            employees[2] = new SalariedEmployee(employeeId, socialSecNum, name, hourlyRate, hoursWorked);
            sc.nextLine();
            System.out.println("Enter the Id for contract employee");
            employeeId = sc.nextLine();
            System.out.println("Enter the federal tax id member for contract employee");
            String fedTaxIdmember = sc.nextLine();
            System.out.println("Enter the name for your contract employee");
            name = sc.nextLine();
            System.out.println("Enter the fixed monthly payment for contract employee");
            fixMonthPay = sc.nextInt();
            employees[3] = new ContractEmployee(employeeId, fedTaxIdmember, name, fixMonthPay);
            sc.nextLine();
            // Added InputMismatchException
        } catch (InputMismatchException e) {
            System.out.println("You enter non-float value");
        }

        sortByMonthWage(employees);
        System.out.println(Arrays.toString(employees));
    }

    public static void sortByMonthWage (Employee [] employees) {
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                Employee temp;
                if (((Payment) employees[i]).calculatePay() <= ((Payment) employees[j]).calculatePay()) {
                    temp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = temp;
                }
            }
        }
    }

    public static void homework2 () {
        Vehicle [] vehicles = new Vehicle[6];
        vehicles [0] = new Liner();
        vehicles [1] = new Plane();
        vehicles [2] = new Bus();
        vehicles [3] = new Boat();
        vehicles [4] = new Helicopter();
        vehicles [5] = new Motorcycle();

        for (Vehicle item : vehicles) {
            if (item instanceof WaterVehicle) {
                ((WaterVehicle) item).isSailing();
            } else if (item instanceof FlyingVehicle) {
                ((FlyingVehicle) item).fly();
                ((FlyingVehicle) item).land();
            } else if (item instanceof GroundVehicle) {
                ((GroundVehicle) item).drive();
            }
        }
    }
}
