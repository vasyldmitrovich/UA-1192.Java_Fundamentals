package com.softserve.edu03.hw;

import java.time.Year;
import java.util.Scanner;

public class Person {

    private String firstName, lastName;
    private int birthYear;

    public Person(){}

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public int getAge(){
        int age;
        Year current = Year.now();
        age = current.getValue() - birthYear;
        return  age;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter persons first name: ");
        setFirstName(scanner.nextLine());
        System.out.println("Enter persons last name: ");
        setLastName(scanner.nextLine());
        System.out.println("Enter persons year of birth: ");
        setBirthYear(scanner.nextInt());

    }

    public void output(){
        String output = "Name: " + getFirstName() + " " + getLastName() + "," +
                " Birth: " + getBirthYear() + "," +
                " Age: " + getAge() + ".";
        System.out.println(output);
    }

    public void changeName(String fn, String ln){
        setFirstName(fn);
        setLastName(ln);
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
}
