package com.softserve.edu12.hw;

public class Div {

    public static double div(double a, double b){
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}
