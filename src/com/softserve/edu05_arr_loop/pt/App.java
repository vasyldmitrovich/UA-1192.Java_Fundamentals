package com.softserve.edu05_arr_loop.pt;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class App {

    public static void main(String[] args) {// Good
        Scanner scanner = new Scanner(System.in);
        practicalTask1(scanner);
        practicalTask2(scanner);
        practicalTask3(scanner);
//        Employee.createEmployee();
        scanner.close();
    }

    public static void practicalTask1(Scanner scanner) {

        // Task 1: Create a string array and sort it
        String[] stringArray = new String[5];
        System.out.println("Input five characters/names/words to check sorting method: ");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
        }
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted String Array: " + Arrays.toString(stringArray));

        // Task 2: Create an array with 5 elements and calculate the average value
        double[] numbers = new double[5];
        System.out.println("Input five numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Consume the newline character after reading the numbers
        scanner.nextLine();

        double sum = Arrays.stream(numbers).sum();
        System.out.println("The average value of the integer array: " + (sum / numbers.length));

        // Task 3: Check if the array contains the value entered from the console
        System.out.print("Enter a value to search in the array (String for comparison): ");
        String searchValue = scanner.nextLine();
        boolean containsValue = Arrays.stream(stringArray).anyMatch(str -> str.equals(searchValue));

        // Check if any element converted to String matches the search value
        System.out.println("Does the integer array contain the value " + searchValue + "? " + containsValue);
    }

    public static void practicalTask2(Scanner scanner) {
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void practicalTask3(Scanner scanner) {
        int[] numbers = generateRandomArray(10);

        // Output the biggest number in the array
        int maxNumber = findMaxNumber(numbers);
        System.out.println("The biggest number in the array: " + maxNumber);

        // Output the sum of positive numbers and count the number of negative numbers
        int sumOfPositives = sumOfPositiveNumbers(numbers);
        int countOfNegatives = countNegativeNumbers(numbers);
        System.out.println("The sum of positive numbers: " + sumOfPositives);
        System.out.println("The count of negative numbers: " + countOfNegatives);

        // Determine whether there are more negative or positive values in the array
        String result = determineMore(numbers);
        System.out.println(result);
    }

    // Method to generate an array of random integers
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    // Method to find the biggest number in the array
    public static int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Method to find the sum of positive numbers
    public static int sumOfPositiveNumbers(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    // Method to count the number of negative numbers
    public static int countNegativeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

    // Method to determine whether there are more negative or positive values in the array
    public static String determineMore(int[] array) {
        int countOfPositives = 0;
        int countOfNegatives = 0;
        for (int num : array) {
            if (num > 0) {
                countOfPositives++;
            } else if (num < 0) {
                countOfNegatives++;
            }
        }
        if (countOfNegatives > countOfPositives) {
            return "There are more negative values in the array.";
        } else if (countOfPositives > countOfNegatives) {
            return "There are more positive values in the array.";
        } else {
            return "There are an equal number of positive and negative values in the array.";
        }
    }
    }






