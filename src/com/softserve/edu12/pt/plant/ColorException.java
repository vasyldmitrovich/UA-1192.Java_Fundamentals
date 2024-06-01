package com.softserve.edu12.pt.plant;

public class ColorException extends IllegalArgumentException {
    public ColorException(String color) {
        super("Plant color " + color + " doesn't exists");
    }
}
