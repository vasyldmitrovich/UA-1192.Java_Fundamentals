package com.softserve.edu09_10_collec.pt10.pt2;
import java.util.*;

public class EmployeeMap {
    private Map<Integer, Employee> employeeMap;

    public EmployeeMap() {
        employeeMap = new HashMap<>();
    }

    public void addEmployee(Employee employee) {
        if (employeeMap.containsKey(employee.getId())) {
            System.out.println("Employee with ID " + employee.getId() + " already exists. Duplicate entry halted.");
        } else {
            employeeMap.put(employee.getId(), employee);
            System.out.println("Employee added successfully.");
        }
    }

    public void displayEmployeeMap() {
        if (employeeMap.isEmpty()) {
            System.out.println("Employee map is empty.");
        } else {
            System.out.println("Employee Map:");
            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                System.out.println("ID: " + entry.getKey());
                System.out.println(entry.getValue());
            }
        }
    }

    public void editEmployee(int id, String name, String position, double salary) {
        if (employeeMap.containsKey(id)) {
            Employee employee = employeeMap.get(id);
            employee.setName(name);
            employee.setPosition(position);
            employee.setSalary(salary);
            System.out.println("Employee with ID " + id + " updated successfully.");
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public void sortBy(String criteria) {
        List<Map.Entry<Integer, Employee>> list = new ArrayList<>(employeeMap.entrySet());

        switch (criteria.toLowerCase()) {
            case "id":
                list.sort(Comparator.comparingInt(Map.Entry::getKey));
                break;
            case "name":
                list.sort(Comparator.comparing(e -> e.getValue().getName()));
                break;
            case "position":
                list.sort(Comparator.comparing(e -> e.getValue().getPosition()));
                break;
            default:
                System.out.println("Invalid sorting criterion.");
                return;
        }

        System.out.println("Sorted Employee Map by " + criteria + ":");
        for (Map.Entry<Integer, Employee> entry : list) {
            System.out.println("ID: " + entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public boolean containsId(int id) {
        return employeeMap.containsKey(id);
    }

    public boolean containsName(String name) {
        for (Employee employee : employeeMap.values()) {
            if (employee.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}

