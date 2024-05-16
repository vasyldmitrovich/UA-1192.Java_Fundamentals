package com.softserve.edu05.pt;

import java.util.Scanner;

public class Employee {
    private static final Scanner SCANNER = new Scanner(System.in);// Name of final variable from UPPERCASE
    private String name;// Why public???
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public static int getNumber(String prompt) {
        System.out.println(prompt);
        return SCANNER.nextInt();
    }
}
