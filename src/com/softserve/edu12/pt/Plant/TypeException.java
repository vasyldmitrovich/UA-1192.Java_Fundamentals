package com.softserve.edu12.pt.Plant;

public class TypeException extends IllegalArgumentException{
    public TypeException() {
        super("You entered wrong plant type");
    }
}
