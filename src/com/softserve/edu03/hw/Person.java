package com.softserve.edu03.hw;

import java.util.Scanner;

public class Person {
    /**
     Object Person
     Fields:
     - firstName
     - lastName
     - birthYear

     Author: Andrew Tandyriak
     */

    private String firstName;
    private String lastName;
    private int birthYear;

    Scanner scanner = new Scanner(System.in);

    public Person() {
//        this.firstName = "Andrew";
//        this.lastName = "Tandryiak";
//        this.birthYear = 1995;
    }

    public Person(String FirstName, String LastName, int BirthYear) {
        this.firstName = FirstName;
        this.lastName = LastName;
        this.birthYear = BirthYear;
    }

    // Add getters and setters

    public void changeName(String fn, String ln) {
        if (fn != null) {
            firstName = fn;
            if (ln != null) {
                lastName = ln;
            }
        }
    }

    public int getAge() {
        return java.time.Year.now().getValue() - birthYear;
    }

    public void input() {
        System.out.print("Input first name: ");
        firstName = scanner.nextLine();
        System.out.print("input last name: ");
        lastName = scanner.nextLine();
        System.out.print("Input year of birth: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Input valid year of birth: ");
            scanner.next();
        }
        birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Birth year: " + birthYear);
        System.out.println("Age: " + getAge());
    }
}