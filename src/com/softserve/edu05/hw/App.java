package com.softserve.edu05.hw;

import com.softserve.edu05.pt.Employee;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// Nice very nice
        homework1();
        System.out.println("End of the first task");

        homework2();
        System.out.println("End of the second task");

        homework3();
        System.out.println("End of the third task");

        homework4();
        System.out.println("End of the fourth task");
    }

    public static void homework1 () {
        Subtask1 subtask1 = new Subtask1();
        Subtask2 subtask2 = new Subtask2();
        Subtask3 subtask3 = new Subtask3();
        subtask1.start();
        subtask2.start();
        subtask3.start();
    }

    public static void homework2 () {
        String answer = "yes";

        do {
            System.out.println("Enter the number");
            try {
                int firstNumber = sc.nextInt();
                System.out.println("Enter the number");
                int secondNumber = sc.nextInt();
                sc.nextLine();
                System.out.println("The sum of two numbers is " + (firstNumber + secondNumber));
                System.out.println("Do you want to perform the operation again? Enter no if you want to stop");
                answer = sc.nextLine();

                // Added InputMismatchException
            } catch (InputMismatchException e) {
                System.out.println("You enter non-integer value");
            }
        } while (!answer.equals("no"));
    }

    public static void homework3 () {
        int count = 0;
        Car [] cars = new Car[4];
        Car car1 = new Car();
        cars[0] = car1;

        while (count != 3) {
            int yearOfProduction = 0;
            int engineCapacity = 0;
            System.out.println("Enter the type of car");
            String type = sc.nextLine();
            System.out.println("Enter the year of production of your car");
            try {
                yearOfProduction = sc.nextInt();
                System.out.println("Enter the engine capacity of your capacity");
                engineCapacity = sc.nextInt();
                sc.nextLine();
                // Added InputMismatchException
            } catch (InputMismatchException e) {
                System.out.println("You enter non-float value");
            }

            cars [count + 1] = new Car(type, yearOfProduction, engineCapacity);
            count++;
        }

        findYearOfProduction(cars);
        sortByYear(cars);
    }

    public static void findYearOfProduction (Car [] cars) {
        System.out.println("Enter the year of production, the cars of which you want to find");
        try {
            int year = sc.nextInt();
            for (int i = 0; i < cars.length; i++) {
                if (cars[i].getYearOfProduction() == year) {
                    System.out.println(cars[i].toString());
                }
            }
            // Added InputMismatchException
        } catch (InputMismatchException e) {
            System.out.println("You enter non-float value");
        }
    }

    public static void sortByYear (Car [] cars) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                Car temp;
                if (cars[i].getYearOfProduction() >= cars[j].getYearOfProduction()) {
                    temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(cars));
    }

    public static void homework4 () {
        int randomNumber = -100 + (int) (Math.random() * ((100 - (-100)) + 1));
        boolean check = true;

        while (check) {
            System.out.println("Guess number from -100 to 100. Enter stop if you want to exit");
            String answer = sc.nextLine();
            if (!answer.equals("stop")) {
                try {
                    int number = Integer.parseInt(answer);
                    if (number == randomNumber) {
                        System.out.println("You guess the number ");
                        check = false;
                    } else if (number < randomNumber) {
                        System.out.println("Too low, try again");
                    } else {
                        System.out.println("Too high, try again");
                    }
                } catch (Exception e) {
                    System.out.println("Error");
                }
            } else {
                System.out.println("The requested number was " + randomNumber);
                check = false;
            }
        }
    }
}
