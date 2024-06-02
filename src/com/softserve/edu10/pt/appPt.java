package com.softserve.edu10.pt;

import java.time.LocalDate;
import java.util.*;

public class appPt {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       // pt1();
        pt2();
    }

    public static void pt1() {
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "Pavlo");
        employeeMap.put(2, "Dmitro");
        employeeMap.put(3, "Rostislav");
        employeeMap.put(4, "Ivan");
        employeeMap.put(5, "Nazar");
        employeeMap.put(6, "Volodya");
        employeeMap.put(7, "Dmitro");

        showEmployee(employeeMap);
        findById(employeeMap);
        findByName(employeeMap);


    }

    public static void findById(Map<Integer, String> employeeMap) {
        System.out.println("Enter the ID person");
        int id = scanner.nextInt();

        if (employeeMap.containsKey(id)) {
            System.out.println("The person with this ID:" + employeeMap.get(id));
        } else {
            System.out.println("Person with this ID is not found.");
        }
    }

    public static void findByName(Map<Integer, String> employeeMap) {
        scanner.nextLine();
        System.out.println("Enter the name person to search");
        String name = scanner.nextLine();

        if (employeeMap.containsValue(name)) {
            for (var entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("The person with name " + name + " have ID:" + entry.getKey());
                }
            }
        } else {
            System.out.println("The person with name " + name + " is not found");
        }
    }

    public static void showEmployee(Map<Integer, String> employeeMap) {
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID:" + entry.getKey() + "\nValue:" + entry.getValue() + "\n");
        }
    }
    public static void pt2(){
       /* Map<Integer,Employee> employeeMap = new HashMap<>();
        employeeMap.put(1,
                new Employee(1,"Pasha", Position.DEV,1200,
                        LocalDate.of(2004,02,18)) );*/
        EmployeeManagementSystem register = new EmployeeManagementSystem();
        register.run();
    }

}
