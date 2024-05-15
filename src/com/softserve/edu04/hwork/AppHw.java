package com.softserve.edu04.hwork;

import java.io.IOException;
import java.util.Scanner;

public class AppHw {// All is good
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Enter first num: ");
        float num1 = scan.nextInt();

        System.out.println("Enter second num: ");
        float num2 = scan.nextInt();

        System.out.println("Enter third num: ");
        float num3 = scan.nextInt();

        if (num1 >= -5 && num1 <= 5 && num2 >= -5 && num2 <= 5 && num3 >= -5 && num3 <= 5) {
            System.out.println("Numbers belong to the range [-5, 5]");
        } else {
            System.out.println("Not all numbers belong to the range [-5, 5]");
        }
    }

    public static void task2() {
        System.out.println("Enter first num: ");
        int num1 = scan.nextInt();

        System.out.println("Enter second num: ");
        int num2 = scan.nextInt();

        System.out.println("Enter third num: ");
        int num3 = scan.nextInt();

        int maximum;
        int minimum;

        if (num1 >= num2 && num1 >= num3) {
            maximum = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maximum = num2;
        } else {
            maximum = num3;
        }

        if (num1 <= num2 && num1 <= num3) {
            minimum = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            minimum = num2;
        } else {
            minimum = num3;
        }

        System.out.println("Maximum value: " + maximum);

        System.out.println("Minimum value: " + minimum);
    }

    public static void task3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an HTTP error code: ");
        int errorCode = scanner.nextInt();

        HTTPError httpError = HTTPError.getByCode(errorCode);
        System.out.println("Error Name: " + httpError.getName());
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        System.out.println("Choose the current season:");

        System.out.println("1 - Winter");
        System.out.println("2 - Spring");
        System.out.println("3 - Summer");
        System.out.println("4 - Autumn");

        int seasonChoice = scanner.nextInt();
        Season currentSeason;

        switch (seasonChoice) {
            case 1:
                currentSeason = Season.WINTER;
                break;
            case 2:
                currentSeason = Season.SPRING;
                break;
            case 3:
                currentSeason = Season.SUMMER;
                break;
            case 4:
                currentSeason = Season.AUTUMN;
                break;
            default:
                System.out.println("Error. Defaulting to Winter.");
                currentSeason = Season.WINTER;
        }

        Faculty faculty = new Faculty(numberOfStudents, currentSeason);

        System.out.println("Faculty information:");

        System.out.println("Number of students - " + faculty.getNumberOfStudents());

        System.out.println("A time of year - " + faculty.getCurrentSeason().getName());
    }

    public static void task5() {
        Dog dog1 = new Dog("Rex","German Shepherd" , 5);
        Dog dog2 = new Dog("Ballu","Husky", 7);
        Dog dog3 = new Dog("Bruno","Beagle", 3);

        if (dog1.getName().equals(dog2.getName()) || dog2.getName().equals(dog3.getName()) || dog3.getName().equals(dog1.getName())) {
            System.out.println("There are two dogs with the same name");
        } else {
            System.out.println("There are no dogs with the same name");

        Dog oldestDog = dog1;
        if (dog2.getAge() > oldestDog.getAge()) {
            oldestDog = dog2;
        }
        if (dog3.getAge() > oldestDog.getAge()) {
            oldestDog = dog3;
        }

        System.out.println("The oldest dog is " + oldestDog.getName() + " (" + oldestDog.getBreed() + ").");
        }
    }
}


