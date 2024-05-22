package com.softserve.edu08.hw;

public class FullName {// Add implementation Cloneable interphase
    private String firstName;
    private String lastName;
    public FullName(){

    }
    public FullName(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


}
