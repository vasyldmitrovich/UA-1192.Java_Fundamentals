package com.softserve.edu11.pt;

public class NameProcessor {
    public String getLastNameAndInitials(String lastName, String firstName, String middleName) {
        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        return lastName + " " + firstInitial + "." + middleInitial + ".";
    }

    public String getFirstName(String firstName) {
        return firstName;
    }

    public String getFullName(String firstName, String middleName, String lastName) {
        return firstName + " " + middleName + " " + lastName;
    }
}