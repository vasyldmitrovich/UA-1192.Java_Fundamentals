package com.softserve.edu10.ptask;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppPt {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {// Good all is nice
        task1();
        task2();
    }

    public static void task1() {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Dima");
        employeeMap.put(2, "Maks");
        employeeMap.put(3, "Sasha");
        employeeMap.put(4, "Ivan");
        employeeMap.put(5, "Stepan");
        employeeMap.put(6, "Mykola");
        employeeMap.put(7, "Roman");

        System.out.println(employeeMap);

        System.out.println("Enter ID to find: ");
        int id = Integer.parseInt(scan.nextLine());

        if (employeeMap.containsKey(id)) {
            System.out.println("Employee with ID: " + id + " is" + employeeMap.get(id));
        } else {
            System.out.println("There is no employee with ID: " + id);
        }

        System.out.println("Enter name to find: ");

        String name = scan.nextLine().trim();
        if (employeeMap.containsValue(name)) {
            for (var entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println(entry.getKey() + ": " + name);
                }
            }
        } else {
            System.out.println("There is no employee with name: " + name);
        }

    }

    public static void task2() {
        var system = new EmployeeManagementSystem();
        system.run();
    }
}


