package com.softserve.edu04.hw;

import com.softserve.edu04.pt.Season;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Demonstrate task 1");
        task1();

        System.out.println("Demonstrate task 2");
        task2();

        System.out.println("Demonstrate task 3");
        task3();

        System.out.println("Demonstrate task 4");
        task4();

        System.out.println("Demonstrate task 5");
        task5();
    }

    public static void task1() {
        try {
            System.out.println("Input first number: ");
            float number1 = scanner.nextFloat();

            System.out.println("Input second number: ");
            float number2 = scanner.nextFloat();

            System.out.println("Input third number: ");
            float number3 = scanner.nextFloat();

            boolean inRange = number1 >= -5 && number1 <= 5 && number2 >= -5 && number2 <= 5 && number3 >= -5 && number3 <= 5;

            if (inRange) {
                System.out.println("All numbers belong to the interval [-5, 5]");
            } else {
                System.out.println("Not all numbers belong to the interval [-5, 5]");
            }
        } catch (InputMismatchException e) {
            System.out.println("Value should be a floating point number");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void task2() {
        try {
            System.out.println("Input first number: ");
            int number1 = scanner.nextInt();

            System.out.println("Input second number: ");
            int number2 = scanner.nextInt();

            System.out.println("Input third number: ");
            int number3 = scanner.nextInt();

            int max = Math.max(Math.max(number1, number2), number3);
            int min = Math.min(Math.min(number1, number2), number3);

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
        } catch (InputMismatchException e) {
            System.out.println("Value should be an integer number");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void task3() {
        try {
            System.out.println("Input http error code: ");
            int httpErrorCode = scanner.nextInt();

            HTTPError error = getHTTPError(httpErrorCode);

            System.out.println("Error " + httpErrorCode + " - " + error.getDescription());
        } catch (InputMismatchException e) {
            System.out.println("Value should be an integer number");
        } catch (HttpCodeNotFountException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void task4() {
        try {
            System.out.println("Input number of students: ");
            int numberOfStudents = scanner.nextInt();

            System.out.println("Input season name: ");
            String seasonName = scanner.next();

            Season season = null;
            for (Season s : Season.values()) {
                if (s.getName().equalsIgnoreCase(seasonName)) {
                    season = s;
                    break;
                }
            }

            Faculty faculty = new Faculty(numberOfStudents, season);
            System.out.println("Faculty season: " + faculty.getSeason() + ", number of students: " + faculty.getNumberOfStudents());
        } catch (InputMismatchException exception) {
            System.out.println("Invalid number of students");
        } catch (IllegalArgumentException exception) {
            System.out.println("Invalid season name");
        }
    }

    public static void task5() {
        Dog dog1 = new Dog("Orion", 1, Breed.AKITA);
        Dog dog2 = new Dog("Jack", 2, Breed.ALASKAN_MALAMUTE);
        Dog dog3 = new Dog("Remi", 3, Breed.AMERICAN_BULLDOG);

        if (dog1.getBreed() == dog2.getBreed() || dog1.getBreed() == dog3.getBreed() || dog2.getBreed() == dog3.getBreed()) {
            System.out.println("There a dogs with identical breed");
        } else {
            System.out.println("All dogs have different breed");
        }

        Dog oldestDog;

        if (dog1.getAge() >= dog2.getAge() && dog1.getAge() >= dog3.getAge()) {
            oldestDog = dog1;
        } else if (dog2.getAge() >= dog1.getAge() && dog2.getAge() >= dog3.getAge()) {
            oldestDog = dog2;
        } else {
            oldestDog = dog3;
        }

        System.out.println("Oldest dog is: " + oldestDog.getName() + " breed: " + oldestDog.getBreedString());
    }

    public static HTTPError getHTTPError(int errorCode) {
        for (HTTPError error : HTTPError.values()) {
            if (errorCode == Integer.parseInt(error.name().substring(error.name().indexOf('_') + 1))) {
                return error;
            }
        }
        throw new HttpCodeNotFountException();
    }
}
