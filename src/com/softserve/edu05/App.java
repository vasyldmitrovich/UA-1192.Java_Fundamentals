package com.softserve.edu05;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

public class App {


    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        String[] names = {"Alice", "Bob", "Charlie", "David"};
        System.out.println("Original String Array: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted String Array: " + Arrays.toString(names));

        int[] numbers = new int[5];
        System.out.println("Enter 5 integer values:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        double average = calculateAverage(numbers);
        System.out.println("Average of the integer array: " + average);

        System.out.println("Enter a value to search (String for names, int for numbers):");
        String searchValue = scanner.next();

        boolean found = searchValue.matches("\\d+") ? containsInt(numbers, Integer.parseInt(searchValue)) : containsString(names, searchValue);
        System.out.println(searchValue + (found ? " is found in the array." : " is not found in the array."));

        scanner.close();
    }// Good

    public static double calculateAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static boolean containsString(String[] arr, String value) {
        return Arrays.asList(arr).contains(value);
    }

    public static boolean containsInt(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void task2() {
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        boolean isPrime = PrimeChecker.isPrimeNumber(number);

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }// Good

    public static void task3() {
        int[] array = ArrayUtils.generateRandomArray(10);
        int max = ArrayUtils.findMax(array);
        System.out.println("The biggest number in the array: " + max);
        int sumOfPositives = ArrayUtils.calculateSumOfPositives(array);
        int negativeCount = ArrayUtils.countNegatives(array);
        System.out.println("Sum of positive numbers: " + sumOfPositives);
        System.out.println("Number of negative numbers: " + negativeCount);
        ArrayUtils.printMoreNegOrPos(array);
    }
    public static void task4() {
        Employee[] employees = TestData.getEmployees();// Very nice decision use method like that nice
        System.out.print("Enter department number: ");
        int departmentNumber = scanner.nextInt();
        System.out.println("Employees of department " + departmentNumber + ":");
        for (Employee employee : employees) {
            if (employee.departmentNumber == departmentNumber) {
                System.out.println(employee.name + " - Salary: $" + employee.salary);
            }
        }

        // Sort employees by salary in descending order
        Arrays.sort(employees, Comparator.comparingDouble((Employee e) -> e.salary).reversed());

        // Output employees sorted by salary
        System.out.println("\nEmployees sorted by salary in descending order:");
        for (Employee employee : employees) {
            System.out.println(employee.name + " - Salary: $" + employee.salary);
        }
    }

}
