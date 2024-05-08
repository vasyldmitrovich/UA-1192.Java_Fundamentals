package com.softserve.edu03.pt;

import java.util.Scanner;

public class App {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {// Very nice
        demonstrateNumberUtils();
        System.out.println();
        demonstrateEmployees();
    }

    private static void demonstrateNumberUtils() {
        try {
            System.out.print("Enter first number: ");
            double firstNumber = NumberUtils.getNumber(SC.nextLine());
            System.out.print("Enter second number: ");
            double secondNumber = NumberUtils.getNumber(SC.nextLine());

            System.out.printf("The sum of %f and %f is %f%n",
                    firstNumber, secondNumber, NumberUtils.getTotal(firstNumber, secondNumber));
            System.out.printf("The average of %f and %f is %f%n",
                    firstNumber, secondNumber, NumberUtils.getAverage(firstNumber, secondNumber));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void demonstrateEmployees() {
        try {
            System.out.println("Enter name, rate and hours by 1st Employee (in one line by space):");
            Employee firstEmployee = new Employee(SC.nextLine());
            System.out.println("Enter name, rate and hours by 2nd Employee (in one line by space):");
            Employee secondEmployee = new Employee(SC.nextLine());
            System.out.println("Enter name, rate and hours by 3rd Employee (in one line by space):");
            Employee thirdEmployee = new Employee(SC.nextLine());

            System.out.println(firstEmployee);
            System.out.println(secondEmployee);
            System.out.println(thirdEmployee);
            System.out.printf("Total employees' salary: %f%n", Employee.getTotalSum());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
