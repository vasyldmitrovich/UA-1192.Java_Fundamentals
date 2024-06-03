package com.softserve.edu12.pt.plant;

public class TypeException extends IllegalArgumentException {// Good
    public TypeException(String type) {
        super("Plant type " + type + " doesn't exists");
    }
}
