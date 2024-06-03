package com.softserve.edu10.pt;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
//        task1();
        var register = new EmployeeManagementSystem();
        register.run();

    }

    public static void task1() {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "John");
        employeeMap.put(2, "Bob");
        employeeMap.put(3, "Peter");
        employeeMap.put(4, "Michael");
        employeeMap.put(5, "Mike");
        employeeMap.put(6, "Harry");
        employeeMap.put(7, "Jude");
        System.out.println(employeeMap);

        System.out.println("Enter id to find: ");
        int id = sc.nextInt();
        sc.nextLine();
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee with id = " + id + " is " + employeeMap.get(id));
        } else {
            System.out.println("There is no employee with id " + id);
        }
        System.out.println("Enter the employee name to search: ");
        String name = sc.nextLine().trim();
        boolean found = false;
        for (var entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                System.out.println(entry.getKey() + " : " + name);
                found = true;
            }
        }
        if (!found) {
            System.out.println("There is no employee with name " + name);
        }
    }


}
