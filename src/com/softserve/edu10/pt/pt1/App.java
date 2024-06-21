package com.softserve.edu10.pt.pt1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "employee 1");
        employeeMap.put(102, "employee 2");
        employeeMap.put(103, "employee 3");
        employeeMap.put(104, "employee 4");
        employeeMap.put(105, "employee 5");
        employeeMap.put(106, "employee 6");
        employeeMap.put(107, "employee 7");

        System.out.println("employeeMap:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        System.out.print("\nEnter ID to find employee name: ");
        int id = scanner.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("ID " + id + ": " + employeeMap.get(id));
        } else {
            System.out.println("ID " + id + " not found in employeeMap.");
        }


        scanner.nextLine();
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();
        boolean found = false;
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println("name '" + name + "': " + entry.getKey());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Name '" + name + "' not found in employeeMap.");
        }

        scanner.close();
    }
}

