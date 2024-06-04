package com.softserve.edu12.pt;

import java.util.Arrays;

public class ColorException extends Exception {
    public ColorException(String color) {
        super("Unsupported color (" + color + ") passed. List of supported colors: " + Arrays.toString(Color.values()));
    }
}
