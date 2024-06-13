package com.softserve.edu10.pt;

import java.util.Objects;
import java.util.Scanner;

public class Employee {// Nice to see class like that
    private String name;
    private String position;
    private double salary;
    private int dateOfBirth;
    public static final Scanner SCANNER = new Scanner(System.in);

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, String position, double salary, int dateOfBirth) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String promptName(String name) {
        System.out.println("Enter new name of employee: " + name);
        return SCANNER.nextLine();
    }

    public String promptPosition(String name) {
        System.out.println("Enter position of employee " + name);
        return SCANNER.nextLine();
    }

    public double promptSalary(String name) {
        System.out.println("Enter salary of employee " + name);
        return SCANNER.nextDouble();
    }

    public int promptDateOfBirth(String name) {
        System.out.println("Enter date of birth of employee " + name);
        return SCANNER.nextInt();
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, salary, dateOfBirth);
    }
}

