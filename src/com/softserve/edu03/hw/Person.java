package com.softserve.edu03.hw;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getAge() {
        LocalDate date = LocalDate.now();
        int year = date.getYear();
        return year - getBirthYear();
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name :");
        setFirstName(scanner.nextLine());
        System.out.println("Enter the last name :");
        setLastName(scanner.nextLine());
        System.out.println("Enter the birth year :");
        setBirthYear(scanner.nextInt());
        scanner.nextLine();
    }

    public String output() {
        return getFirstName() + " " + getLastName() + " " + getBirthYear() + " " + getAge();
    }

    public void changeName(String fn, String ln) {
        setFirstName(fn);
        setLastName(ln);
    }
}
