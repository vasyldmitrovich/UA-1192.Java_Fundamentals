package com.softserve.academy.edu03.hw;

import java.util.Scanner;
import java.time.Year;

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
        return Year.now().getValue() - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        this.firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        this.lastName = scanner.nextLine();
        System.out.println("Enter birth year:");
        this.birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Birth Year: " + this.birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}