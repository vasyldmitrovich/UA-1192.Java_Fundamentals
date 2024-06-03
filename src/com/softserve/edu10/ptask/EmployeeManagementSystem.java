package com.softserve.edu10.ptask;

import java.time.LocalDate;
import java.util.*;

import static java.util.Comparator.comparing;

public class EmployeeManagementSystem {

    private Map<Integer, Employee> employees = new LinkedHashMap<>();

    public EmployeeManagementSystem() {
        addEmployee(new Employee(1, "Alla", Position.MANAGER, 2000,
                LocalDate.parse("2001-05-02")));
        addEmployee(new Employee(2, "Nastya", Position.QA, 2000,
                LocalDate.parse("2001-10-21")));
    }

    public void run() {
        out:
        while (true) {
            showMainMenu();
            int option = readOption(5);
            switch (option) {
                case 1 -> showEmployee();
                case 2 -> {
                    var employee = promptAddNewEmployee();
                    addEmployee(employee);
                }
                case 3 -> editEmployee();
                case 4 -> sortEmployee();
                case 5 -> {
                    break out;
                }
            }
        }
        System.out.println("Bye!");
    }

    private void showMainMenu() {
        System.out.println("Main menu:\n" +
                "1. Show employees\n" +
                "2. Add new employee\n" +
                "3. Edit employee\n" +
                "4. Sort\n" +
                "5. Exit");
    }

    private int readOption(int nOptions) {
        System.out.println("Enter option (1.." + nOptions + "):");
        var scan = new Scanner(System.in);
        int res = Integer.parseInt(scan.nextLine());
        return res;
    }

    private void showEmployee() {
        if (employees.isEmpty()) {
            System.out.println("There are no employees yet");
        } else {
            for (var entry : employees.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    private void addEmployee(Employee employee) {
        if (employees.containsKey(employee.id())) {
            throw new IllegalArgumentException("Employee with ID "
                    + employee.id() + " already exists");
        }
        employees.put(employee.id(), employee);
    }

    private Employee promptAddNewEmployee() {
        var scan = new Scanner(System.in);
        System.out.println("Let's add new employee!");
        int id = readIdForNewEmployee();
        System.out.println("Enter name: ");
        String name = scan.nextLine();
        Position position = readPosition();
        System.out.println("Enter salary: ");
        double salary = Double.parseDouble(scan.nextLine());
        System.out.println("Enter the date of birth (use format 1991-01-01): ");
        LocalDate dateOfBirth = LocalDate.parse(scan.nextLine().trim());
        return new Employee(id, name, position, salary, dateOfBirth);
    }

    private int readIdForNewEmployee() {
        var scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter ID for the new employee:");
            int id = Integer.parseInt(scan.nextLine());
            if (!employees.containsKey(id)) {
                return id;
            }
            System.out.println("The ID is already occupied, choose another one.");
        }
    }

    private Position readPosition() {
        var scan = new Scanner(System.in);
        System.out.println("Enter position (one of " + Arrays.toString(Position.values()) + "):");
        var positionText = scan.nextLine();
        return Position.valueOf(positionText.trim().toUpperCase());
    }

    private void editEmployee() {
        var scan = new Scanner(System.in);
        System.out.println("Enter the ID of the employee to edit: ");
        int id = Integer.parseInt(scan.nextLine());
        var employee = employees.get(id);
        if (employee == null) {
            System.out.println("There is no employee ID: " + id);
            return;
        }
        System.out.println("The current name is: " + employee.name());
        System.out.println("Enter new name or an empty line to keep current: ");
        String name = scan.nextLine().trim();
        if (!name.isEmpty()) {
            employee = employee.withName(name);
        }
        System.out.println("The current position is: " + employee.position());
        System.out.println("Enter new position or an empty line to keep current: ");
        String positionText = scan.nextLine().trim();
        if (!positionText.isEmpty()) {
            Position newPosition = Position.valueOf(positionText);
            employee = employee.withPosition(newPosition);
        }
        System.out.println("The current salary is: " + employee.salary());
        System.out.println("Enter new salary or an empty line to keep current: ");
        String salaryText = scan.nextLine().trim();
        if (!salaryText.isEmpty()) {
            double newSalary = Double.parseDouble(salaryText);
            employee = employee.withSalary(newSalary);
        }
        employees.put(id, employee);
    }

    private void sortEmployee() {
        System.out.println("Choose the sorting order:\n" +
                "1. ID\n" +
                "2. Name\n" +
                "3. Position");
        int option = readOption(3);
        Comparator<Employee> comparator = switch (option) {
            case 1 -> comparing(Employee::id);
            case 2 -> comparing(Employee::name);
            case 3 -> comparing(Employee::position);
            default -> throw new IllegalStateException("Never should be here");
        };

        List<Employee> employeeList = new ArrayList<>(employees.values());
        employeeList.sort(comparator);
        employees = new LinkedHashMap<>();
        for (var employee : employeeList) {
            employees.put(employee.id(),employee);
        }
        showEmployee();
    }
}




