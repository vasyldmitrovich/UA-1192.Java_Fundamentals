package com.softserve.edu10.pt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {// Ok
        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.displayEmployeeMap();

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        employeeManager.findEmployeeById(id);

        System.out.print("enter name: ");
        String name = scanner.nextLine();

        employeeManager.findEmployeeByName(name);

        scanner.close();
    }
}
