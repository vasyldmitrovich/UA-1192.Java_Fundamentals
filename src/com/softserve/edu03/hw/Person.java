package com.softserve.edu03.hw;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {

    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {}

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - birthYear;
    }

    /** if some parameter == null, it doesn't change */
    public void changeName(String firstName, String lastName) {// Nice
        if (firstName != null)
            this.firstName = firstName;
        if (lastName != null)
            this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void input(InputStream inputStream) throws InputMismatchException {
        Scanner sc = new Scanner(inputStream);
        System.out.print("Input person's first name: ");
        String firstName = sc.nextLine();
        System.out.print("Input person's last name: ");
        String lastName = sc.nextLine();
        System.out.print("Input person's birth year: ");
        int birthYear = sc.nextInt();

        //if each parameter is acceptable -> than overwrite
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public void output(OutputStream outputStream) {
        PrintStream out = new PrintStream(outputStream);
        out.println(this);
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
