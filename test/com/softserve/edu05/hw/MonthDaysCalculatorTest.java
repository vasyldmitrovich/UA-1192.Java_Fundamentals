package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MonthDaysCalculatorTest {

    @Test
    void testValidMonth() {
        assertEquals(28, MonthDaysCalculator.calculateMonthDays(2));
        assertEquals(31, MonthDaysCalculator.calculateMonthDays(1));
    }

    @Test
    void testInvalidMonth() {
        assertThrows(NoSuchElementException.class, () -> MonthDaysCalculator.calculateMonthDays(30));
    }
}