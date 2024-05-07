package com.softserve.edu4.hw;

import java.util.Objects;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        rangeCheck();
        System.out.println("End of the first task");

        maxAndMinValue();
        System.out.println("End of the second task");

        httpErrorFinder();
        System.out.println("End of the third task");

        faculty();
        System.out.println("End of the fourth task");

        dogChecker();
        System.out.println("End of the fifth task");

    }

    public static void rangeCheck() {
        System.out.println("Enter the first float number");
        try {
            float firstNumber = sc.nextFloat();
            System.out.println("Enter the second float number");
            float secondNumber = sc.nextFloat();
            System.out.println("Enter the third float number");
            float thirdNumber = sc.nextFloat();
            if (firstNumber < -5 || firstNumber > 5
                    || secondNumber < -5 || secondNumber > 5
                    || thirdNumber < -5 || thirdNumber > 5) {
                System.out.println("Not all numbers belong to the range [-5, 5]");
            } else {
                System.out.println("All numbers belong to the range [-5, 5]");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void maxAndMinValue() {
        System.out.println("Enter the first number");
        try {
            int firstNumber = sc.nextInt();
            System.out.println("Enter the second number");
            int secondNumber = sc.nextInt();
            System.out.println("Enter the third number");
            int thirdNumber = sc.nextInt();
            if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
                System.out.println("The first number: " + firstNumber + " is the biggest");
            } else if (firstNumber <= secondNumber && firstNumber <= thirdNumber) {
                System.out.println("The first number: " + firstNumber + " is the smallest");
            }
            if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
                System.out.println("The second number: " + secondNumber + " is the biggest");
            } else if (secondNumber <= firstNumber && secondNumber <= thirdNumber) {
                System.out.println("The second number: " + secondNumber + " is the smallest");
            }
            if (thirdNumber >= firstNumber && thirdNumber >= secondNumber) {
                System.out.println("The third number: " + thirdNumber + " is the biggest");
            } else if (thirdNumber <= firstNumber && thirdNumber <= secondNumber) {
                System.out.println("The third number: " + thirdNumber + " is the smallest");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void httpErrorFinder() {
        System.out.println("Enter a number representing an HTTP error ");
        HTTPError httpError;
        try {
            int error = sc.nextInt();
            switch (error) {
                case 400:
                    httpError = HTTPError.BAD_REQUEST_ERROR;
                    System.out.println("Bad request error");
                    break;
                case 401:
                    httpError = HTTPError.UNAUTHORIZED;
                    System.out.println("Unauthorized error");
                    break;
                case 402:
                    httpError = HTTPError.PAYMENT_REQUEST;
                    System.out.println("Payment request error");
                    break;
                case 403:
                    httpError = HTTPError.FORBIDDEN;
                    System.out.println("Forbidden error");
                    break;
                case 404:
                    httpError = HTTPError.NOT_FOUND;
                    System.out.println("Not found error");
                    break;
                default:
                    System.out.println("Error not recognized");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void faculty() {
        System.out.println("Enter the number of students of faculty");
        int numberOfStudent;
        Faculty faculty = new Faculty();
        try {
            numberOfStudent = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the season of year");
            switch (sc.nextLine()) {
                case "autumn" :
                    faculty = new Faculty(numberOfStudent, Seasons.AUTUMN);
                    System.out.println(faculty.toString());
                    break;
                case "spring" :
                    faculty = new Faculty(numberOfStudent, Seasons.SPRING);
                    System.out.println(faculty.toString());
                    break;
                case "summer" :
                    faculty = new Faculty(numberOfStudent, Seasons.SUMMER);
                    System.out.println(faculty.toString());
                    break;
                case "winter" :
                    faculty = new Faculty(numberOfStudent, Seasons.WINTER);
                    System.out.println(faculty.toString());
                    break;
                default:
                    System.out.println("Season not recognized");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void dogChecker() {
        Dog dog1 = new Dog();
        System.out.println("Enter the name for the dog");
        String name = sc.nextLine();
        System.out.println("Enter the breed for the dog");
        Breed breed = null;
        switch (sc.nextLine()) {
            case "akita":
                breed = Breed.AKITA;
                break;
            case "bulldog":
                breed = Breed.BULLDOG;
                break;
            case "bloodhound":
                breed = Breed.BLOODHOUND;
                break;
            case "corgi":
                breed = Breed.CORGI;
                break;
            case "boxer":
                breed = Breed.BOXER;
                break;
            default:
                System.out.println("Breed not recognized");
                System.exit(0);
        }

        // Do not forget add spaces for more readable code
        int age = 0;
        System.out.println("Enter the age of the dog");

        try {
            age = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error");
            System.exit(0);
        }

        Dog dog2 = new Dog(name, breed, age);
        sc.nextLine();
        System.out.println("Enter the name for the dog");
        name = sc.nextLine();
        System.out.println("Enter the breed for the dog");
        switch (sc.nextLine()) {
            case "akita":
                breed = Breed.AKITA;
                break;
            case "bulldog":
                breed = Breed.BULLDOG;
                break;
            case "bloodhound":
                breed = Breed.BLOODHOUND;
                break;
            case "corgi":
                breed = Breed.CORGI;
                break;
            case "boxer":
                breed = Breed.BOXER;
                break;
            default:
                System.out.println("Breed not recognized");
                System.exit(0);
        }
        System.out.println("Enter the age of the dog");
        try {
            age = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error");
            System.exit(0);
        }
        Dog dog3 = new Dog(name, breed, age);
        if (dog1.getName().equals(dog2.getName())) {
            System.out.println("There are dogs with the same name");
        } else if (dog1.getName().equals(dog3.getName())) {
            System.out.println("There are dogs with the same name");
        } else if (dog2.getName().equals(dog3.getName())) {
            System.out.println("There are dogs with the same name");
        } else {
            System.out.println("There are no dogs with the same name");
        }
        if (dog1.getAge() >= dog2.getAge() && dog1.getAge() >= dog3.getAge()) {
            System.out.println("The oldest dog is " + dog1.getBreed() + " " + dog1.getName());
        } else if (dog2.getAge() >= dog3.getAge()) {
            System.out.println("The oldest dog is " + dog2.getBreed() + " " + dog2.getName());
        } else {
            System.out.println("The oldest dog is " + dog3.getBreed() + " " + dog3.getName());
        }
    }// This method is too long, separate to smaller methods
}
