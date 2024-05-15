package com.softserve.edu03.hw;
import java.util.Scanner;

public class MyHw3Person {
    public static void main(String[] args) {// This main method should not be here
        Scanner scanner = new Scanner(System.in);

        Person[] people = new Person[5];

        for (int i = 0; i < people.length; i++) {
            System.out.println("Enter information for person " + (i + 1) + ":");
            people[i] = new Person();
            people[i].input(scanner);
        }

        System.out.println("\nInformation about the people:");
        for (Person person : people) {
            person.output();
        }

        scanner.close();
    }
}

class Person {
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
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }

    public void input(Scanner scanner) {
        System.out.print("Enter first name: ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        this.lastName = scanner.nextLine();

        System.out.print("Enter birth year: ");
        this.birthYear = scanner.nextInt();
        scanner.nextLine();
    }

    public void output() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        if (fn != null) {
            this.firstName = fn;
        }
        if (ln != null) {
            this.lastName = ln;
        }
    }
}


