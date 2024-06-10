package com.softserve.edu10.pt;

import java.util.*;


public class PracticalTask {


    public void task1_task2() {
        //create Map
        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        //create employee
        createEmployee(employeeMap);
        //print map to console
        printMap(employeeMap);
        //find employee by ID
        findEmployeeById(employeeMap);
        //find employee by name
        findEmployeeByName(employeeMap);
        //request for editing
        editRequest(employeeMap);
    }

    public void createEmployee(Map<Integer, Employee> employeeMap) {

        //create array of employees with name
        Employee[] employees = {
                new Employee("Alex"),
                new Employee("Iryna"),
                new Employee("Miho"),
                new Employee("Iryna"),
//                new Employee("Kevin"),
//                new Employee("Sergio"),
//                new Employee("Gena"),
        };

        //set position, salary,date of birth by prompt
        for (Employee employee : employees) {
            String name = employee.getName();
            employee.setPosition(employee.promptPosition(name));
            employee.setSalary(employee.promptSalary(name));
            employee.setDateOfBirth(employee.promptDateOfBirth(name));
            Employee.SCANNER.nextLine();
        }

        //add to map without duplicates, when duplicates find add stop
        if (findDuplicate(employeeMap, 1, employees[0])) ;
        if (findDuplicate(employeeMap, 45, employees[1])) return;
        if (findDuplicate(employeeMap, 8, employees[2])) return;
        if (findDuplicate(employeeMap, 4, employees[3])) return;
//        if (findDuplicate(employeeMap, 5, employees[4])) return;
//        if (findDuplicate(employeeMap, 78, employees[5])) return;
//        if (findDuplicate(employeeMap, 7, employees[6])) ;
    }

    private boolean findDuplicate(Map<Integer, Employee> map, int id, Employee employee) {
        if (!map.containsValue(employee)) {
            map.put(id, employee);
            return false;
        } else {
            System.out.println("Duplicate value is find in ID " + id + " add is terminated");
        }
        return true;
    }

    private void printMap(Map<Integer, Employee> employeeMap) {

        for (Map.Entry<Integer, Employee> employee : employeeMap.entrySet()) {
            System.out.println("ID: " + employee.getKey() + " " + employee.getValue());
        }
    }

    private void findEmployeeById(Map<Integer, Employee> employeeMap) {

        Integer id = getPrompt("Enter ID:", true);
        if (employeeMap.containsKey(id)) {
            System.out.println("Employee is:" + employeeMap.get(id));
        } else {
            System.out.println("Employee ID not found in the map");
        }
        Employee.SCANNER.nextLine();
    }

    private void findEmployeeByName(Map<Integer, Employee> employeeMap) {

        String name = getPrompt("Enter name: ");
        Employee finder = new Employee(name);
        if (employeeMap.containsValue(finder)) {
            for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
                if (entry.getValue().getName().equals(name)) {
                    System.out.println("Employee ID is: " + entry.getKey());
                    break;
                }
            }
        } else {
            System.out.println("Employee name not found in the map");
        }
    }

    private void editRequest(Map<Integer, Employee> employeeMap) {

        //editing condition check
        String input = getPrompt("Do you wish edit some record? (yes/no)");
        if (input.equalsIgnoreCase("yes")) {

            //enter desires ID to edit
            int id = getPrompt("Enter ID: ", true);
            Employee.SCANNER.nextLine();

            //read actual name of employee
            String name = employeeMap.get(id).getName();

            //create object type Employee which will editing
            Employee employeeEdit = employeeMap.get(id);

            //requests to enter new data
            employeeEdit.setName(employeeEdit.promptName(name));

            //read new name of employee
            name = employeeMap.get(id).getName();

            //requests to enter new data
            employeeEdit.setPosition(employeeEdit.promptPosition(name));
            employeeEdit.setSalary(employeeEdit.promptSalary(name));
            employeeEdit.setDateOfBirth(employeeEdit.promptDateOfBirth(name));

            System.out.println("employeeMap  after editing: ");
            printMap(employeeMap);
        } else if (input.equalsIgnoreCase("no")) {
            printMap(employeeMap);
        } else {
            System.out.println("Employee ID not found in the map");
        }
    }

    private int getPrompt(String prompt, boolean isInt) {
        System.out.println(prompt);
        return Employee.SCANNER.nextInt();
    }

    private String getPrompt(String prompt) {

        System.out.println(prompt);
        return Employee.SCANNER.nextLine();
    }
}
