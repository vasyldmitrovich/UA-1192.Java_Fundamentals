package com.softserve.edu10.pt;

import java.util.*;

public class App {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();

    }

    public static void task1() {

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(123, "Lina");
        employeeMap.put(546, "Olga");
        employeeMap.put(854, "Kira");
        employeeMap.put(852, "Sonya");
        employeeMap.put(742, "Liza");
        employeeMap.put(519, "Mary");
        employeeMap.put(927, "Inna");

        System.out.println(employeeMap);
        int id = scan.nextInt();

        if (employeeMap.containsKey(id)) {

            System.out.println("Name for ID" + id + ":" + employeeMap.get(id));
        } else {
            System.out.println("ID" + id + "\n" +
                    "not found\n");
        }

        System.out.print("Enter name to find: ");

        scan.nextLine();  // Читаємо новий рядок після nextInt()
        String name = scan.nextLine();
        if ((employeeMap.containsValue(name))) {

            for (var entry : employeeMap.entrySet()) {

                if (entry.getValue().equals(name)) {
                    System.out.println(entry.getKey() + ":" + "name");

                }
                System.out.println("There is no employee with name: " + name);
            }
        }
    }

    public static void task2() {

        Map<Integer, Employee> employeeMap = new HashMap<>();
        while (employeeMap.size() < 3) {
            System.out.print("\nEnter employee ID: ");
            int id = scan.nextInt();
            System.out.print("Enter employee name: ");
            String name = scan.next();
            System.out.print("Enter employee position: ");
            String position = scan.next();
            System.out.print("Enter employee salary: ");
            double salary = scan.nextDouble();
            System.out.print("Enter employee date of birth: ");
            String dob = scan.next();




            Employee employee = new Employee(name, position, salary,dob);
            employeeMap.put(id, employee);
        }

        System.out.println("\nEmployee Details:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey());
            Employee employee = entry.getValue();
            System.out.println("Name: " + employee.getName());
            System.out.println("Position: " + employee.getPosition());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Date of Birth: " + employee.getDateOfBirth());

        }
    }
}











