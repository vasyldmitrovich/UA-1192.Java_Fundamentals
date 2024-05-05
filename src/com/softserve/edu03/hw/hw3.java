package com.softserve.edu03.hw;

import java.util.Scanner;

public class hw3 {

}

class Person {
    //  firstName, lastName and birthYear
    private String firstName;
    private String lastName;
    private int birthYear;
    private int currentYear = 2024;

    public static void main(String[] args){

    }

    public Person(){

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(){
        return currentYear - birthYear;
    }

    public String input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First name: ");
        String firstName = sc.nextLine();
        System.out.println("Input Last name:: ");
        String lastName = sc.nextLine();
        System.out.println("Input the birthday year: ");
        int birthYear = sc.nextInt();


        System.out.print(firstName + lastName + birthYear);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", currentYear=" + currentYear +
                '}';
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