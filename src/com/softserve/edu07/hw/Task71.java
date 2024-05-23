package com.softserve.edu07.hw;

import java.util.Arrays;
import java.util.Comparator;

public class Task71 {


    public static void execute() {
        Employee[] employees = createArr();

        System.out.println("Employees list sorted by salary from highest:");
        Arrays.sort(employees, Comparator.comparing((Employee::calculatePay)).reversed());
        Arrays.stream(employees).forEach(employee ->
                System.out.println(String.format("ID: %s, Name: %s, Salary: %s",
                        employee.getEmployeeId(), employee.getName(), employee.calculatePay())));

    }

    private static Employee[] createArr() {
        Employee[] employees = new Employee[5];

        HourlyPaidWorker worker1 = new HourlyPaidWorker(12.5, "01", "Bob", "16482");
        worker1.setHours(140);
        HourlyPaidWorker worker2 = new HourlyPaidWorker(7.5, "02", "Jim", "131214");
        worker2.setHours(140);
        employees[0] = worker1;
        employees[1] = worker2;
        employees[2] = new FixedPayWorker(2800, "03", "Gill", "812345");
        employees[3] = new FixedPayWorker(1600, "04", "Mary", "145145");
        employees[4] = new FixedPayWorker(800, "05", "Jack", "132321");

        return employees;
    }

}
