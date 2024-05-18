package com.softserve.edu08.hw;

public class FullName {

    private String firstName;

    private String lastName;

    public FullName() {
        this.firstName = "";
        this.lastName = "";
    }

    public FullName(String firstName, String lastName) {
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
}
