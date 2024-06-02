package com.softserve.edu10.pt;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.*;

public class EmployeeManagementSystem {
    public static Scanner scanner = new Scanner(System.in);
    private Map<Integer, Employee> employeeMap = new LinkedHashMap<>();

    public EmployeeManagementSystem() {
        addEmployee(new Employee(
                1,
                "Bob",
                Position.DEV,
                1200,
                LocalDate.parse("2000-02-22")));
        addEmployee(new Employee(
                2,
                "Dima",
                Position.QA,
                1100,
                LocalDate.parse("2012-01-12")));

    }

    public void run() {
        out:
        while (true) {
            showMenu();
            System.out.println("Enter value to do something");
            int value = readOption(5);
            switch (value) {
                case 1 -> showEmployees();
                case 2 -> {
                    Employee employee = promptAddNewEmployee();
                    addEmployee(employee);
                    System.out.println("The data was successfully added");
                }
                case 3 -> editEmployee();
                case 4 -> sortEmployee();
                case 5 -> {
                    break out;
                }
                default -> System.out.println("You entered incorrect value!");
            }
        }
        System.out.println("Bye!");
    }

    private void sortEmployee() {
        System.out.println("""
                Select a sort option:
                    1. Sort by id;
                    2. Sort by name;
                    3. Sort by position
                    4. Sort by salary
                    5. Sort by date
                """);
        int option = readOption(5);
        Comparator<Employee> comparator = switch (option){
            case 1 -> Comparator.comparing(Employee::id);
            case 2 -> Comparator.comparing(Employee::name);
            case 3 -> Comparator.comparing(Employee::position);
            case 4 -> Comparator.comparing(Employee::salary);
            case 5 -> Comparator.comparing(Employee::dateOfBirth);
            default -> throw new IllegalArgumentException("Never should be here");
        };
        sortByStartEnd(comparator);


    }
    private void sortByStartEnd(Comparator<Employee> comparator){
        System.out.println("""
                Select  which order to sort:
                    1. Increasing;
                    2. Decreasing;
                """);
        int option = readOption(2);
        List<Employee> employeeList = new ArrayList<>(employeeMap.values());
        switch (option){
            case 1 -> employeeList.sort(comparator);
            case 2 -> employeeList.sort(comparator.reversed());
        }
        employeeMap = new LinkedHashMap<>();
        for (var employee:employeeList){
            employeeMap.put(employee.id(),employee);
        }
        showEmployees();

    }

    private void showMenu() {
        System.out.println("""
                Main menu:
                    1. Show employees
                    2. Add new employee
                    3. Edit employee
                    4. Sort
                    5. Exit
                """);
    }

    private void editEmployee() {
        System.out.println("Enter id of the employee to edit:");
        int id = Integer.parseInt(scanner.nextLine());
        var employee = employeeMap.get(id);

        if (employee == null) {
            System.out.println("There is no employee with id" + id);
            return;
        }

        System.out.println("The current name is:" + employee.name());
        System.out.println("Enter the new name");
        String name = scanner.nextLine().trim();

        if (!name.isEmpty()) {
            employee = employee.withName(name);
        }

        System.out.println("The current position is:" + employee.position());
        System.out.println("Enter the new position(one of " +
                Arrays.toString(Position.values()) + ")");
        String positionText = scanner.nextLine().trim().toUpperCase();

        if (!positionText.isEmpty()) {
            Position newPosition = Position.valueOf(positionText);
            employee = employee.withPosition(newPosition);
        }

        System.out.println("The current salary is:" + employee.salary());
        System.out.println("Enter the new salary");
        String salaryText = scanner.nextLine().trim();

        if (!salaryText.isEmpty()) {
            double newSalary = Double.parseDouble(salaryText);
            employee = employee.withSalary(newSalary);
        }
        employeeMap.put(id, employee);
    }


    private void addEmployee(Employee employee) {
        if (employeeMap.containsKey(employee.id())) {
            throw new IllegalArgumentException("Employee with id = " + employee.id() +
                    " is already exists");
        } else {
            employeeMap.put(employee.id(), employee);
        }
    }

    private Employee promptAddNewEmployee() {
        System.out.println("Let's add new employee!");
        int id = checkId();

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        Position position = readPosition();

        System.out.println("Enter salary:");
        double salary = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the date of birth (format template: 2004-02-19 )");
        LocalDate dob = LocalDate.parse(scanner.nextLine().trim());
        return new Employee(id, name, position, salary, dob);
    }
   

    private int checkId() {
        while (true) {
            System.out.println("Enter id for new employee!");
            int id = Integer.parseInt(scanner.nextLine());
            if (!employeeMap.containsKey(id)) {
                return id;
            }
            System.out.println("Such id is already used! Choose another id");
        }
    }

    private Position readPosition() {
        System.out.println("Enter position (one of " +
                Arrays.toString(Position.values()) + "):");
        var positionText = scanner.nextLine();
        try {
            return Position.valueOf(positionText.trim().toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("You are entered wrong position");
        }
    }

    private int readOption(int numberOptions) {
        System.out.println("Enter option (1.." + numberOptions + ")");
        int res = Integer.parseInt(scanner.nextLine());
        return res;
    }

    private void showEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("There are no employees yet");
        } else {
            for (var entry : employeeMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

}
