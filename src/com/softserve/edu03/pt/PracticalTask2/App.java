package com.softserve.edu03.pt.PracticalTask2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee1 = new Employee("Ivan", 80, 12);
        Employee employee2 = new Employee("Andrew");
        employee2.setRate(75);
        employee2.setHours(9);
        Employee employee3 = new Employee();
        System.out.println("Enter the employee's name");
        employee3.setName(sc.nextLine());
        System.out.println("Enter the employee's rate");
        try {
            employee3.setRate(sc.nextInt());
            System.out.println("Enter the employee's hours");
            employee3.setHours(sc.nextInt());
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("Total salary of 3 employees is " + Employee.getTotalSum());
    }
}
