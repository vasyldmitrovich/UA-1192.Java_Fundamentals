package com.softserve.edu03.hw;

import java.util.Scanner;

public class App {

    private static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        calculateTriangleArea();
        System.out.println();
        obtainSmallestNumber();
        System.out.println();
        demonstratePersonClass();
    }

    private static void calculateTriangleArea() {
        System.out.print("Input 1st side length: ");
        int firstSide = SC.nextInt();
        System.out.print("Input 2nd side length: ");
        int secondSide = SC.nextInt();
        System.out.print("Input 3rd side length: ");
        int thirdSide = SC.nextInt();

        double triangleArea = MathUtils.getTriangleArea(firstSide, secondSide, thirdSide);
        System.out.println("Triangle area: " + triangleArea);
    }

    private static void obtainSmallestNumber() {
        System.out.print("Input 1st number: ");
        int firstNumber = SC.nextInt();
        System.out.print("Input 2nd number: ");
        int secondNumber = SC.nextInt();
        System.out.print("Input 3rd number: ");
        int thirdNumber = SC.nextInt();

        int smallestNumber = MathUtils.getSmallest(firstNumber, secondNumber, thirdNumber);
        System.out.println("Smallest number: " + smallestNumber);
    }

    private static void demonstratePersonClass() {
        Person first = new Person();
        first.input(System.in);

        //hardcode
        Person second = new Person("John", "Smith");
        second.setBirthYear(1996);
        Person third = new Person("Holly", "Duffy");
        third.setBirthYear(1966);
        Person fourth = new Person("Mark", "Bier");
        fourth.setBirthYear(1981);
        Person fifth = new Person("Richard", "Bray");
        fifth.setBirthYear(1975);

        System.out.println("First: " + first);
        System.out.println("Second: ");
        second.output(System.out);
        System.out.printf("Third{ fName: %s; lName: %s; bYear: %d}%n", third.getFirstName(),
                third.getLastName(), third.getBirthYear());
        System.out.println(fourth);
        System.out.println("Age of fifth: " + fifth.getAge());

    }
}
