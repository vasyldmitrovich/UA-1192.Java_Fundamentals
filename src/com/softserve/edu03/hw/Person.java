package com.softserve.edu03.hw;
import com.softserve.edu03.pt.Employee;

import java.util.Scanner;
import java.time.Year;

 class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    //default constructor
    public Person() {}

    //constructor with parameters
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

    public int getAge(){
        int age;
        Year current = Year.now();
        age = current.getValue() - birthYear;
        return  age;
    }

    //Input and Output methods
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        firstName = scanner.nextLine();
        System.out.println("Enter last name:");
        lastName = scanner.nextLine();
        System.out.println("Enter birth year:");
        birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Birth Year: " + this.birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln) {
        if (fn != null && !fn.isEmpty()) {
            this.firstName = fn;
        }
        if (ln != null && !ln.isEmpty()) {
            this.lastName = ln;
        }
    }
    public static void main (String [] args) {// This method should not be here, move to file for example App.java
        Person person1 = new Person();
        person1.setFirstName("Anastasiia");
        person1.setLastName("Teliatnyk");
        person1.setBirthYear(1998);

        Person person2 = new Person();
        person2.setFirstName("Roman");
        person2.setLastName("Karpov");
        person2.setBirthYear(1976);

        Person person3 = new Person();
        person3.setFirstName("Anna");
        person3.setLastName("Balych");
        person3.setBirthYear(2004);

        Person person4 = new Person();
        person4.setFirstName("Oleksandr");
        person4.setLastName("Teliat");
        person4.setBirthYear(1996);

        Person person5 = new Person();
        person5.setFirstName("Alina");
        person5.setLastName("Vintovych");
        person5.setBirthYear(1988);
        
    }
}