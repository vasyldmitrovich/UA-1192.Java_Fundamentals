package com.softserve.edu10.pt;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {// All is nice

        System.out.println("Demonstrate task 1");
        task1();

        System.out.println("Demonstrate task 2");
        task2();
    }

    public static void task1() {
        Map<Integer, String> employeeMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        employeeMap.put(1, "John");
        employeeMap.put(2, "Jane");
        employeeMap.put(3, "Bob");
        employeeMap.put(4, "Mary");
        employeeMap.put(5, "Jack");
        employeeMap.put(6, "Chris");
        employeeMap.put(7, "Janet");

        System.out.println("Enter employee id: ");

        int employeeId = scanner.nextInt();

        if (employeeMap.containsKey(employeeId)) {
            System.out.println("Employee with id " + employeeId + " has name " + employeeMap.get(employeeId));
        } else {
            System.out.println("Employee with id " + employeeId + " does not exist");
        }

        System.out.println("Enter employee name: ");
        String name = scanner.next();

        if (employeeMap.containsValue(name)) {
            System.out.println("Employee with name " + name + " has id " + getKey(employeeMap, name));
        } else {
            System.out.println("Employee with name " + name + " does not exist");
        }
    }

    public static  <K, V> K getKey(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void task2() {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        String answer;

        do {
            Employee employee = createEmployee();

            if (employeeMap.containsKey(employee.getId())) {
                System.out.println("Employee with id " + employee.getId() + " already exists");
            } else {
                employeeMap.put(employee.getId(), employee);
            }

            System.out.println("Do you want to add another one employee? (y/n)");
            answer = scanner.next();

        } while (!answer.equals("n"));

        System.out.println("Generated employee map:");
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println("Do you want to edit some employee? (y/n)");
        answer = scanner.next();

        if (answer.equals("y")) {
            do {
                System.out.println("Enter employee id: ");
                int employeeId = scanner.nextInt();

                if (employeeMap.containsKey(employeeId)) {
                    employeeMap.remove(employeeId);
                    Employee employee = createEmployee();

                    employeeMap.put(employee.getId(), employee);
                } else {
                    System.out.println("Employee with id " + employeeId + " does not exist");
                }


                System.out.println("Do you want to edit another one employee? (y/n)");
                answer = scanner.next();

            } while (!answer.equals("n"));

            System.out.println("Updated employee map:");
            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                System.out.println(entry.getValue());
            }
        }

        System.out.println("Select map sorting (id/name/position)");

        Comparator<Employee> comparator = switch (scanner.next()) {
            case "position" -> Comparator.comparing(Employee::getPosition);
            case "name" -> Comparator.comparing(Employee::getName);
            default -> Comparator.comparing(Employee::getId);
        };

        LinkedHashMap<Integer, Employee> sortedMap = employeeMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(comparator))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));


        System.out.println("Sorted employee map:");
        for (Map.Entry<Integer, Employee> entry : sortedMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static Employee createEmployee() {
        System.out.println("Input employee id");
        int id = scanner.nextInt();

        System.out.println("Input employee name");
        String name = scanner.next();

        System.out.println("Input employee salary");
        double salary = scanner.nextDouble();

        System.out.println("Input employee position");
        String position = scanner.next();

        System.out.println("Input employee date of birth");
        String dateOfBirth = scanner.next();

        return new Employee(id, name, salary, position, dateOfBirth);
    }
}
