package com.softserve.edu10.pt.pt2;

import java.time.LocalDate;
import java.util.*;

public class EmployeeManagementSystem {
    private static final String gap = "-".repeat(100);
    private static final String nL = "\n";
    public static final Scanner SCANNER = new Scanner(System.in);
    private Map<Integer, Employee> employeeData = new LinkedHashMap<>();

    public EmployeeManagementSystem() {
        addEmployee(new Employee(1,
                "Jack",
                Position.DEV,
                12_000,
                LocalDate.parse("1999-01-22")));
        addEmployee(new Employee(2,
                "Bob",
                Position.QA,
                12_000,
                LocalDate.parse("1998-08-12")));
    }

    private void addEmployee(Employee employee) {
        if (employeeData.containsKey(employee.id())) {
            throw new IllegalArgumentException("Employee ID " + employee.id() + " already exist");
        }
        employeeData.put(employee.id(), employee);
    }

    public void run() {
        out:
        while (true) {
            showMainMenu();
            int option = scanInput(5);
            switch (option) {
                case 1 -> showEmployee();
                case 2 -> {
                    var employee = createNewEmployee();
                    addEmployee(employee);
                }
                case 3 -> editEmployee();
                case 4 -> sortEmployeeData();
                case 5 -> {
                    System.out.println(gap + nL + "Exit" + nL + gap);
                    break out;
                }
            }
        }
    }

    private void sortEmployeeData() {
        System.out.println("""
                Choose the sorting order:
                1. ID
                2. Name
                3. Position
                """);
        int option = scanInput(3);
        Comparator<Employee> comparator = switch (option) {
            case 1 -> Comparator.comparing(Employee::id);
            case 2 -> Comparator.comparing(Employee::name);
            case 3 -> Comparator.comparing(Employee::position);
            default -> throw new IllegalStateException("Unexpected value: " + option);
        };
        List<Employee> employeeList = new ArrayList<>(employeeData.values());
        employeeList.sort(comparator);
        employeeData = new LinkedHashMap<>();
        for (var employee : employeeList) {
            employeeData.put(employee.id(), employee);
        }
        showEmployee();
    }

    private void editEmployee() {
        System.out.println("Enter employee's ID to edit: ");
        int id = Integer.parseInt(SCANNER.nextLine());
        var employee = employeeData.get(id);
        if (employee == null) {
            System.out.println("There isn't employee with ID " + id);
            return;
        }
        System.out.println("The current name is: " + employee.name());
        System.out.println("Enter the new name to set (or empty line to cancel a change) : ");
        String name = SCANNER.nextLine().trim();
        if (!name.isEmpty()) {
            employee = employee.withName(name);
        }
        System.out.println("The current position is: " + employee.position());
        System.out.println("Enter the new position to set (or empty line to cancel a change) : ");
        String positionText = SCANNER.nextLine();
        if (!positionText.isEmpty()) {
            Position newPosition = Position.valueOf(positionText.trim().toUpperCase());
            employee = employee.withPosition(newPosition);
        }
        System.out.println("The current salary is: " + employee.salary());
        System.out.println("Enter the new salary to set (or empty line to cancel a change) : ");
        String salaryText = SCANNER.nextLine().trim();
        if (!salaryText.isEmpty()) {
            double salary = Double.parseDouble(salaryText);
            employee = employee.withSalary(salary);
        }
        employeeData.put(id, employee);

    }

    private int checkID() {
        while (true) {
            System.out.println("Enter id of new employee: ");
            int id = Integer.parseInt(SCANNER.nextLine());
            if (!employeeData.containsKey(id)) {
                return id;
            }
            System.out.println("There is same ID, try to choose another ID");
        }

    }

    private Position checkPosition() {
        System.out.println("Enter the position of new employee (one of " + Arrays.toString(Position.values()) + "):");
        var positionName = SCANNER.nextLine();
        return Position.valueOf(positionName.trim().toUpperCase());
    }

    private Employee createNewEmployee() {
        System.out.println("Creating employee...");
        int id = checkID();
        System.out.println("Enter the name of new employee: ");
        String name = SCANNER.nextLine();
        Position position = checkPosition();
        System.out.println("Enter the salary of new employee: ");
        double salary = Double.parseDouble(SCANNER.nextLine());
        System.out.println("Enter the date of birth of new employee(in format yyyy-mm-dd): ");
        LocalDate dateOfBirth = LocalDate.parse(SCANNER.nextLine().trim());
        return new Employee(id, name, position, salary, dateOfBirth);
    }


    private void showEmployee() {

        if (employeeData.isEmpty()) {
            System.out.println(gap + nL + "There aren't any employees" + nL + gap);
        } else {
            for (var entry : employeeData.entrySet()) {
                System.out.println("ID: " + entry.getKey() + entry.getValue());
            }
        }

    }

    private int scanInput(int qOption) {
        System.out.println("Choose option (1-" + qOption + "):");
        int input = Integer.parseInt(SCANNER.nextLine());
        return input;
    }

    private void showMainMenu() {
        System.out.println("""
                Main menu:
                1. Show employees
                2. Create new employee
                3. Edit employee information
                4. Sorting
                5. Exit
                """);
    }
}
