package com.softserve.edu08.hw;

public class FullName implements Cloneable {

    private String firstName;
    private String lastname;

    public FullName () {
        this.firstName = "Marian";
        this.lastname = "Shtangret";
    }

    public FullName (String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public FullName clone() throws CloneNotSupportedException {
        return (FullName) super.clone();
    }
}
