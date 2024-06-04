package com.softserve.edu03.hw;

public class NotValidTriangleException extends RuntimeException {
    public NotValidTriangleException() {
        super("Not a valid triangle");
    }
}
