package com.softserve.edu03.hw.model;

import java.time.LocalDate;

public class Person {// Good

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    };

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getAge() {
        LocalDate localDate = LocalDate.now();
        return localDate.getYear() - birthYear;
    }

    public Person input(String firstName, String lastName, int birthYear) {
        return new Person(firstName, lastName, birthYear);
    }

    public String output() {
        return toString();
    }

    public void changeName(String fn, String ln) {
        if (!fn.isBlank()) {
            firstName = fn;
        }
        if (!ln.isBlank()) {
            lastName = ln;
        }
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

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }
}
