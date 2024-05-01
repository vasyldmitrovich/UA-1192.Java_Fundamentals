package com.softserve.edu03.hw;

import java.time.Year;
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
        return Year.now().getValue() - this.birthYear;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input person first name: ");
        this.firstName = sc.nextLine();
        System.out.println("Input person last name: ");
        this.lastName = sc.nextLine();
        System.out.println("Input person birth year: ");
        this.birthYear = sc.nextInt();
    }

    public void output() {
        System.out.println("Name: " + this.firstName + " " + this.lastName + ", birth year: " + this.birthYear);
    }

    public void changeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void changeName(String firstName) {
        this.firstName = firstName;
    }
}
