package com.softserve.edu03.hw;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    Person() {}

    Person(String firstName, String lastName) {
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
        return LocalDate.now().getYear() - this.birthYear;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name of person");
        this.firstName = sc.nextLine();
        System.out.println("Enter the last name of person");
        this.lastName = sc.nextLine();
        System.out.println("Enter the birth year of person");
        try {
            this.birthYear = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public String output() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    public void changeName(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            this.firstName = firstName;
            this.lastName = lastName;
        } else if (firstName != null && lastName == null) {
            this.firstName = firstName;
        } else if (firstName == null && lastName != null) {
            this.lastName = lastName;
        }
    }
}
