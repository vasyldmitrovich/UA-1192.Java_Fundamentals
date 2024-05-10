package com.softserve.edu03.hw;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    // These methods write after getters and setters
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        setFirstName(sc.nextLine());
        System.out.println("Enter last name: ");
        setLastName(sc.nextLine());
        System.out.println("Enter birth year: ");
        setBirthYear(sc.nextInt());
    }
    public void output() {
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Age: " + getAge());
    }

    public int getAge() {
        int age = 2024 - birthYear;
        return age;
    }
    public void changeName(String fn, String ln){
        if(fn != null && !fn.isEmpty()) {
            setFirstName(fn);
        }
        if(ln != null && !ln.isEmpty()) {
            setLastName(ln);
        }
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
}