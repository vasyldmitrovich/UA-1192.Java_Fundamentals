package com.softserve.edu05.pt;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// All is good
        System.out.println("Task 1: ");
        task1();
        System.out.println("Task 2: ");
        task2();
        System.out.println("Task 3: ");
        task3();
        System.out.println("Task 4: ");
        task4();

    }

    public static void task1() {
        String[] carNames = {"BMW", "AUDI", "MERCEDES", "HYUNDAI", "OPEL"};
        System.out.println(Arrays.toString(carNames));
        Arrays.sort(carNames);
        System.out.println(Arrays.toString(carNames));

        int[] nums = {1, 5, 3, 3, 2};
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        double average = (double) sum / nums.length;
        System.out.println("Average value is: " + average);

        System.out.println("Enter the car name to search: ");
        String carNameToSearch = sc.nextLine();
        carNameToSearch = carNameToSearch.toUpperCase();
        boolean found = false;
        for (var carName : carNames) {
            if (carName.equals(carNameToSearch)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Car with this name is in the list!");
        } else {
            System.out.println("There isn't car with this name in the list!");

        }
    }

    public static void task2() {
        System.out.println("Enter any positive integer: ");
        int num = sc.nextInt();
        if (CheckPrime.isPrime(num)) {
            System.out.println("The number " + num + " is prime!");
        } else {
            System.out.println("The number " + num + " is not prime!");
        }
    }

    public static void task3() {
        int[] arr = Task3Methods.generateRandom(10);
        System.out.println(Arrays.toString(arr));
        System.out.println("The biggest number is: " + Task3Methods.getBiggestNumber(arr));
        System.out.println("The sum of positive values is: " + Task3Methods.sumOfPositives(arr));
        System.out.println("Number of negative nums is: " + Task3Methods.countNegative(arr));
        if (Task3Methods.countPositive(arr) == Task3Methods.countNegative(arr)) {
            System.out.println("There are an equal number of positives and negatives values!");
        } else if (Task3Methods.countPositive(arr) > Task3Methods.countNegative(arr)) {
            System.out.println("There are more positive values!");
        } else {
            System.out.println("There are more negative values!");
        }
    }

    public static void task4() {
        Employee[] employees = {
                new Employee("Eugene", 101, 2300.50),
                new Employee("Bill", 105, 1600.50),
                new Employee("John", 101, 3250.30),
                new Employee("Emily", 98, 2100),
                new Employee("Alice", 105, 2600.40)
        };

        System.out.println("Enter department number: ");
        int depNum = sc.nextInt();
        boolean found = false;
        for (var employee : employees) {
            if (employee.getDepartmentNumber() == depNum) {
                System.out.println(employee);
                found = true;
            }
        }

        if (!found) {
            System.out.println("There isn't department with number " + depNum);
        }
        SortingEmployee.sortEmployee(employees);
        System.out.println("Sorted list of employees: ");
        for (var employee : employees) {
            System.out.println(employee);
        }
    }
}
