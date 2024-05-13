package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Practical task 1");
        task1();
        System.out.println("Practical task 2");
        task2();
        System.out.println("Practical task 3");
        task3();
        System.out.println("Practical task 4");
        task4();
    }

    public static void task1() {
        System.out.println("Create a string array and sort it");
        String[] countries = {"Mexico", "Ukraine", "USA", "Germany", "Spain", "Macedonia"};
        System.out.println("String array before sorting :");
        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println("String array after sorting :");
        System.out.println(Arrays.toString(countries));

        System.out.println("Create an array with 5 elements and calculate the average value");
        double[] numbers = {56.7, 34, 67.6, 4, 6.6};
        System.out.println(Arrays.toString(numbers));
        double sum = 0;
        for (int i = 0; i <= numbers.length - 1; i++) {
            sum = sum + numbers[i];
            if (i == numbers.length - 1) {
                double avg = sum / numbers.length;
                System.out.println("The average value is: " + avg);
                break;
            }
        }


        System.out.println("Сheck if the array \"countries\" contains the value");
        System.out.println("Input country :");
        String input = scanner.nextLine();
        if (Arrays.asList(countries).contains(input)) {
            System.out.println("Array contains the value " + input);
        } else {
            System.out.println("Array not contains the value " + input);
        }
    }

    public static void task2() {
        System.out.println("Enter a positive integer number>1 :");
        int input = scanner.nextInt();
        //counter of dividers
        int count = 0;

        if (input > 1) {
            for (int i = 1; i <= input; ) {
                if (input % i == 0) {
                    count++;
                    i++;
                    if (count > 2) {
                        System.out.println("Is not prime number");
                        break;
                    }
                } else {
                    i++;
                }
            }
            if (count == 2) {
                System.out.println("Is a prime number");
            }
        } else {
            System.out.println("Entered number is out of range of prime numbers");
        }
    }

    public static void task3() {
        Random random = new Random();
        int[] intArray = new int[10];
        int maxValue = 0;
        int sum = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i <= intArray.length - 1; i++) {
            intArray[i] = random.nextInt(-100, 100);
            if (intArray[i] > maxValue) {
                maxValue = intArray[i];
            }
            if (intArray[i] < 0) {
                negativeCount++;
            } else if (intArray[i] > 0) {
                positiveCount++;
                sum = sum + intArray[i];
            }
        }

        System.out.println(Arrays.toString(intArray));
        System.out.println("Max value is: " + maxValue);
        System.out.println("Sum of positive values is: " + sum);
        if (negativeCount > positiveCount) {
            System.out.println("There are more negative values in the array");
        } else if (negativeCount < positiveCount) {
            System.out.println("There are more positive values in the array");
        } else {
            System.out.println("There are an equal number of positive and negative values in the array");
        }
    }

    public static void task4() {
        Employee[] arrEmployee = {
                new Employee("Iryna", 1, 2350.6),
                new Employee("Oleksandr", 1, 4800.8),
                new Employee("Sergio", 5, 2548.8),
                new Employee("Kevin", 6, 1250.5),
                new Employee("Simon", 7, 4560.4)
        };
//Output employee of a certain department
        int dep = Employee.getNumber("Enter department number");
        boolean found = false;
        for (int i = 0; i <= arrEmployee.length - 1; i++) {
            if (arrEmployee[i].getDepartmentNumber() == dep) {
                found = true;
                System.out.println(arrEmployee[i].getName());
            }
        }
        if (!found) {
            System.out.println("There is no employee in this department");
        }
//arrange workers by the field salary in descending order.
        for (int i = 0; i < (arrEmployee.length - 1); i++) {
            for (int j = 0; j < arrEmployee.length - i - 1; j++) {
                if (arrEmployee[j].getSalary() < arrEmployee[j + 1].getSalary()) {
                    var tmp = arrEmployee[j];
                    arrEmployee[j] = arrEmployee[j + 1];
                    arrEmployee[j + 1] = tmp;
                }
            }
        }
        for (var employee : arrEmployee) {
            System.out.println("\n" + employee.getName() + ":" + employee.getDepartmentNumber() + ":" + employee.getSalary());
        }
    }
}
