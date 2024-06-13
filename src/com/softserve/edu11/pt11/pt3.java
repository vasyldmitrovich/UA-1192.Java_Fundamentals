package com.softserve.edu11.pt11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pt3{
    public static void main(String[] args) {
        String[] usernames = {"user123", "user_name", "user-name", "user@name", "user"};

        for (String username : usernames) {
            if (isValidUsername(username)) {
                System.out.println(username + " is valid.");
            } else {
                System.out.println(username + " is not valid.");
            }
        }
    }

    public static boolean isValidUsername(String username) {// Nice

        String regex = "^[a-zA-Z0-9_]{3,15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
    }
}
