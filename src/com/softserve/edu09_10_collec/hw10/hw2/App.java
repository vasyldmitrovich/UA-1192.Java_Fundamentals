package com.softserve.edu09_10_collec.hw10.hw2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        PersonMap personMap = new PersonMap();
        Scanner scanner = new Scanner(System.in);

        // Adding persons to the map
        personMap.addPerson("Doe", "John");
        personMap.addPerson("Smith", "Alice");
        personMap.addPerson("Johnson", "Bob");
        personMap.addPerson("Williams", "Alice");
        personMap.addPerson("Brown", "Charlie");
        personMap.addPerson("Davis", "David");
        personMap.addPerson("Miller", "Eve");
        personMap.addPerson("Wilson", "Frank");
        personMap.addPerson("Moore", "Grace");
        personMap.addPerson("Taylor", "Orest");

        // Display initial contents of the map
        System.out.println("Initial Contents of personMap:");
        personMap.displayMap();

        // Check if there are at least two persons with the same first name
        String firstNameToCheck = "Alice"; // Example first name to check
        boolean hasDuplicateFirstName = personMap.hasDuplicateFirstName(firstNameToCheck);
        if (hasDuplicateFirstName) {
            System.out.println("There are persons with the same first name: " + firstNameToCheck);
        } else {
            System.out.println("There are no persons with the same first name: " + firstNameToCheck);
        }

        // Remove person by first name
        String firstNameToRemove = "Orest"; // Example first name to remove
        personMap.removePersonByFirstName(firstNameToRemove);

        // Display contents of the map after removal
        System.out.println("\nContents of personMap after removing '" + firstNameToRemove + "':");
        personMap.displayMap();

        scanner.close();
    }
}
