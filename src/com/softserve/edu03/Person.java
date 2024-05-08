package com.softserve.edu03;

import java.util.Scanner;

import static com.softserve.edu01.hw.App.scanner;

public class Person {
    private String name;
    private String surname;
    private int birthYear;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public int getAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - this.birthYear;
    }
    // Add another getters and setters here

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        this.name = sc.nextLine();
        System.out.print("Enter your surname: ");
        this.surname = sc.nextLine();
        System.out.print("Enter your birth year: ");
        this.birthYear = sc.nextInt();
        scanner.nextLine();

    }

    public void output() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Birth year: " + birthYear);
        System.out.println("age: " + getAge());
    }

    public void changeName(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
    class Main{// Move to App.java
        public static void main(String[] args) {
            Person[] people = new Person[5];

            for (int i = 0; i < people.length; i++) {
                people[i] = new Person();

                System.out.println("input infotmation about person " + (i + 1));
                people[i].input();
            }
            System.out.println("/nInformation about person");
            for (Person person : people) {
                person.output();
                System.out.println();
            }
        }
        }



