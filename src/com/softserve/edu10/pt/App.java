package com.softserve.edu10.pt;

import com.sun.source.tree.Tree;

import java.util.*;

public class App {

    private static final Scanner SC = new Scanner(System.in);
    private static Map<Integer, Employee> employeeMap;

    static {
        employeeMap = initMap();
    }// Nice

    public static void main(String[] args) {// Good, all is good
        printMap(employeeMap);
        findEmployeeById();
        findEmployeeByName();

        updateEmployee();
        printMap(employeeMap);

        sortMap();
        printMap(employeeMap);
    }

    private static Map<Integer, Employee> initMap() {
        Map<Integer, Employee> map = new HashMap<>() {
            @Override
            public Employee put(Integer key, Employee value) {
                if (containsValue(value)) {
                    System.out.println("Duplicate value found: " + value.toString());
                    System.out.println("Not added");
                    return null;
                }
                return super.put(key, value);
            }
        };

        //add real salary, prompt for user input etc
        map.put(1, new Employee(1, "Andrew", "Tech Lead", 0.0, 1985));
        map.put(2, new Employee(2, "Maks", "Java Developer", 0.0, 2000));
        map.put(3, new Employee(3, "Ronald", "Java Developer", 0.0, 1994));
        map.put(4, new Employee(4, "Bob", "QA", 0.0, 1982));
        map.put(5, new Employee(5, "John", "Python Developer", 0.0, 1972));
        map.put(6, new Employee(6, "Alice", "Java Developer", 0.0, 1981));
        map.put(7, new Employee(7, "Henry", "QA", 0.0, 1977));

        map.put(8, new Employee(8, "Bob", "QA", 0.0, 1982));
        return map;
    }

    private static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey().toString() + ": " + entry.getValue().toString());
        }
    }

    private static void findEmployeeById() {
        System.out.print("Enter employee's id: ");
        int id = Integer.parseInt(SC.nextLine());

        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id).toString());
        } else {
            System.out.println("Employee not found");
        }
    }

    private static void findEmployeeByName() {
        System.out.print("Enter employee's name: ");
        String name = SC.nextLine();
        Employee target = new Employee();
        target.setName(name);

        if (employeeMap.containsValue(target)) {
            for (Map.Entry<Integer, Employee> pair : employeeMap.entrySet()) {
                if (pair.getValue().getName().equals(name)) {
                    System.out.println("Employee's id: " + pair.getKey());
                    break;
                }
            }
        } else {
            System.out.println("Employee with such name not found");
        }
    }

    private static void updateEmployee() {
        System.out.print("Enter employee's id: ");
        int id = Integer.parseInt(SC.nextLine());

        if (employeeMap.containsKey(id)) {
            Employee employee = employeeMap.get(id);
            System.out.println(employee.toString());

            System.out.print("Enter new employee's name: ");
            String name = SC.nextLine();
            if (!name.isEmpty()) {
                employee.setName(name);
            }

            System.out.print("Enter new employee's position: ");
            String position = SC.nextLine();
            if (!position.isEmpty()) {
                employee.setPosition(position);
            }

            System.out.print("Enter new employee's salary: ");
            double salary = Double.parseDouble(SC.nextLine());
            if (salary > 0) {
                employee.setSalary(salary);
            }
        }
    }

    private static void sortMap() {
        System.out.println("[by_id, by_name, by_position]");
        System.out.print("Enter sorting type: ");
        Comparator<Integer> keyComparator = EmployeeComparators.getIdComparator(employeeMap);

        switch (SC.nextLine().toLowerCase()) {
            case "by_name" -> keyComparator = EmployeeComparators.getNameComparator(employeeMap);
            case "by_position" -> keyComparator = EmployeeComparators.getPositionComparator(employeeMap);
        }

        TreeMap<Integer, Employee> sorted = new TreeMap<>(keyComparator);
        sorted.putAll(employeeMap);
        employeeMap = sorted;
    }

}
