package com.softserve.academy.edu05.pt;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Pt5 {
    /**
     *     Write a Java program that performs the following tasks and outputs the results:
     *     Create a string array and sort it.
     */
    public static String[] task1() {
        String[] array = {"Dog", "Cat", "Elephant", "Lion", "Tiger"};
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Create an array with 5 elements and calculate the average value
     */
    public static double task2(int[] arrayInt) {
        return Arrays.stream(arrayInt).average().getAsDouble();
    }

    /**
     *     Сheck if the array (any of the previous ones) contains the value ( value enter console).
     *     Output the result of the search.
     */
    public static int task3(int[] arrayInt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to search:");
        int value = scanner.nextInt();
        int index = IntStream.range(0, arrayInt.length)
                .filter(i -> arrayInt[i] == value)
                .findFirst()
                .orElse(-1);

        if (index != -1) {
            System.out.println("The value is found at index " + index);
        } else {
            System.out.println("The value is not found in the array");
        }
        return index;
    }

    /**
     *     Write a Java program that asks the user to enter a positive integer and determines
     *     whether it is a prime number. If the number is prime, output a message “Is a prime
     *     number”. Otherwise, output a message “Is not prime number”.
     */
    public static boolean task4(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                System.out.println("Is not prime number");
                return false;
            }
        }
        System.out.println("Is a prime number");
        return true;
    }

    /**
     *     3.* Create an array of ten random integers using a random number generator.
     *     Output:
     *             • the biggest number in the array;
     *             • the sum of positive numbers;
     *             • count the number of negative numbers.
     *             • determine whether there are more negative or positive values in the array. If there are
     *     more negative values, output "There are more negative values in the array." Otherwise,
     *     output "There are more positive values in the array." If the counts are equal, output
     *     There are an equal number of positive and negative values in the array.
     */
    public static int[] task5() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
        }
        System.out.println("Array: " + Arrays.toString(array));
        int max = Arrays.stream(array).max().getAsInt();
        int sum = Arrays.stream(array).filter(i -> i > 0).sum();
        long negativeCount = Arrays.stream(array).filter(i -> i < 0).count();
        long positiveCount = Arrays.stream(array).filter(i -> i > 0).count();
        if (negativeCount > positiveCount) {
            System.out.println("There are more negative values in the array.");
        } else if (negativeCount < positiveCount) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
        return new int[]{max, sum, (int) negativeCount};
    }

    /**
     *       4.* Create a class called Employee with fields: name, department number, salary.
     *             • In main() method create five objects of class Employee.
     *             • Output results for:
     *     - all employees of a certain department (input department number in the console);
     *     - arrange workers by the field salary in descending order.
     */
    public static void task6() {
        Employee[] employees = {
                new Employee("John", 1, BigDecimal.valueOf(1000)),
                new Employee("Jane", 2, BigDecimal.valueOf(2000)),
                new Employee("Jack", 1, BigDecimal.valueOf(1500)),
                new Employee("Jill", 3, BigDecimal.valueOf(3000)),
                new Employee("Jim", 2, BigDecimal.valueOf(2500))
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the department number:");
        int departmentNumber = scanner.nextInt();
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == departmentNumber) {
                System.out.println(employee);
            }
        }

        System.out.println("Sort by salary:");
        Arrays.sort(employees, (e1, e2) -> e2.getSalary().compareTo(e1.getSalary()));
        System.out.println(Arrays.toString(employees));
    }
}
