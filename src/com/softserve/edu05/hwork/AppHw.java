package com.softserve.edu05.hwork;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class AppHw {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        task1one();
        task1two();
        task1three();
        task2();
        task3();
        task4();

    }

    public static void task1one() {
        int monthDays[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println("Enter a month number: ");
        int monthNumber = scan.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            int days = monthDays[monthNumber];
            System.out.println("Number of days in month " + monthNumber + ": " + days);
        } else {
            System.out.println("Please enter a number between 1 and 12");
        }
    }

    public static void task1two() {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter an integer number: ");
            numbers[i] = scan.nextInt();
        }

        boolean fivePositive = true;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] <= 0) {
                fivePositive = false;
                break;
            }
        }

        if (fivePositive) {
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += numbers[i];
            }
            System.out.println("The sum of the first five positive elements is: " + sum);
        } else {
            int product = 1;
            for (int i = 5; i < 10; i++) {
                product *= numbers[i];
            }
            System.out.println("The product of the last five elements is: " + product);
        }
    }

    public static void task1three() {
        int[] numbers = new int[5];

        int positiveCount = 0;
        int position = -1;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();

            if (numbers[i] > 0) {
                positiveCount++;
                if (positiveCount == 2) {
                    position = i + 1;
                }
            }
        }

        if (position != -1) {
            System.out.println("The position of the third positive number is: " + position);
        } else {
            System.out.println("There are less than three positive numbers.");
        }

        int minNum = numbers[0];
        int minPosition = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minNum) {
                minNum = numbers[i];
                minPosition = i;
            }
        }

        System.out.println("The minimum value is: " + minNum);
        System.out.println("Position of minimum value in the array is: " + minPosition);

        int product = 1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && numbers[i] % 2 == 0) {
                product *= numbers[i];
            }
        }

        System.out.println("The product of all entered even numbers: " + product);
    }

    public static void task2() {
        char answer;

        do {
            System.out.print("Enter the first number: ");
            double num1 = scan.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scan.nextDouble();

            double sum = num1 + num2;
            System.out.println("Sum of the two numbers: " + sum);

            System.out.print("Do you want to perform the operation again? - yes/no: ");
            answer = scan.next().charAt(0);
        } while (answer == 'y' || answer == 'Y');
    }

    public static void task3() {
        Car[] cars = new Car[4];
        cars[0] = new Car("Subaru", 2004, 3.3);
        cars[1] = new Car("Porsche", 2021, 3.0);
        cars[2] = new Car("Toyota", 2011, 2.8);
        cars[3] = new Car("Mazda", 2023, 3.5);

        System.out.print("Enter a model year of car: ");
        int modelYear = scan.nextInt();

        System.out.println("Cars produced in: " + modelYear);
        for (Car car : cars) {
            if (car.getYear_of_production() == modelYear) {
                System.out.println(car.toString());
            }
        }

        sort(cars);

        System.out.println("Cars sorted by year of production:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    public static void sort(Car[] originalArray) {
        for (int i = 0; i < originalArray.length - 1; i++) {
            for (int j = 0; j < originalArray.length - 1 - i; j++) {
                if (originalArray[j].getYear_of_production() > originalArray[j + 1].getYear_of_production()) {
                    Car temp = originalArray[j];
                    originalArray[j] = originalArray[j + 1];
                    originalArray[j + 1] = temp;
                }
            }
        }
    }

    public static void task4() {
        Random random = new Random();
        int randomNum = random.nextInt(100) + 1;

        System.out.println("Hello! I guessed a number from 1 to 100. Try to guess it.");

        int userGuess;
        do {
            System.out.println("Enter the number: ");
            userGuess = scan.nextInt();

            if (userGuess < randomNum) {
                System.out.println("Too low, try again.");
            } else if (userGuess > randomNum) {
                System.out.println("Too high, try again.");
            }
        } while (userGuess != randomNum);
        System.out.println("You guessed the number " + randomNum);
    }
}





