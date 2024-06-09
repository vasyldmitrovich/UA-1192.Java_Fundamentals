package com.softserve.edu10.pt.pt1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Program {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Jack");
        employeeMap.put(2, "Josh");
        employeeMap.put(3, "Peter");
        employeeMap.put(4, "Sarah");
        employeeMap.put(5, "Monica");
        employeeMap.put(6, "Ethan");
        employeeMap.put(7, "Nicole");
        showMap(employeeMap);
        nameFinder(employeeMap);
        idFinder(employeeMap);
    }

    public static void showMap(Map<Integer, String> emplMap) {
        Iterator iterator = emplMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Employee ID: " + entry.getKey() + " ->" + "Name: " + entry.getValue());
        }
    }

    public static void nameFinder(Map<Integer, String> emplMap) {
        System.out.println("Input employee ID to get its name:");
        boolean check = false;
        Integer input = SCANNER.nextInt();
        SCANNER.nextLine();
        for (Map.Entry<Integer, String> entry : emplMap.entrySet()) {
            if (input.equals(entry.getKey())) {
                System.out.println("Id: " + input + "\nName: " + entry.getValue());
                check = true;
            }
        }
        if (!check) {
            System.out.println("There isn't such Employee ID: " + input);
        }
    }

    public static void idFinder(Map<Integer, String> emplMap) {
        boolean check = false;
        System.out.println("Input employee name to get its ID:");
        String input = nameFromUpper(SCANNER.nextLine());
        for (Map.Entry<Integer, String> entry : emplMap.entrySet()) {
            if (entry.getValue().equals(input)) {
                System.out.println("ID of employee " + entry.getValue() + " is: " + entry.getKey());
                check = true;
            }
        }
        if (!check) {
            System.out.println("There isn't such Employee: " + input);
        }
    }


    public static String nameFromUpper(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

}



