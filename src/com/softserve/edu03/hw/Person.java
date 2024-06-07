package com.softserve.edu03.hw;

import javax.swing.*;
import java.time.Year;

import static com.softserve.edu03.hw.App.scanner;

public class Person {

    private String firstName ;
    private String lastName ;
    private int birthYear;

    public Person() {
        this.firstName = "N/A";
        this.lastName = "N/A";
        this.birthYear = 0;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getAge() {
        return Year.now().getValue() - this.birthYear;
    }

    public void output() {
        System.out.println("Name and Lastname: " + this.firstName + " " + this.lastName + ", age: " + this.getAge());
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
    // This methods should be after getters and setters
    public static void input(Person person){
        System.out.print("Input person first name: ");
        String firstName = scanner.nextLine();
        person.setFirstName(firstName);

        System.out.print("Input person last name: ");
        String lastName = scanner.nextLine();
        person.setLastName(lastName);

        System.out.print("Input the birthday year of person: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine();
        person.setBirthYear(birthYear);

    }
}
