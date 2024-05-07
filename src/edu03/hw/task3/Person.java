package edu03.hw.task3;
import java.time.LocalDate;
import java.util.Scanner;
public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;  //the birthday year

    public Person() {

    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
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

    public int GetAge() {
        return LocalDate.now().getYear() - birthYear;
    }

    public void Output() {
        System.out.println("First Name: " + firstName + '\n' +
                "Last Name: " + lastName + '\n' +
                "Age: " + GetAge());
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name");
        firstName = scanner.nextLine();

        System.out.println("Enter Last Name");
        lastName = scanner.nextLine();

        System.out.println("Enter the birthday year");
        birthYear = Integer.parseInt(scanner.nextLine());
    }

    public void ChangeName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

