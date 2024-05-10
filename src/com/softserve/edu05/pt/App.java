package com.softserve.edu05.pt;

import java.util.*;
import java.util.stream.IntStream;

public class App {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        String[] strArray = {"pineapple", "apple", "banana", "orange"};

        Arrays.sort(strArray);
        System.out.println("Sorted string array: " + Arrays.toString(strArray));

        int[] intArray = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int d : intArray) {
            sum += d;
        }

        double average = (double) sum / intArray.length;
        System.out.println("Average of array: " + average);

        System.out.println("Input value to search in fruits array: ");
        String searchValue = scanner.nextLine();

        System.out.println(Arrays.asList(strArray).contains(searchValue) ?
                "The array contains the entered value" : "The array does not contain the entered value");

    }

    private static void task2() {
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            return;
        }

        if (isPrime(number)) {
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not prime number");
        }

    }

    private static void task3() {
        int[] randomArray = IntStream.generate(() -> new Random().nextInt(-100,100)).limit(10).toArray();

        System.out.println("Array: " + Arrays.toString(randomArray));

        int max = 0;
        int sum = 0;
        int negativeNumbersCount = 0;

        for (int i : randomArray) {
            if (i > max) {
                max = i;
            }
            if (i > 0) {
                sum += i;
            }
            if (i < 0) {
                negativeNumbersCount++;
            }
        }

        System.out.println("The biggest number is: " + max);
        System.out.println("The sum of positive numbers is: " + sum);
        System.out.println("Count of negative numbers is: " + negativeNumbersCount);

        int positiveNumbersCount = randomArray.length - negativeNumbersCount;

        if (negativeNumbersCount > positiveNumbersCount) {
            System.out.println("There are more negative numbers in the array");
        } else if (positiveNumbersCount > negativeNumbersCount) {
            System.out.println("There are more positive numbers in the array");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }
    }

    private static void task4() {
        Employee[] employees = {
                new Employee("Jack", "d-001", 35),
                new Employee("John", "d-002", 23),
                new Employee("Alice", "d-003", 54),
                new Employee("Jenifer", "d-001", 100),
                new Employee("Conor", "d-001", 10)
        };

        System.out.println("Generated employees");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\nInput department number: ");
        String departmentNumber = scanner.nextLine();

        Employee[] employeesWithGivenDepartment = Arrays
                .stream(employees)
                .filter(i -> i.getDepartmentNumber().equals(departmentNumber))
                .toArray(Employee[]::new);


        System.out.println("Employees with given department:");
        for (Employee employee : employeesWithGivenDepartment) {
            System.out.println(employee);
        }

        if (employeesWithGivenDepartment.length == 0) {
            System.out.println("There are no employees with given department");
        }

        Arrays.sort(employees, Comparator.comparing(Employee::getSalary).reversed());

        System.out.println("Employees sorted by salary: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {

            if ((number % i) == 0) {
                return false;
            }

        }

        return true;
    }

}
