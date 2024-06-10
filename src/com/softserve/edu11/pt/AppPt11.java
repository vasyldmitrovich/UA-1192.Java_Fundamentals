package com.softserve.edu11.pt;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppPt11 {

    public static void main(String[] args) {
        System.out.println("Perform practical task 111");
        String str1 = "SoftServe";
        String str2 = "SoftServe Academy";
        String str3 = "Sandwich";
        System.out.printf("\"%s\" is a substring of \"%s\": %s%n", str1, str2, isSubstring(str1, str2));
        System.out.printf("\"%s\" is a substring of \"%s\": %s%n", str3, str2, isSubstring(str3, str2));
        System.out.println();

        System.out.println("Perform practical task 112");
        String argument = "Jones John Paul";
        String[] input = argument.split(" ");
        System.out.println("Last name and initials: " + input[0] + " " + input[1].charAt(0) + ". " + input[2].charAt(0) + ".");
        System.out.println("First name: " + input[1]);
        System.out.println("First name, middle name, and last name: " + input[1] + " " + input[2] + " " + input[0]);
        System.out.println();

        System.out.println("Perform practical task 113");
        String[] firstNames = new String[]{"James", "Michael", "Su", "John_David_William_Richard",
                "Mary48", "ПесПатрон"};
        System.out.println(Arrays.toString(firstNames));
        Arrays.stream(firstNames).forEach(name -> System.out.println(name + " passes validation: " + isValid(name)));


    }

    private static boolean isSubstring(String pattern, String subject){
        return subject.toLowerCase().contains(pattern.toLowerCase());
    }

    private static boolean isValid(String name){
        String pattern = "^[a-zA-Z0-9_]{3,15}$";
        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(name);
        return matcher.matches();
    }


}
