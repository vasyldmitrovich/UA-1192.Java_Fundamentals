package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static final Scanner SCAN = new Scanner(System.in);
    public static final Random RAND = new Random(System.currentTimeMillis());
    public static final int[] MONTH_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        try {
            System.out.println("Task 1");
            demonstrateUserTask();
            System.out.println();

            System.out.println("Task 2");
            demonstrateDoWhileTask();
            System.out.println();

            System.out.println("Task 3");
            demonstrateCarsTask();
            System.out.println();

            System.out.println("Task 4");
            demonstrateGuessRandomTask();
            System.out.println();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void demonstrateUserTask() throws NumberFormatException {
        System.out.println("Days in month task");
        calculateDaysInMonth();

        System.out.println("10 integers task");
        calculateIntegersSumOrMult();

        System.out.println("5 integers task");
        calculateIntegersOperations();
    }

    private static void calculateDaysInMonth() throws NumberFormatException {
        int monthNumber = NumberUtils.getNumber("Input month number in range [1;12]: ");
        int daysInMonth = getDaysInMonth(monthNumber);
        if (daysInMonth == 0) {
            System.out.println("Wrong month: " + monthNumber);
        } else {
            System.out.println(monthNumber + " month has " + daysInMonth + " days");
        }
    }

    /**
     * @param monthNumber Jan -> 1 ... Dec -> 12
     * @return days in selected month
     */
    public static int getDaysInMonth(int monthNumber) {
        if (monthNumber < 1 || monthNumber > MONTH_DAYS.length) {
            //in better way throw some exception
            return 0;
        }
        return MONTH_DAYS[monthNumber - 1];
    }

    private static void calculateIntegersSumOrMult() throws NumberFormatException {
        int[] numbers;
        do {
            numbers = NumberUtils.getNumbers("Input 10 integers in row by space: ");
            if (numbers.length != 10) {
                System.out.println("Wrong numbers quantity. Input again.");
            }
        } while (numbers.length != 10);

        int result = NumberUtils.getIntegersSumOrMult(numbers);
        System.out.println("Result is: " + result);
    }

    private static void calculateIntegersOperations() throws NumberFormatException {
        int[] numbers;
        do {
            numbers = NumberUtils.getNumbers("Input 5 integers in row by space: ");
            if (numbers.length != 5) {
                System.out.println("Wrong numbers quantity. Input again.");
            }
        } while (numbers.length != 5);

        int secondPositivePos = NumberUtils.getSecondPositivePos(numbers);
        if (secondPositivePos == -2) {
            System.out.println("There are no positives");
        } else if (secondPositivePos == -1) {
            System.out.println("Only one positive is presented");
        } else {
            System.out.println("Second positive is " + numbers[secondPositivePos] +
                    " at position " + secondPositivePos);
        }

        int minValuePos = NumberUtils.getMinimalPos(numbers);
        System.out.println("Min value is " + numbers[minValuePos] + " at position " + minValuePos);

        int evensProduct = NumberUtils.getProductOfEvens(numbers);
        System.out.println("Product of evens is " + evensProduct);
    }

    private static void demonstrateDoWhileTask() throws NumberFormatException {
        int[] numbers;
        boolean continueLoop;

        do {
            do {
                numbers = NumberUtils.getNumbers("Input two numbers in row by space: ");
                if (numbers.length != 2) {
                    System.out.println("Wrong numbers quantity. Input again.");
                }
            } while (numbers.length != 2);

            int sum = numbers[0] + numbers[1];
            System.out.println("Sum is: " + sum);

            System.out.print("Do you want to continue? [Y/N]: ");
            char answerFirst = SCAN.nextLine().charAt(0);
            continueLoop = (answerFirst == 'Y' || answerFirst == 'y');
        } while (continueLoop);
    }

    private static void demonstrateCarsTask() throws NumberFormatException {
        Car[] cars = new Car[4];
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car " + i + ":");
            System.out.print("Input type: ");
            String type = SCAN.nextLine();

            int year = NumberUtils.getNumber("Input year of production: ");

            System.out.print("Input engine's capacity: ");
            double engineCapacity = Double.parseDouble(SCAN.nextLine());

            cars[i] = new Car(type, year, engineCapacity);
        }

        int selectedYear = NumberUtils.getNumber("Input year of production: ");
        Car[] filteredByYear = filterCarsByYear(cars, selectedYear);
        printCars(filteredByYear);

        System.out.println("Sorted cars by year:");
        sortCarsByYear(cars);
        printCars(cars);
    }

    private static void printCars(Car... cars) {
        System.out.println("{");
        for (Car car : cars) {
            System.out.println("\t" + car);
        }
        System.out.println("}");
    }

    public static Car[] filterCarsByYear(Car[] cars, int year) {
        Car[] filtered = new Car[cars.length];
        int index = 0;
        for (Car car : cars) {
            if (car.getYearOfProd() == year) {
                filtered[index++] = car;
            }
        }
        return Arrays.copyOf(filtered, index);
    }

    public static void sortCarsByYear(Car... cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getYearOfProd() > cars[j + 1].getYearOfProd()) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    private static void demonstrateGuessRandomTask() throws NumberFormatException {
        int number = RAND.nextInt(100);

        int answer;
        do {
            System.out.print("Input your answer: ");
            answer = Integer.parseInt(SCAN.nextLine());
            if (answer > number) {
                System.out.println("Too high, try again.");
            } else if (answer < number) {
                System.out.println("Too low, try again.");
            }
        } while (answer != number);
        System.out.println("Congrats, your answer is correct.");
    }
}
