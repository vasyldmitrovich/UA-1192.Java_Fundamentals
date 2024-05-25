package com.softserve.edu03.hw;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.birthYear = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();
        System.out.print("Enter birth year: ");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.print("Invalid input. Please enter an integer for the birth year: ");
        }
        this.birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.printf("Name: %s %s%n", firstName, lastName);
        System.out.printf("Birth Year: %d%n", birthYear);
        System.out.printf("Age: %d%n", getAge());
    }

    public void changeName(String firstName, String lastName) {
        if (!firstName.isEmpty()) {
            this.firstName = firstName;
        }
        if (!lastName.isEmpty()) {
            this.lastName = lastName;
        }
    }
}


