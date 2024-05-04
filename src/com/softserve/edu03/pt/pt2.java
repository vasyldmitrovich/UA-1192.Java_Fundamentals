package com.softserve.edu03.pt;

import java.util.Scanner;

public class pt2 {
    /**
     This is a practical TASK 2.
     This class creates 3 objects of employees,
     calculating salaries based on the entered data on
     rate and hours.
     A bonus of 10 is also calculated

     Author: Andrew Tandyriak
     */
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        Employee Employee1 = createEmployee(scanner, 1);
        Employee Employee2 = createEmployee(scanner, 2);
        Employee Employee3 = createEmployee(scanner, 3);

        System.out.println("Employee 1: " + Employee1);
        System.out.println("Employee 2: " + Employee2);
        System.out.println("Employee 3: " + Employee3);

        System.out.println("Total salary of all employees: " + Employee.getTotalSum() + Employee.getTotalSum() * Employee2.getBonusPercent());

        scanner.close();
    }

    private static Employee createEmployee(Scanner scanner, int EmployeeNum) {
        System.out.println("Details of employee " + EmployeeNum + ":");
        System.out.print("Full name: ");

        while (!scanner.hasNext()) {
            System.out.println("Enter a valid full name.");
            scanner.next();
            System.out.print("Full name: ");
        }
        String name = scanner.nextLine();

        System.out.print("Rate: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Enter a valid rate.");
            scanner.next();
            System.out.print("Rate: ");
        }
        double rate = scanner.nextDouble(); // Read the valid input after the loop
        scanner.nextLine();

        System.out.print("Hours: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Enter a valid hours.");
            scanner.next();
            System.out.print("Hours: ");
        }
        double hours = scanner.nextDouble();
        scanner.nextLine();

        return new Employee(name, rate, hours);
    }
}
