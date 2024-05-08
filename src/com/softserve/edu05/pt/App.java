package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class App {

    public static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.println("Task 1");
            demonstrateArraysTask();
            System.out.println();

            System.out.println("Task 2");
            demonstratePrimeNumberTask();
            System.out.println();

            System.out.println("Task 3");
            demonstrateRandomIntegersTask();
            System.out.println();

            System.out.println("Task 4");
            demonstrateEmployeeTask();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    public static void demonstrateArraysTask() throws NumberFormatException {
        System.out.println("=== String array ===");
        demonstrateStringArray();
        System.out.println("=== Integer array ===");
        demonstrateIntegerArray();
    }

    public static void demonstrateStringArray() throws NumberFormatException {
        System.out.print("Input array's length: ");
        int length = Integer.parseInt(SCAN.nextLine());
        String[] strings = StringUtils.inputArray(length);

        StringUtils.sortBubble(strings);
        System.out.println("Sorted array: " + Arrays.toString(strings));

        System.out.print("Input word to check contains: ");
        String word = SCAN.nextLine();
        boolean contains = StringUtils.contains(strings, word);
        if (contains) {
            System.out.println("Word is present in array");
        } else {
            System.out.println("Word is not present in array");
        }
    }

    public static void demonstrateIntegerArray() throws NumberFormatException {
        System.out.print("Input array's length: ");
        int length = Integer.parseInt(SCAN.nextLine());
        int[] integers = NumberUtils.inputArray(length);

        System.out.println("Average value: " + NumberUtils.getAverage(integers));

        System.out.print("Input number to check contains: ");
        int number = Integer.parseInt(SCAN.nextLine());
        boolean contains = NumberUtils.contains(integers, number);
        if (contains) {
            System.out.println("Number is present in array");
        } else {
            System.out.println("Number is not present in array");
        }
    }

    public static void demonstratePrimeNumberTask() throws NumberFormatException {
        int number = 0;
        do {
            System.out.print("Input positive number: ");
            number = Integer.parseInt(SCAN.nextLine());
        } while (number <= 0);
        boolean isPrime = NumberUtils.isPrime(number);
        if (isPrime) {
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not prime number");
        }
    }

    private static void demonstrateRandomIntegersTask() throws NumberFormatException {
        System.out.print("Input array's length: ");
        int length = Integer.parseInt(SCAN.nextLine());
        int[] numbers = NumberUtils.generateRandomArray(length);
        System.out.println("Random values: " + Arrays.toString(numbers));

        System.out.println("The biggest number: " + NumberUtils.getMax(numbers));
        System.out.println("Sum of positives: " + NumberUtils.getSumOfPositives(numbers));
        System.out.println("Count of negatives: " + NumberUtils.getNegativesCount(numbers));

        int posNegDifference = NumberUtils.checkMorePosOrNeg(numbers);
        switch (posNegDifference) {
            case 1 -> System.out.println("There are more positives");
            case -1 -> System.out.println("There are more negatives");
            case 0 -> System.out.println("There are equal positives and negatives");
            default -> System.out.println("Error");
        }
    }

    private static void demonstrateEmployeeTask() throws NumberFormatException {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1));
            employees[i] = EmployeeUtils.input();
        }

        System.out.println("Employees:");
        EmployeeUtils.printEmployees(employees);

        System.out.print("Input department of employees: ");
        int department = Integer.parseInt(SCAN.nextLine());
        Employee[] filtered = EmployeeUtils.filterByDepartment(department, employees);
        if (filtered.length == 0) {
            System.out.println("No employees found");
        } else {
            System.out.println("Employees by department:");
            EmployeeUtils.printEmployees(filtered);
        }

        System.out.println("Sorted by salary in descending order:");
        EmployeeUtils.sortBySalaryDesc(employees);
        EmployeeUtils.printEmployees(employees);
    }
}
