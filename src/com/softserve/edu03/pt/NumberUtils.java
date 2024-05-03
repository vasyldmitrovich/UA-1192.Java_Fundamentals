package com.softserve.edu03.pt;

public class NumberUtils {

    private NumberUtils () {}

    public static int getTotal(int first, int second) {
        return first + second;
    }
    public static double getTotal(double first, double second) {
        return first + second;
    }

    public static double getAverage(double first, double second) {
        return (first + second) / 2;
    }

    public static double getNumber(String prompt) throws NumberFormatException {
        String[] parts = prompt.split(" ");
        return Double.parseDouble(parts[0]);
    }
}
