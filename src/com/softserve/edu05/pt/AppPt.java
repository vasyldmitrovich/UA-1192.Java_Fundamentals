package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AppPt {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("**************************First practical task**************************");
        firstPractical();
        System.out.println("**************************Second practical task**************************");
        SecondPractical();
        System.out.println("**************************Third practical task**************************");
        thirdPractical();
        System.out.println("**************************Fourth practical task**************************");
        fourthPractical();
    }

    public static void firstPractical() {
        System.out.println("Task 1\n• Create a string array and sort it.");
        String array[] = new String[5];
        array[0] = "First";
        array[1] = "Second";
        array[2] = "Third";
        array[3] = "Fours";
        array[4] = "Fifth";

        System.out.println("Our array before sorting " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Our array after sorting " + Arrays.toString(array));

        System.out.println("/////////////////////////////////////////////////////////////////");
        System.out.println("Task 2\n• Create an array with 5 elements and calculate the average value");
        int intArray[] = {32, 54, 76, 4, 2};
        int average = 0;
        System.out.println("Array:" + Arrays.toString(intArray));
        for (int i = 0; i < intArray.length; i++) {
            average += intArray[i];
        }
        average = average / 5;
        System.out.println("Your average is:" + average);

        System.out.println("/////////////////////////////////////////////////////////////////");
        System.out.println("Task 3\n• Check if the array (any of the previous ones) contains the value ( value enter from the console). Output the result of the search");
        System.out.println("Enter a number to check if it is in the array");
        //Використовуємо числовий масив intArray
        int num = scanner.nextInt();
        Arrays.sort(intArray);
        if (Arrays.binarySearch(intArray, num) >= 0) {
            System.out.println("Your number is included in the array");
        } else {
            System.out.println("Your number is not included in the array");
        }
    }

    public static void SecondPractical() {
        System.out.println("Please enter the positive integer");
        int number = scanner.nextInt();
        if (isPrime(number)) {
            System.out.println("Is a prime number");
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            System.out.println("Is not prime number because it`s 1 or number <0");
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Is not prime number because a number is divisible without remainder by another number");
                return false;
            }
        }
        return true;
    }

    public static void thirdPractical() {
        int array[] = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-10, 10);
        }
        System.out.println("Array of random numbers is generated:\n" + Arrays.toString(array));

        int max = array[0];
        int couterPoz = 0;
        int couterNeg = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (array[i] > 0) {
                sum += array[i];
                couterPoz++;
            } else if (array[i] < 0) {
                couterNeg++;
            }
        }

        System.out.println("The biggest number in the array:" + max);
        System.out.println("The sum of positive numbers:" + sum);
        System.out.println("The number of positive numbers:" + couterPoz);
        System.out.println("The number of negative numbers:" + couterNeg);

        if (couterPoz > couterNeg) {
            System.out.println("There are more positive values in the array.");
        } else if (couterPoz < couterNeg) {
            System.out.println("There are more negative values in the array.");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array.");
        }
    }

    public static void fourthPractical() {
        Employee employees[] = {
                new Employee("Vasya", 2, 3000),
                new Employee("Danya", 4, 6030),
                new Employee("Dima", 2, 22290),
                new Employee("Petya", 4, 34000),
                new Employee("Pasha", 1, 44000)
        };

        System.out.println("Enter the number of department");
        int number = scanner.nextInt();
        Employee.findByDep(employees, number);
        Employee.sortBySalary(employees);
        System.out.println("Sorted workers by the field salary in descending order\n" + Arrays.toString(employees));
    }
}
