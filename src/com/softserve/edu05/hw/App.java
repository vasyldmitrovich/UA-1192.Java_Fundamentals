package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {// Nice this is nice
        System.out.println("Homework task 1");
        task1();
        System.out.println("Homework task 2");
        task2();
        System.out.println("Homework task 3");
        task3();
        System.out.println("Homework task 4");
        task4();
    }

    public static void task1() {
    //calculates the number of days in that month based on an array
    //that contains the number of days in each month.
        int month = MonthNumber.getPrompt("Enter number of month: ");
        MonthNumber.getDays(month);

    //calculates the sum of the first five elements if they are
    //positive, or the product of the last five elements if they are not and output the result.
        TenIntegerNumbers.getPrompt("Enter integer number");
        TenIntegerNumbers.calcElements();

    //position of second positive number;
    //minimum value and its position in the array.
    //calculate the product of all entered even numbers (exclude 0 from even if entered by
    //user)
        FiveIntegerNumbers.getPrompt("Enter integer number");
        FiveIntegerNumbers.findSecondPos();
        FiveIntegerNumbers.findMinAndPos();
        FiveIntegerNumbers.findProdEven();
    }

    public static double task2() {
        double[] arr = new double[2];
        double sum = 0;
        String answer;
        do {
            for (int i = 0; i <= 1; i++) {
                System.out.println("Enter a number");
                arr[i] = scanner.nextDouble();
                sum += arr[i];
            }
            System.out.println("The result of sum of two numbers is:" + sum);
            System.out.println("Do you want enter another numbers?");
            scanner.nextLine();
            answer = scanner.nextLine();
            sum = 0;
        } while ((answer.equals("yes")));
        return sum;
    }


    public static void task3() {
        Car[] arrCar = {
                new Car("Renault", 2021, 1.6),
                new Car("Volkswagen", 2010, 1.9),
                new Car("Citroen", 2021, 1.1),
                new Car("Volvo", 2015, 2.5)
        };

        int year = Car.getInfo("Enter year of production");
        boolean found = false;
        for (
                int i = 0;
                i <= arrCar.length - 1; i++) {
            if (arrCar[i].getYearOfProduction() == year) {
                found = true;
                System.out.println(Arrays.toString(arrCar));
            }
        }
        if (!found) {
            System.out.println("There is no car of this production year");
        }
        Arrays.sort(arrCar, Comparator.comparing(Car::getYearOfProduction));
        System.out.println("Array after sorting");
        System.out.println(Arrays.toString(arrCar));
    }

    public static void task4() {
        Random random = new Random();
        int number = random.nextInt(0, 10);
        System.out.println("Guess a number from 0 to 10");
        int input = scanner.nextInt();
        do {
            if (input < number) {
                System.out.println("Too low try again");
            }
            if (input > number) {
                System.out.println("Too high try again");
            }
            if (input == number) {
                break;
            }
            input = scanner.nextInt();
        } while (number != input);
        System.out.println("You are guess!! Congratulation");
    }
}
