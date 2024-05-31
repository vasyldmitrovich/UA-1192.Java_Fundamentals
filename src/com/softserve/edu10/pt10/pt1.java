package com.softserve.edu10.pt10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pt1 {

    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        employeeMap.put(104, "David");
        employeeMap.put(105, "Eve");
        employeeMap.put(106, "Frank");
        employeeMap.put(107, "Grace");

        System.out.println("Employee Map: " + employeeMap);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an ID to find the corresponding name: ");
        int id = scanner.nextInt();

        if (employeeMap.containsKey(id)) {
            System.out.println("The name corresponding to ID " + id + " is " + employeeMap.get(id));
        } else {
            System.out.println("ID " + id + " not found in the map.");
        }

        System.out.print("Enter a name to find the corresponding ID: ");
        scanner.nextLine();
        String name = scanner.nextLine();

        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("The ID corresponding to name " + name + " is " + entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("Name " + name + " not found in the map.");
        }

    }
}
