package com.softserve.edu11_str.pt.pt3;

import java.util.regex.Pattern;

public class App{
    public static void main(String[] args) {
        String[] usernames = {
                "user123",
                "username_123",
                "user.name",
                "very_long_username",
                "good_username_123"
        };

        // Validate each username and print the result
        for (String username : usernames) {
            boolean isValid = validateUsername(username);
            if (isValid) {
                System.out.println(username + " is valid");
            } else {
                System.out.println(username + " is NOT valid");
            }
        }
    }

    // Method to validate username
    private static boolean validateUsername(String username) {
        // Regular expression to match usernames with 3 to 15 characters, Latin alphabet, numbers, and underscores
        String regex = "^[a-zA-Z0-9_]{3,15}$";
        return Pattern.matches(regex, username);
    }
}

