package com.softserve.edu11.pt.pt3;

import java.util.regex.Pattern;

public class UsernameValidator {
    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9_]{3,15}$";
    private static final Pattern pattern = Pattern.compile(USERNAME_PATTERN);

    public static boolean isValidUsername(String username) {
        if (username == null) {
            return false;
        }
        return pattern.matcher(username).matches();
    }
}
