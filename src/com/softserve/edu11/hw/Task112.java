package com.softserve.edu11.hw;

public class Task112 {

    public static void execute(){

        String example = "sentence  that    contains words   separated     by  more than    one   space";
        System.out.printf("Lets delete extra spaces from: \"%s\"%n", example);
        System.out.println("Result is: " + removeSpaces(example));

    }

    private static String removeSpaces(String string){
        return string.replaceAll(" {2,}", " ");
    }
}
