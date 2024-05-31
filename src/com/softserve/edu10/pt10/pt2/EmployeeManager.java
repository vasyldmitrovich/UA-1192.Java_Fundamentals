package com.softserve.edu10.pt10.pt2;

import java.util.*;

public class EmployeeManager {
    private static Map<String, Employee> employeeMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Edit Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Sort Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    editEmployee(scanner);
                    break;
                case 3:
                    displayEmployees();
                    break;
                case 4:
                    sortEmployees(scanner);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        if (employeeMap.containsKey(id)) {
            System.out.println("Duplicate ID found. Cannot add employee.");
            return;
        }
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Position: ");
        String position = scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dateOfBirth = scanner.nextLine();

        Employee employee = new Employee(id, name, position, salary, dateOfBirth);
        employeeMap.put(id, employee);
        System.out.println("Employee added successfully.");
    }

    private static void editEmployee(Scanner scanner) {
        System.out.print("Enter ID of the employee to edit: ");
        String id = scanner.nextLine();
        if (!employeeMap.containsKey(id)) {
            System.out.println("Employee not found.");
            return;
        }
        Employee employee = employeeMap.get(id);

        System.out.print("Enter new Name (or press Enter to skip): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            employee.setName(name);
        }
        System.out.print("Enter new Position (or press Enter to skip): ");
        String position = scanner.nextLine();
        if (!position.isEmpty()) {
            employee.setPosition(position);
        }
        System.out.print("Enter new Salary (or press Enter to skip): ");
        String salaryInput = scanner.nextLine();
        if (!salaryInput.isEmpty()) {
            double salary = Double.parseDouble(salaryInput);
            employee.setSalary(salary);
        }

        System.out.println("Employee data updated successfully.");
    }

    private static void displayEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees to display.");
            return;
        }
        for (Employee employee : employeeMap.values()) {
            System.out.println(employee);
        }
    }

    private static void sortEmployees(Scanner scanner) {
        System.out.println("Sort by:");
        System.out.println("1. ID");
        System.out.println("2. Name");
        System.out.println("3. Position");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<Employee> employees = new ArrayList<>(employeeMap.values());
        switch (choice) {
            case 1:
                employees.sort(Comparator.comparing(Employee::getId));
                break;
            case 2:
                employees.sort(Comparator.comparing(Employee::getName));
                break;
            case 3:
                employees.sort(Comparator.comparing(Employee::getPosition));
                break;
            default:
                System.out.println("Invalid choice. Returning to main menu.");
                return;
        }

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
