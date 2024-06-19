package com.softserve.edu11.pt;

public class Task1 {
    public static void main(String[] args) {

        StringOperations stringOps = new StringOperations();

        String firstString = stringOps.getInput("Enter first line:");
        String secondString = stringOps.getInput("Enter second line:");

        boolean isSubstring = stringOps.isSubstring(firstString, secondString);

        System.out.println("is there \"" + firstString + "\" subString \"" + secondString + "\"? " + isSubstring);
    }
}
