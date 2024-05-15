package com.softserve.edu05.pt;

import java.util.Scanner;

public class Employee {
    private static final Scanner scanner = new Scanner(System.in);// Name of final variable from UPPERCASE
    public String name;// Why public???
    public int departmentNumber;
    public double salary;

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
        return scanner.nextInt();
    }
}
