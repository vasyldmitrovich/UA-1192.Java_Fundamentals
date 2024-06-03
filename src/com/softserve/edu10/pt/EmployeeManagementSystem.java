package com.softserve.edu10.pt;

import java.time.LocalDate;
import java.util.*;

public class EmployeeManagementSystem {
    Scanner sc = new Scanner(System.in);
    private Map<Integer, Employee> employees = new LinkedHashMap<>();

    public EmployeeManagementSystem() {
        addEmployee(new Employee(1, "Bob", Position.DEV, 12.000, LocalDate.parse("1999-01-30")));
        addEmployee(new Employee(2, "Jame", Position.MANAGER, 9.000, LocalDate.parse("1989-03-21")));
        addEmployee(new Employee(3, "Darvin", Position.DEVOPS, 15.000, LocalDate.parse("1976-06-14")));
        addEmployee(new Employee(4, "Kate", Position.QA, 8.500, LocalDate.parse("2000-12-17")));


    }

    private void addEmployee(Employee employee) {
        if (employees.containsKey(employee.id())) {
            throw new IllegalArgumentException("Employee with id " + employee.id() + " already exists");
        }
        employees.put(employee.id(), employee);

    }

    public void run() {
        out:
        while (true) {
            showMainMenu();

            int option = readOption(4);
            switch (option) {
                case 1 -> showEmployees();
                case 2 -> {
                    var employee = promptNewEmployee();
                    addEmployee(employee);
                }
                case 3 -> editEmployee();
                case 4 -> sortEmployees();
                case 5 -> {
                    break out;
                }
            }
        }
        System.out.println("Bye!");
    }

    private void sortEmployees() {
        System.out.println("""
                Choose the sorting method:
                1. id
                2. name
                3. position
                """);
        int option = readOption(3);
        Comparator<Employee> comparator = switch (option) {
            case 1 -> Comparator.comparing(Employee::id);
            case 2 -> Comparator.comparing(Employee::name);
            case 3 -> Comparator.comparing(Employee::position);
            default -> throw new IllegalStateException("Never should be here");
        };
        List<Employee> employeesList = new ArrayList<>(employees.values());
        employeesList.sort(comparator);
        employees = new LinkedHashMap<>();
        for (var employee : employeesList) {
            employees.put(employee.id(), employee);
        }
        showEmployees();
    }

    private void editEmployee() {
        System.out.println("Enter ID of the employee to edit: ");
        int id = Integer.parseInt(sc.nextLine());
        var employee = employees.get(id);
        if (employee == null) {
            System.out.println("There is no employee with id " + id);
            return;
        }
        System.out.println("The current name is: " + employee.name());
        System.out.println("Enter new name or an empty line to keep current:");
        String name = sc.nextLine().trim();
        if (!name.isEmpty()) {
            employee = employee.withName(name);
        }
        System.out.println("The current position is: " + employee.position());
        System.out.println("Enter new position or an empty line to keep current:");
        System.out.println("Enter neww position (one of  " + Arrays.toString(Position.values()) + ")\n" + " or an empty line to keep current: ");

        String positionText = sc.nextLine().trim().toUpperCase();
        if (!name.isEmpty()) {
            Position newPosition = Position.valueOf(positionText);
            employee = employee.withPosition(newPosition);
        }
        System.out.println("The current salary is: " + employee.salary());
        System.out.println("Enter new salary or an empty line to keep current:");
        String salaryText = sc.nextLine().trim();
        if (!name.isEmpty()) {
            double newSalary = Double.parseDouble(salaryText);
            employee = employee.withSalary(newSalary);
        }
        employees.put(id, employee);
    }

    private int readIfForNewEmployee() {
        while (true) {
            System.out.println("Enter ID for the new employee: ");
            int id = Integer.parseInt(sc.nextLine());

            if (!employees.containsKey(id)) {
                return id;
            }
            System.out.println("Such id is already occupied, choose another one");

        }
    }

    private Employee promptNewEmployee() {
        System.out.println("Let`s add new employee!");
        int id = readIfForNewEmployee();
        System.out.println("Enter name: ");
        String name = sc.nextLine();
        Position position = readPosition();
        System.out.println("Enter the salary: ");
        double salary = Double.parseDouble(sc.nextLine());
        System.out.println("Enter date of birth (in format 1999-01-01): ");
        LocalDate dob = LocalDate.parse(sc.nextLine().trim());
        return new
                Employee(id, name, position, salary, dob);
    }

    private Position readPosition() {
        System.out.println("Enter position (one of  " + Arrays.toString(Position.values()) + "):");
        var positionText = sc.nextLine();
        return Position.valueOf(positionText.trim().toUpperCase());
    }

    private void showEmployees() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees yet");
        } else {
            for (var entry : employees.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    private int readOption(int nOptions) {
        System.out.println("Enter option from 1 to " + nOptions);
        int result = Integer.parseInt(sc.nextLine());
        return result;
    }

    private void showMainMenu() {
        System.out.println("""
                Main menu:
                1. Show employees
                2. Add new employee
                3. Edit employee
                4. Sort
                5. Exit
                """);

    }

}
