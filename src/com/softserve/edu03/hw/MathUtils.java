package com.softserve.edu03.hw;

public class MathUtils {// Good this class is good

    private MathUtils() {}

    public static double getTriangleArea(int firstSide, int secondSide, int thirdSide) {
        double semiPerimeter = (firstSide + secondSide + thirdSide) / 2.0;
        double firstParam = semiPerimeter - firstSide;
        double secondParam = semiPerimeter - secondSide;
        double thirdParam = semiPerimeter - thirdSide;
        return Math.sqrt(semiPerimeter * firstParam * secondParam * thirdParam);
    }

    public static int getSmallest(int first, int second, int third) {
        int smallest = Math.min(first, second);
        return Math.min(smallest, third);
    }
}
