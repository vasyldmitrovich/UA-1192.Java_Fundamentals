package com.softserve.edu03.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Demonstrate task 1");
        task1();

        System.out.println("Demonstrate task 2");
        task2();

        System.out.println("Demonstrate task 3");
        task3();

        scanner.close();
    } // All is good

    public static void task1() {
        try {
            System.out.println("Input first side length: ");
            double side1 = scanner.nextDouble();

            System.out.println("Input second side length: ");
            double side2 = scanner.nextDouble();

            System.out.println("Input third side length: ");
            double side3 = scanner.nextDouble();

            System.out.println("The area of the triangle is: " + calcTriangleArea(side1, side2, side3));//Good
        } catch (InputMismatchException e) {
            System.out.println("Value should be a number");
        } catch (SideDimensionException | NotValidTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void task2() {
        try {
            System.out.println("Input first number: ");
            double firstNumber = scanner.nextDouble();

            System.out.println("Input second number: ");
            double secondNumber = scanner.nextDouble();

            System.out.println("Input third number: ");
            double thirdNumber = scanner.nextDouble();

            System.out.println("The smallest number is: " + findSmallestNumber(firstNumber, secondNumber, thirdNumber));
        } catch (InputMismatchException e) {
            System.out.println("Value should be a number");
        }
    }

    public static void task3() {
        Person person1 = new Person();

        person1.setFirstName("John");
        person1.setLastName("Smith");
        person1.setBirthYear(1990);

        Person person2 = new Person("Jane", "Jackson");
        person2.setBirthYear(1994);

        Person person3 = new Person();
        person3.input();

        Person person4 = new Person("", "Johnson");
        person4.setBirthYear(1998);

        System.out.println("Add new name to person 4: ");
        String person4Name = scanner.nextLine();
        person4.changeName(person4Name);

        Person person5 = new Person("", "");
        person5.setBirthYear(2001);

        System.out.println("Add new name to person 5: ");
        String person5Name = scanner.nextLine();

        System.out.println("Add new last name to person 5: ");
        String person5LastName = scanner.nextLine();

        person5.changeName(person5Name, person5LastName);
        person2.setBirthYear(2000);

        person1.output();
        person2.output();
        person3.output();
        person4.output();
        person5.output();
    }

    public static double calcTriangleArea(double firstSide, double secondSide, double thirdSide) {//Good

        if (firstSide <= 0 || secondSide <= 0 || thirdSide <= 0) {
            throw new SideDimensionException();
        }

        if (!checkTriangleValidity(firstSide, secondSide, thirdSide)) {
            throw new NotValidTriangleException();
        }


        double s = (firstSide * secondSide * thirdSide) / 2;
        return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
    }

    public static boolean checkTriangleValidity(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    public static double findSmallestNumber(double firstNumber, double secondNumber, double thirdNumber) {// Nice it is nice
        return Math.min(Math.min(firstNumber, secondNumber), thirdNumber);
    }
}
