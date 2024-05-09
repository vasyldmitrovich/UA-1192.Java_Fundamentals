package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ArrayStatsCalculatorTest {

    @Test
    void testCalculateStats() {
        StatsCalculatorResult result1 = ArrayStatsCalculator.calculateStats(new int[] { 1, 2, 3, 4, 5 });
        assertEquals(1, result1.getSecondPositivePosition());
        assertEquals(1, result1.getMin());
        assertEquals(0, result1.getMinPosition());
        assertEquals(8, result1.getProductOfEvenNumbers());
    }

    @Test
    void testWithoutEvenNumbers() {
        StatsCalculatorResult result1 = ArrayStatsCalculator.calculateStats(new int[] { -1, 3, 3, 5, 5 });
        assertEquals(2, result1.getSecondPositivePosition());
        assertEquals(-1, result1.getMin());
        assertEquals(0, result1.getMinPosition());
        assertEquals(0, result1.getProductOfEvenNumbers());
    }

    @Test
    void testWithoutPositiveNumbers() {
        assertThrows(
                NoSuchElementException.class,
                () -> ArrayStatsCalculator.calculateStats(new int[] { -1, -2, -3, -5, -5 }));
    }

    @Test
    void testEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> ArrayStatsCalculator.calculateStats(new int[0]));
    }
}