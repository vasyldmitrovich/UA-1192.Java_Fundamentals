package com.softserve.edu12.pt;

import java.util.Arrays;

public class TypeException extends Exception {
    public TypeException(String type) {
        super("Unsupported type (" + type + ") passed. List of supported types: " + Arrays.toString(Type.values()));
    }
}
