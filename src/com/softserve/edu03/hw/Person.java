package com.softserve.edu03.hw;


//          Created a class Person with constructors, getters and setters.
public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstname() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String setFirstname(String firstname) {
        return firstName = firstname;
    }

    public String setLastname(String lastname) {
        return lastName = lastname;
    }

    public void setBirthYear(int birthyear) {
        this.birthYear = birthyear;
    }

    // constructors should be before getters and setters
    public Person() {
    }

    public Person(String firstname, String lastname) {
        setFirstname(firstname);
        setLastname(lastname);
    }

    //    Created methods getAge(), input(), output(); And try to overload method changename().
    public int getAge() {
        return 2024 - birthYear;
    }

    public void input(String firstName, String lastName, int birthYear) {
        setFirstname(firstName);
        setLastname(lastName);
        setBirthYear(birthYear);
    }

    public void output() {
        System.out.println("------------------------------- \nFirstname: " + getFirstname() +
                "\nLastname: " + getLastname() + "\nAge: " + getAge() + "\n-------------------------------");
    }

    public String changeName(String firstName) {
        return setFirstname(firstName);
    }

    public String changeName(String firstName, String lastName) {
        return setFirstname(firstName) +
                setLastname(lastName);
    }

}
