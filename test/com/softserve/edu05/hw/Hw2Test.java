package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Hw2Test {

    @Test
    void arraySum() {
        System.out.println("****TestArraySum started****");
        int[] arr = {-2, 4};

        int actual;
        int expected;

        actual = Hw2.arraySum(arr);
        expected = 2;

        assertEquals(actual, expected);

        System.out.println("Actual = " + actual + "\n" + "Expected = " + expected);
        System.out.println("****TestArraySum - work correct****");
    }
}