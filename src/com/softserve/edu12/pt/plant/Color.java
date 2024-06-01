package com.softserve.edu12.pt.plant;

public enum Color {
    GREEN, RED, YELLOW, PURPLE, ORANGE;

    public static Color of(String value) {
        value = value.toUpperCase();

        try {
            return valueOf(value);
        } catch (IllegalArgumentException e) {
            throw new ColorException(value);
        }
    }
}
