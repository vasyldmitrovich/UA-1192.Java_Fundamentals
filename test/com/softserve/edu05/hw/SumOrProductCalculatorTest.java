package com.softserve.edu05.hw;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SumOrProductCalculatorTest {

    @Test
    void calculateSumOrProduct() {
        assertEquals(15, SumOrProductCalculator.calculateSumOrProduct(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        assertEquals(30240, SumOrProductCalculator.calculateSumOrProduct(new int[]{-1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }

    @Test
    void testEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> SumOrProductCalculator.calculateSumOrProduct(new int[0]));
    }
}