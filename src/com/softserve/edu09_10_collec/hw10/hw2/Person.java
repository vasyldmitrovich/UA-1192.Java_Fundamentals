package com.softserve.edu09_10_collec.hw10.hw2;

public class Person {
    private String lastName;
    private String firstName;

    public Person(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "Last Name: " + lastName + ", First Name: " + firstName;
    }
}
