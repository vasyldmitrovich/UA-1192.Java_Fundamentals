package com.softserve.edu10.pt.pt2;

import java.time.LocalDate;

public record Employee(
        int id,
        String name,
        Position position,
        double salary,
        LocalDate dateOfBirth
) {
    @Override
    public String toString() {
        return " Employee: " +
                name + " - " +
                "Position: " + position + " - "
                + "Salary: " + salary + " - "
                + "Date of birth: " + dateOfBirth + " - ";
    }

    public Employee withName(String name) {
        return new Employee(id, name, position, salary, dateOfBirth);
    }

    public Employee withPosition(Position position) {
        return new Employee(id, name, position, salary, dateOfBirth);
    }

    public Employee withSalary(double salary) {
        return new Employee(id, name, position, salary, dateOfBirth);
    }
}
