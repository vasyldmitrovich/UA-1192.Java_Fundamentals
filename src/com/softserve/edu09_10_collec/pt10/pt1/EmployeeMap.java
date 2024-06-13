package com.softserve.edu09_10_collec.pt10.pt1;

import java.util.HashMap;
import java.util.Map;

public class EmployeeMap {
    private Map<Integer, String> employeeMap;

    public EmployeeMap() {
        employeeMap = new HashMap<>();
    }

    public void populateMap() {
        employeeMap.put(101, "Alice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");
        employeeMap.put(104, "David");
        employeeMap.put(105, "Eve");
        employeeMap.put(106, "Frank");
        employeeMap.put(107, "Grace");
    }

    public void displayEmployeeMap() {
        System.out.println("Employee Map:");
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public String findNameById(int id) {
        return employeeMap.getOrDefault(id, null);
    }

    public int findIdByName(String name) {
        for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
            if (entry.getValue().equals(name)) {
                return entry.getKey();
            }
        }
        return -1; // Return -1 if name not found
    }

    public boolean containsId(int id) {
        return employeeMap.containsKey(id);
    }

    public boolean containsName(String name) {
        return employeeMap.containsValue(name);
    }
}

