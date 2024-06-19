package com.softserve.edu12.hw;

import java.util.InputMismatchException;

class Divider {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
