package com.softserve.edu09_10_collec.pt10.pt2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EmployeeMap employeeMap = new EmployeeMap();
        Scanner scanner = new Scanner(System.in);

        // Add employees to the map
        employeeMap.addEmployee(new Employee(101, "Alice", "Manager", 50000.0, "1990-01-01"));
        employeeMap.addEmployee(new Employee(102, "Bob", "Developer", 60000.0, "1995-02-02"));
        employeeMap.addEmployee(new Employee(103, "Charlie", "Designer", 55000.0, "1988-03-03"));

        // Display contents of the map
        employeeMap.displayEmployeeMap();

        // Prompt user to enter ID and edit employee details
        System.out.print("\nEnter ID to edit (e.g., 101): ");
        int idToEdit = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        if (employeeMap.containsId(idToEdit)) {
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();

            System.out.print("Enter new position: ");
            String newPosition = scanner.nextLine();

            System.out.print("Enter new salary: ");
            double newSalary = scanner.nextDouble();
            scanner.nextLine(); // Consume newline left-over

            employeeMap.editEmployee(idToEdit, newName, newPosition, newSalary);
        } else {
            System.out.println("Employee with ID " + idToEdit + " not found.");
        }

        // Prompt user to choose sorting criterion and sort the map
        System.out.print("\nEnter sorting criterion (id/name/position): ");
        String sortBy = scanner.nextLine();
        employeeMap.sortBy(sortBy);

        scanner.close();
    }
}
