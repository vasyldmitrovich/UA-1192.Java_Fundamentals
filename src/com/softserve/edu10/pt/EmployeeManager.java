package com.softserve.edu10.pt;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManager {
    private Map<Integer, String> employeeMap;

    public EmployeeManager() {
        employeeMap = new HashMap<>();

        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charly");
        employeeMap.put(104, "Alina");
        employeeMap.put(105, "Edvard");
        employeeMap.put(106, "Fiona");
        employeeMap.put(107, "Lincoln");
    }

    public void displayEmployeeMap() {
        System.out.println("Map of worker: " + employeeMap);
    }

    public void findEmployeeById(int id) {
        if (employeeMap.containsKey(id)) {
            System.out.println("name worker: " + employeeMap.get(id));
        } else {
            System.out.println("ID not founded.");
        }
    }

    public void findEmployeeByName(String name) {
        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("ID worker: " + entry.getKey());
                    return;
                }
            }
        } else {
            System.out.println("name not founded.");
        }
    }
}
