package com.softserve.edu11.pt;

public class Task3 {
    public static void main(String[] args) {
        String[] usernames = {
                "user123",
                "user_name",
                "very_long_username",
                "short",
                "invalid$username"
        };

        UserNameValidator validator = new UserNameValidator();

        for (String username : usernames) {
            boolean isValid = validator.isValidUsername(username);
            String validityMessage = isValid ? "valid" : "invalid";
            System.out.println("name user '" + username + "' is " + validityMessage);
        }
    }
}
