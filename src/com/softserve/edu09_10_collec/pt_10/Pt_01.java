package com.softserve.edu09_10_collec.pt_10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pt_01 {
    public static void main(String... args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Anna");
        employeeMap.put(2, "Anastasiia");
        employeeMap.put(3, "Maxym");
        employeeMap.put(4, "Ivan");
        employeeMap.put(5, "Artem");
        employeeMap.put(6, "Andrii");
        employeeMap.put(7, "Bob");

        System.out.println(employeeMap);


        var scan = new Scanner(System.in);
        System.out.println("Please, enter id to find an employee: ");
        int id = scan.nextInt();
        scan.nextLine();

        if (employeeMap.containsKey(id)) {
            System.out.println("Employee with id = " + id + " is " + employeeMap.get(id));
        } else {
            System.out.println("There is no employee with id: " + id);
        }

        System.out.println("Please enter the name of employee to find: ");
        String name = scan.nextLine().trim();

        if (employeeMap.containsValue(name)) {
            for (var entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("There is an employee with name: " + name + " and id: " + entry.getKey());
                }
            }
        } else {
            System.out.println("There is no employee with name: " + name);
        }
    }
}



