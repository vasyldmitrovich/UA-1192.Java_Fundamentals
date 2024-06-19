package com.softserve.edu11.pt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("enter name: ");
        String firstName = scanner.nextLine();

        System.out.print("enter middle name: ");
        String middleName = scanner.nextLine();

        NameProcessor processor = new NameProcessor();

        System.out.println("Last name and initials: " + processor.getLastNameAndInitials(lastName, firstName, middleName));
        System.out.println("Name: " + processor.getFirstName(firstName));
        System.out.println("Name, middle name and last name: " + processor.getFullName(firstName, middleName, lastName));
    }
}