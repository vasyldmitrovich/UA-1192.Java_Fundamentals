package com.softserve.edu03.hw;

public class SideDimensionException extends RuntimeException {
    public SideDimensionException() {
        super("Side can`t be 0 or negative");
    }
}
