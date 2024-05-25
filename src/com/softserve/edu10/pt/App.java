package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Demonstrate task 1");
        task1();

    }

    public static void task1() {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(1, "John");
        employeeMap.put(2, "Jane");
        employeeMap.put(3, "Bob");
        employeeMap.put(4, "Mary");
        employeeMap.put(5, "Jack");
        employeeMap.put(6, "Chris");
        employeeMap.put(7, "Janet");

        System.out.println("Enter employee id: ");

        Scanner scanner = new Scanner(System.in);
        int employeeId = scanner.nextInt();

        if (employeeMap.containsKey(employeeId)) {
            System.out.println("Employee with id " + employeeId + " has name " + employeeMap.get(employeeId));
        } else {
            System.out.println("Employee with id " + employeeId + " does not exist");
        }

        System.out.println("Enter employee name: ");
        String name = scanner.next();

        if (employeeMap.containsValue(name)) {
            System.out.println("Employee with name " + name + " has id ");
        } else {
            System.out.println("Employee with name " + name + " does not exist");
        }
    }
}
