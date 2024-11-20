package com.softserve.edu04.hw;

import com.softserve.edu04.enum_examples.Season;


import java.util.Scanner;

public class App {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        App.task1();
//        App.task2();
//        App.task3();
//        task4();
        task5();

    }

    public static void task1() {
        System.out.println("Input three float numbers!");
        System.out.print("Input first number: ");
        float first = scanner.nextFloat();

        System.out.print("Input second number: ");
        float second = scanner.nextFloat();

        System.out.print("Input third number: ");
        float third = scanner.nextFloat();


        if ((first >= -5.0f) && (first <= 5.0f) && (second >= -5.0f) && (second <= 5.0f) && (third >= -5.0f) && (third <= 5.0f)) {
            System.out.print("These numbers belong to the range [-5, 5] ");
        } else {
            System.out.print("Not all numbers belong to the range [-5, 5] ");
        }
    }


    public static void task2() {
        System.out.println("Input three integer numbers!");
        System.out.print("Input first number: ");
        int first = scanner.nextInt();
        System.out.print("Input second number: ");
        int second = scanner.nextInt();
        System.out.print("Input third number: ");
        int third = scanner.nextInt();

        if ((first > second) && (first > third)) {
            System.out.println("First number " + first + " is MAX");
        } else if ((first < second) && (second > third)) {
            System.out.println("Second number " + second + " is MAX");
        } else System.out.println("Third number " + third + " is MAX");

        if ((first < second) && (first < third)) {
            System.out.println("First number " + first + " is MIN");
        } else if ((first > second) && (second < third)) {
            System.out.println("Second number " + second + " is MIN");
        } else System.out.println("Third number " + third + " is MIN");
    }


    public static void task3() {
        HTTPError httpError;

        System.out.print("Input a number an HTTP error: ");
        String number = scanner.nextLine();

        httpError = switch (number) {
            case "400" -> HTTPError.Bad_Request;
            case "401" -> HTTPError.Unauthorized;
            case "402" -> HTTPError.Payment_Required;
            case "403" -> HTTPError.Forbidden;
            case "404" -> HTTPError.Not_Found;
            default -> HTTPError.Undefined;
        };
        System.out.println("The number an HTTP error: " + number + " is " + httpError);
    }

    public static void task4(){

        System.out.print("Input number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input exact season (Winter, Spring, Summer, Autumn):");
        String seasonInput = scanner.nextLine().toUpperCase();

        Season season = null;
        try {
            season = Season.valueOf(seasonInput);
        } catch (IllegalArgumentException e) {
            System.out.println("not correct input for season.");
            System.exit(1);
        }


        Faculty faculty = new Faculty(numberOfStudents, season );
        System.out.println("Information about faculty:");
        System.out.println("Number of students: " + faculty.getNumberOfStudents());
        System.out.println("Season: " + faculty.getSeason());
    }

    public static void task5(){

        Dog dog1 = new Dog("Puh", 3, Breed.POODLE);
        Dog dog2 = new Dog("Tiger", 2, Breed.TERRIER);
        Dog dog3 = new Dog("Radja", 5, Breed.SPANIEL);

        if (dog1.getName() == dog2.getName() || dog1.getName() == dog3.getName() || dog2.getName() == dog3.getName()) {
            System.out.println("There are dogs with the same name");
        } else {
            System.out.println("All dogs have different name");
        }

        Dog oldestDog;

        if ((dog1.getAge() >= dog2.getAge()) && (dog1.getAge() >= dog3.getAge())) {
            oldestDog = dog1;
        } else if ((dog2.getAge() >= dog1.getAge()) && (dog2.getAge() >= dog3.getAge())) {
            oldestDog = dog2;
        } else {
            oldestDog = dog3;
        }

        System.out.println("Oldest dog is: " + oldestDog.getName() + " it breed is: " + oldestDog.getBreed().getBreedName());
    }
}

