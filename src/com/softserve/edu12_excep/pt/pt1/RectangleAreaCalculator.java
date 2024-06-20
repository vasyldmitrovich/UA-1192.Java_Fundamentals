package com.softserve.edu12_excep.pt.pt1;

public class RectangleAreaCalculator {

    public static void main(String[] args) {
        try {
            int length = InputValidator.readPositiveInt("Enter the length of the rectangle: ");
            int width = InputValidator.readPositiveInt("Enter the width of the rectangle: ");

            int area = calculateRectangleArea(length, width);
            System.out.println("Area of the rectangle: " + area);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            InputValidator.closeScanner();
        }
    }

    public static int calculateRectangleArea(int length, int width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Dimensions must be positive integers. length=" + length + ", width=" + width);
        }
        return length * width;
    }
}

