package com.softserve.edu08.hw;

public class FullName implements Cloneable{
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
