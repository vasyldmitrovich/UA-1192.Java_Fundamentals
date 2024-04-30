package com.softserve.edu03.pt;

import com.softserve.edu03.pt.model.Employee;

import java.util.Scanner;

public class AppPractical {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //part 1
        double a = getNumber("Enter the first number: ");
        double b = getNumber("Enter the the second number: ");
        System.out.printf("The sum of %s and %s is %s \n", a, b, getTotal(a, b));
        System.out.printf("The average of %s and %s is %s \n", a, b, getAverage(a, b));
        //part 2
        Employee employee1 = new Employee("Kate", 2, 40);
        Employee employee2 = new Employee("David", 4, 25);
        Employee employee3 = new Employee("Luke", 6, 60);

        System.out.println("Total salary : " + Employee.getTotalSum());
        System.out.println("Total salary with bonus : " + Employee.getTotalSumWithBonus());
    }

    private static double getNumber(String prompt) {
        System.out.println(prompt);
        return scanner.nextDouble();
    }

    private static double getTotal(double a, double b) {
        return a + b;
    }

    private static double getAverage(double a, double b) {
        return (a + b) / 2;
    }
}
