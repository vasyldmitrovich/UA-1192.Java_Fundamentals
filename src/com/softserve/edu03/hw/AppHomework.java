package com.softserve.edu03.hw;

import com.softserve.edu03.hw.model.Person;
import com.softserve.edu03.pt.AppPractical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AppHomework {

    public static void main(String... args) {
        //hw1
        System.out.println("Triangle aria is : " + getTriangleArea());
        //hw2
        System.out.println("Min number is : " + getMinNumber());
        //hw3
        List<Person> personList = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            personList.add(createPerson());
        }
        System.out.println("Result: ");
        personList.forEach(p -> {
            System.out.printf("%s", p.output() + " with age " + p.getAge() + "\n");
        });
    }

    private static double getTriangleArea() {
        double a = AppPractical.getDoubleNumber("Input Side 1");
        double b = AppPractical.getDoubleNumber("Input Side 2");
        double c = AppPractical.getDoubleNumber("Input Side 3");
        System.out.printf("You enter %s , %s, %s: \n", a, b, c);
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    private static double getMinNumber() {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(AppPractical.getDoubleNumber("Input number 1"));
        doubleList.add(AppPractical.getDoubleNumber("Input number 2"));
        doubleList.add(AppPractical.getDoubleNumber("Input number 3"));
        System.out.println("You enter: ");
        doubleList.forEach(System.out::println);
        return Collections.min(doubleList);
    }

    private static Person createPerson() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine().trim();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine().trim();

        System.out.print("Enter birth year: ");
        int birthYear;
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Please enter a valid number for birth year: ");
        }
        birthYear = scanner.nextInt();
        scanner.nextLine();

        return new Person().input(firstName, lastName, birthYear);
    }
}
