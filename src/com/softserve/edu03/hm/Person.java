package com.softserve.edu03.hm;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){

    }
    public Person(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public  void setFirstName() {
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
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        lastName = scanner.nextLine();

        System.out.println("Enter birth year:");
        birthYear = scanner.nextInt();


    }
    public void output () {
        System.out.println("First name:" + firstName);
        System.out.println("last name:" + lastName);
        System.out.println("Birth year:" + birthYear);
        System.out.println("Age:" + getAge());
    }
    public void changeName(String fn,String ln) {
        if (fn != null) {
            firstName = fn;
        }
        if (ln != null) {
            lastName = ln;
        }
    }

    public static void main(String[] args) {
        // Create an array to store 5 Person objects
        Person[] people = new Person[5];

        // Input information about each person and store it in the array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter information for Person " + (i + 1) + ":");
            Person person = new Person();
            person.input();
            people[i] = person;
        }

        // Output information about each person
        System.out.println("\nInformation about each person:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            people[i].output();
        }
    }
}





