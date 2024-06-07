package com.softserve.edu09_10_collec.pt10;

import java.util.*;

public class App {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {// Good

        task1();

    }

    public static void task1() {

        System.out.println("Pt 10 task 1");

        Map<Integer, String> employeeMap = new HashMap<>();


        employeeMap.put(1, "Alex");
        employeeMap.put(2, "Tamara");
        employeeMap.put(8, "Stan");
        employeeMap.put(4, "Olga");
        employeeMap.put(5, "Kris");
        employeeMap.put(6, "Vlad");
        employeeMap.put(7, "Anna");

        Set<String> existingValues = new HashSet<>();// Good

        for (Map.Entry employee : employeeMap.entrySet()) {
            System.out.println(employee.getKey() + ": " + employee.getValue());
            existingValues.add((String) employee.getValue());
        }
        System.out.println();


        while (true) {

            System.out.print("Input ID: ");
            int id = SCANNER.nextInt();
            SCANNER.nextLine();


            System.out.print("Input name: ");
            String name = SCANNER.nextLine();


            if (existingValues.contains(name)) {
                System.out.println("Name \"" + name + "\" already created. Try again.");
                continue;
            }


            employeeMap.put(id, name);
            existingValues.add(name);


            System.out.print("Another one? (yes/no): ");
            String response = SCANNER.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }


        printSearchingID(employeeMap);
        System.out.println();


        printSearchingName(employeeMap);


    }

    public static void printSearchingID(Map<Integer, String> map) {

        System.out.print("Input an ID of searching employee: ");
        int id = SCANNER.nextInt();
        if (map.containsKey(id)) {
            System.out.println("Employee with id = " + id + " is " + map.get(id));
        } else {
            System.out.println("there is no person with this ID");

        }
        SCANNER.nextLine();
    }

    public static void printSearchingName(Map<Integer, String> map) {

        System.out.print("Input an Name of searching employee: ");
        String name = SCANNER.nextLine() ;
        if (map.containsValue(name)) {

            Integer key = null;
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(name)) {
                    key = entry.getKey();
                    break;
                }
            }
            System.out.println("Employee with name : " + name + " has id = " + key);
        } else {
            System.out.println("there is no person with this name");

        }
    }

    public static void checkDuplicatesBeforeAdding(){

    }
}