package com.softserve.edu11.pt;

import java.util.regex.Pattern;

public class UserNameValidator {
    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9_]{3,15}$";

    public boolean isValidUsername(String username) {
        return Pattern.matches(USERNAME_PATTERN, username);
    }
}
