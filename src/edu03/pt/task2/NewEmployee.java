package edu03.pt.task2;
import edu03.pt.task2.Employee;

import java.util.Scanner;

public class NewEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee1 = createEmployee(scanner);
        Employee employee2 = createEmployee(scanner);
        Employee employee3 = createEmployee(scanner);

        System.out.println("Total salary of all employees: " + Employee.getTotalSum());
    }

    // Method to create an Employee object with user input
    public static Employee createEmployee(Scanner scanner) {
        System.out.println("Enter employee name:");
        String name = scanner.nextLine();
        System.out.println("Enter employee hourly rate:");
        double rate = scanner.nextDouble();
        System.out.println("Enter number of hours worked:");
        double hours = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        return new Employee(name, rate, hours);
    }

}







