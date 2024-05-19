package com.softserve.edu03.hm;

public class App {
    public static void main(String[] args) {
        // Move this method to file App.java not here
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
