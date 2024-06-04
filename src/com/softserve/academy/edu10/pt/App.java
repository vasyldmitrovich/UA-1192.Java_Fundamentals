package com.softserve.academy.edu10.pt;

import java.util.*;

public class App {

    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Task 1:" +
                "        In the main() method, initialize a map named employeeMap consisting of pairs\n" +
                "<Integer, String>.\n" +
                "• Populate the employeeMap with seven pairs (ID, name) of individuals. Display the\n" +
                "contents of the map on the screen.\n" +
                "• Prompt the user to enter an ID. Find the corresponding name in the employeeMap and\n" +
                "display it. If the ID is not found in the map, notify the user using the containsKey()\n" +
                "function.\n" +
                "• Prompt the user to enter a name. Verify that the name exists in the employeeMap and\n" +
                "display the corresponding ID. If the name is not found in the map, notify the user using\n" +
                "the containsValue() function.\n");
        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(1, "John");
        employeeMap.put(2, "Jane");
        employeeMap.put(3, "Alice");
        employeeMap.put(4, "Bob");
        employeeMap.put(5, "Charlie");
        employeeMap.put(6, "David");
        employeeMap.put(7, "Eve");

        System.out.println("Employee Map: " + employeeMap);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an ID:");
        int id = scanner.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("The name corresponding to ID " + id + " is " + employeeMap.get(id));
        } else {
            System.out.println("No employee found with ID " + id);
        }

        System.out.println("Enter a name:");
        scanner.nextLine();
        String name = scanner.nextLine();
        if (employeeMap.containsValue(name)) {
            for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("The ID corresponding to name " + name + " is " + entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("No employee found with name " + name);
        }

        scanner.close();
    }

    public static void task2() {
        System.out.println("Task 2:" +
                " If desired, you can make the previous task more challenging by selecting one or more of the\n" +
                "following options:\n" +
                " Before adding ID-name pairs to the map, it is recommended to perform a check for\n" +
                "duplicate values. If duplicates are found, the user should be notified and the addition of data\n" +
                "to the map should be halted.\n" +
                " In order to provide a more comprehensive record, the user should be prompted to input\n" +
                "additional information, such as position, salary, and date of birth, in addition to the ID and\n" +
                "name. This information should then be displayed on the screen when the map is output.\n" +
                " To enable the editing of existing data, such as name, position, and salary, the user should be\n" +
                "prompted to input the ID of the record they wish to modify, as well as the updated data. The\n" +
                "updated map should then be displayed.\n" +
                " For improved usability, the map should be sortable by various criteria, such as ID, name, and\n" +
                "position. The user should be prompted to enter the desired sorting criterion, and the sorted\n" +
                "map should then be displayed on the screen.\n");
        Scanner scanner = new Scanner(System.in);
        Map<Integer, Employee> employeeMap = new HashMap<>();
        // Add employees to the map...
        addEmployee(employeeMap, scanner);
        addEmployee(employeeMap, scanner);
        addEmployee(employeeMap, scanner);
        // Display the map...
        System.out.println(employeeMap);
        // Find an employee by ID...
        findEmployeeById(employeeMap, scanner);
        // Find an employee by name...
        findEmployeeByName(employeeMap, scanner);
        // Edit an employee...
        editEmployee(employeeMap, scanner);
        // Sort the map...
        sortEmployees(employeeMap, scanner);
        scanner.close();
    }

    public static void addEmployee(Map<Integer, Employee> employeeMap, Scanner scanner) {
        System.out.println("Enter ID, Name, Position, Salary, Date of Birth:");
        int id = scanner.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println("An employee with this ID already exists.");
            return;
        }
        String name = scanner.next();
        String position = scanner.next();
        double salary = scanner.nextDouble();
        String dateOfBirth = scanner.next();
        employeeMap.put(id, new Employee(id, name, position, salary, dateOfBirth));
    }

    public static void findEmployeeById(Map<Integer, Employee> employeeMap, Scanner scanner) {
        System.out.println("Find by ID. Enter an ID:");
        int id = scanner.nextInt();
        if (employeeMap.containsKey(id)) {
            System.out.println(employeeMap.get(id));
        } else {
            System.out.println("No employee found with ID " + id);
        }
    }

    public static void findEmployeeByName(Map<Integer, Employee> employeeMap, Scanner scanner) {
        System.out.println("Enter a name:");
        String name = scanner.next();
        for (Employee employee : employeeMap.values()) {
            if (employee.name.equals(name)) {
                System.out.println(employee);
                return;
            }
        }
        System.out.println("No employee found with name " + name);
    }

    public static void editEmployee(Map<Integer, Employee> employeeMap, Scanner scanner) {
        System.out.println("Enter the ID of the employee you want to edit:");
        int id = scanner.nextInt();
        if (!employeeMap.containsKey(id)) {
            System.out.println("No employee found with ID " + id);
            return;
        }
        System.out.println("Enter the new Name, Position, Salary, Date of Birth:");
        String name = scanner.next();
        String position = scanner.next();
        double salary = scanner.nextDouble();
        String dateOfBirth = scanner.next();
        employeeMap.put(id, new Employee(id, name, position, salary, dateOfBirth));
    }

    public static void sortEmployees(Map<Integer, Employee> employeeMap, Scanner scanner) {
        System.out.println("Enter the sorting criterion (id, name, or position):");
        String criterion = scanner.next();
        List<Employee> employees = new ArrayList<>(employeeMap.values());
        employees.sort((e1, e2) -> {
            switch (criterion) {
                case "id":
                    return Integer.compare(e1.id, e2.id);
                case "name":
                    return e1.name.compareTo(e2.name);
                case "position":
                    return e1.position.compareTo(e2.position);
                default:
                    return 0;
            }
        });
        employees.forEach(System.out::println);
    }
}
