package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfFiveCalculatorTest {
    ProductOfFiveCalculator calculator = new ProductOfFiveCalculator();

    @Test
    void calculate() {
        int[] expected = new int[]{25, 75, 5};
        int[] actual = new int[3];

        calculator.setNumbers(new int[]{5,5,5,5,5,74,58,67,-35,48});
        actual[0] = calculator.calculate();
        calculator.setNumbers(new int[]{5,-5,5,5,5,5,55,5,5,5});
        actual[1] = calculator.calculate();
        calculator.setNumbers(new int[]{0,0,0,0,0,1,1,1,1,1});
        actual[2] = calculator.calculate();

        assertArrayEquals(expected, actual);
    }
}