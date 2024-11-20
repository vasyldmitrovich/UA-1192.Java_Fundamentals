package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {

//        task1();
//        task2();
//        task3();
        task4();
    }

    public static void task1() {

        int[] firstMassive = {6, 24, -5, 1, 6};


        int count = 0;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < firstMassive.length - 1; i++) {
                if (firstMassive[i] > firstMassive[i + 1]) {
                    isSorted = false;
                    /*int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;*/
                    firstMassive[i] = firstMassive[i] + firstMassive[i + 1] - (firstMassive[i + 1] = firstMassive[i]);
                    count++;
                }
            }
            System.out.println("firstMassive = " + Arrays.toString(firstMassive));
        }
        System.out.println("How many operations = " + count);

        //second question

        double sum = 0.0;
        for (int i = 0; i <= firstMassive.length - 1; i++) {
            sum += firstMassive[i];

        }
        System.out.println("sum firstMassive = " + sum);
        double ave = sum / firstMassive.length;
        System.out.println("average firstMassive = " + ave);

        //third question

        System.out.print("Input searching number :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= firstMassive.length - 1; i++) {
            if (n == firstMassive[i]) {
                System.out.println("searching number: " + n + " in array i = [" + i + "]");
            }

        }

    }


    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input positive integer number: ");
        int number = scanner.nextInt();

        if (getPrime(number)) {
            System.out.println("Is a prime number");
        } else {
            System.out.println("Is not prime number");
        }
    }


    public static void task3() {

        int size = 15;

        int[] array = new int[size];

        Random random = new Random();

        IntStream.range(0, size)
                .forEach(index -> array[index] = random.nextInt(-100, 100));

        System.out.println(Arrays.toString(array));

        int max = array[0];
        int i = 0;
        while (i < array.length) {
            if (array[i] > max) {
                max = array[i];
            }
            i++;
        }
        System.out.println("the biggest number in the array = " + max);

        i = 0;
        int sumPositive = 0;
        while (i < array.length) {
            if (array[i] > 0) {
                sumPositive += array[i];
            }
            i++;
        }
        System.out.println("the sum of positive numbers = " + sumPositive);

        i = 0;
        int countNeg = 0;
        while (i < array.length) {
            if (array[i] < 0) {
                countNeg++;
            }
            i++;
        }
        System.out.println("count the number of negative numbers = " + countNeg);

        if (size - countNeg > countNeg) {
            System.out.println("There are more positive values in the array.");
        } else {
            System.out.println("There are more negative values in the array.");
        }

    }

    private static void task4() {// Ok
        Employee[] array = {
                new Employee("Fedor", 1, 250.0),
                new Employee("Alex", 2, 520.0),
                new Employee("Elina", 2, 300.0),
                new Employee("Nik", 2, 400.0),
                new Employee("Tamara", 1, 250.0)
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number of searching department: ");
        int srDepNumber = scanner.nextInt();

        System.out.println("Name of employees " + srDepNumber + " department is: ");

        for (int i = 0; i < array.length; i++) {
            if (srDepNumber == array[i].getDepNumber()) {
                System.out.println(array[i].getName());
            }
        }
        System.out.println();
        System.out.println("Sorting workers by the salary in descending order");

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].getSalary() < array[j + 1].getSalary()) {
                    var tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        for (var employee : array) {
            System.out.println(employee.getName() + " salary is: " + employee.getSalary());
        }


    }


    private static boolean getPrime(int number) {
        for (int i = 2; i < number; i++) {

            if ((number % i) == 0) {
                return false;
            }

        }

        return number >= 2;
    }


}