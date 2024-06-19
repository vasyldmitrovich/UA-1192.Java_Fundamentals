package com.softserve.edu10.pt;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws CloneNotSupportedException {
        practicalTask1();// Good
    }

    public static void practicalTask1 () throws CloneNotSupportedException {
        Map<Integer, Employee> employeeMap = new HashMap<>();
        employeeMap.put(0, new Employee());
        int count = 1;
        int salary = 0;
        LocalDate dateOfBirth = null;

        while (true) {
            System.out.println("Enter the name of employee. Enter Stop if you want to end entering");
            String name = sc.nextLine();
            if (name.equals("Stop")) {
                break;
            }

            System.out.println("Enter the position for employee. Enter Stop if you want to end entering");
            String position = sc.nextLine();
            if (position.equals("Stop")) {
                break;
            }

            System.out.println("Enter the salary for employee. Enter Stop if you want to end entering");
            String answer = sc.nextLine();
            if (answer.equals("Stop")) {
                break;
            }
            try {
                salary = Integer.parseInt(answer);
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.exit(0);
            }

            System.out.println("Enter the date of birth of employee in format - 'year-month-day'. " +
                    "Enter Stop if you want to end entering");
            answer = sc.nextLine();
            if (answer.equals("Stop")) {
                break;
            }
            try {
                dateOfBirth = LocalDate.parse(answer);
            } catch (DateTimeParseException e) {
                e.printStackTrace();
                System.exit(0);
            }

            Employee employee = new Employee(name, position, salary, dateOfBirth);

            count = identityCheck(employee, employeeMap, count);
        }

        System.out.println("The initial map is: " + employeeMap.toString());

        findEmplById(employeeMap);
        findEmplByName(employeeMap);
        updateValue(employeeMap);
        sortByName(employeeMap);
        sortByPosition(employeeMap);
    }


//    The first subtask in second practical task
    public static int identityCheck (Employee employee, Map<Integer, Employee> employeeMap, int count) {
        if (employeeMap.containsValue(employee)) {
            System.out.println("This value is already in base. Do you still want to add this value? " +
                    "Enter Yes or No");
            String stillAdd = sc.nextLine();

            if (stillAdd.equals("Yes")) {
                employeeMap.put(count, employee);
                System.out.println("The value is added to the database");
            } else if (stillAdd.equals("No")) {
                System.out.println("The value has not been added to the database");
            } else {
                System.out.println("You enter wrong answer. The value has not been added to the database");
            }

        } else {
            employeeMap.put(count, employee);
            count++;
        }
        return count;
    }

    public static void findEmplById (Map<Integer, Employee> employeeMap) {
        System.out.println("Enter the id of the employee which you want to find");

        try {
            int id = sc.nextInt();
            sc.nextLine();
            Employee employee = employeeMap.get(id);

            if (employee == null) {

                if (!employeeMap.containsKey(id)) {
                    System.out.println("Sorry, but employee with that id doesn't exist in base");
                }

            } else {
                System.out.println("Employee with this id is " + employee.toString());
            }

        } catch (InputMismatchException e) {
            e.printStackTrace();
            sc.nextLine();
        }

    }


    public static void findEmplByName (Map<Integer, Employee> employeeMap) throws CloneNotSupportedException {
        System.out.println("Enter the name of the employee which you want to find");
        String name = sc.nextLine();
        int id = -1;

        for (int i = 0; i < employeeMap.size(); i++) {
            if (name.equals(employeeMap.get(i).getName())) {
                id = i;

            }
        }


        if (id == -1) {
            boolean containsName = false;

            for (int i = 0; i < employeeMap.size(); i++) {
                Employee isInMap = employeeMap.get(i).clone();
                isInMap.setName(name);
                if (employeeMap.containsValue(isInMap)) {
                    System.out.println("Employee with this name has id " + i);
                    containsName = true;
                }
            }

            if (!containsName) {
                System.out.println("Sorry, but employee with this name doesn't exist in base");
            }

        } else {
            System.out.println("Employee with this name has id " + id);
        }
    }


//    The third subtask in second practical task
    public static void updateValue (Map<Integer, Employee> employeeMap) {
        int salary = 0;
        LocalDate dateOfBirth = null;

        System.out.println("Enter the id of the value which you want to update");
        int id = -1;

        try {
            id = sc.nextInt();
            sc.nextLine();
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        }

        if (employeeMap.containsKey(id)) {
            System.out.println("Enter the new name of employee");
            String name = sc.nextLine();


            System.out.println("Enter the new position for employee");
            String position = sc.nextLine();


            System.out.println("Enter the new salary for employee");

            try {
                salary = sc.nextInt();
                sc.nextLine();
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.exit(0);
            }

            System.out.println("Enter the new date of birth of employee in format - 'year-month-day'");

            try {
                dateOfBirth = LocalDate.parse(sc.nextLine());
            } catch (DateTimeParseException e) {
                e.printStackTrace();
                System.exit(0);
            }

            Employee employee = new Employee(name, position, salary, dateOfBirth);
            employeeMap.put(id, employee);

            System.out.println("The updated map is: " + employeeMap.toString());

        } else {
            System.out.println("Sorry, but employee with that id doesn't exist in base");
        }
    }

    public static void sortByName (Map<Integer, Employee> employeeMap) {
        Comparator<Integer> comparator = new Employee.EmployeeNameComparator<>(employeeMap);
        TreeMap<Integer, Employee> sortedByName = new TreeMap<>(comparator);
        sortedByName.putAll(employeeMap);
        employeeMap = sortedByName;
        System.out.println("A map with values sorted by name " + employeeMap.toString());
    }

    public static void sortByPosition (Map<Integer, Employee> employeeMap) {
        Comparator<Integer> comparator = new Employee.EmployeePosComparator<>(employeeMap);
        TreeMap<Integer, Employee> sortedByPos = new TreeMap<>(comparator);
        sortedByPos.putAll(employeeMap);
        employeeMap = sortedByPos;
        System.out.println("A map with values sorted by position " + employeeMap.toString());
    }
}
