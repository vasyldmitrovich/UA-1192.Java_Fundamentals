package com.softserve.edu12.pt;

public class NegativeSideDimensionException extends RuntimeException {
    public NegativeSideDimensionException() {
        super("Side dimensions cannot be negative");
    }
}
