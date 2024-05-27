package com.softserve.edu05.ptask;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AppPt {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {// Ok
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        String[] names = {"Nastya", "Anna", "Vova", "Alla", "Roman"};
        System.out.println(Arrays.toString(names));
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        double[] numbers = {1, 2, 22, 34, 1};
        double sum = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        double avarage = sum / numbers.length;
        System.out.println("The average value is: " + avarage);

        System.out.println("Enter the name to search: ");
        String nameToSearch = scan.nextLine();
        boolean found = false;
        for (var name : names) {
            if (name.equals(nameToSearch)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The name " + nameToSearch + " is on the list");
        } else {
            System.out.println("The name " + nameToSearch + " is not found");
        }
    }

    public static void task2() {
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        if (isPrime(number)) {
            System.out.println("The number " + number + " is prime");
        } else {
            System.out.println("The number " + number + " is not prime");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 0) number = -number;

        if (number == 1) return false;

        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static void task3() {
        Random rnd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(-99, 100);
        }

        System.out.println(Arrays.toString(arr));

        System.out.println("The max value is: " + max(arr));

        System.out.println("The sum of positive values is: " + sumPositives(arr));

        System.out.println("The number of negatives is: " + countNegatives(arr));

        int countPositsves = countPositives(arr);
        int countNegatives = countNegatives(arr);

        if (countPositsves < countNegatives) {
            System.out.println("There are more negative values in the array.");
        } else if (countNegatives < countPositsves) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int sumPositives(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    static int countNegatives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i < 0) {
                count++;
            }
        }
        return count;
    }

    static int countPositives(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }

    public static void task4() {
        Employee[] employees = {
                new Employee("Alla", 1, 1000),
                new Employee("Sasha", 2, 2000),
                new Employee("Nastya", 1, 2000),
                new Employee("Toma", 2, 1500),
                new Employee("Nikita", 3, 3000),
        };

        System.out.println("Enter department number: ");
        int num = scan.nextInt();

        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == num) {
                System.out.println(employee);
                found = true;
            }
        }

        if (!found) {
            System.out.println("There are no employees from " + num + " department");
        }

        sort(employees);
        for (var employee : employees) {
            System.out.println(employee);
        }
    }

    public static void sort(Employee[]employees){
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    var swap = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = swap;
                }
            }
        }
    }
}