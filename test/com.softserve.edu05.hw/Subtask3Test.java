package com.softserve.edu05.hw;

import static org.junit.Assert.*;
import org.junit.Test;

public class Subtask3Test {

    @Test
    public void secondPositiveNumTest() {
        System.out.println("SecondPositiveNum test start");

        int [] numbers = {1, -2, -3, 4, 5};
        int expected = 3;
        int actual = Subtask3.secondPositiveNum(numbers);
        assertEquals(expected, actual);

        System.out.println("SecondPositiveNum test finish successful");
    }

    @Test
    public void minimumValueTest() {
        System.out.println("MinimumValue test start");

        int [] numbers = {1, -2, -3, 4, 5};
        int expectedPosition = 2;
        int actualPosition = Subtask3.minimumValue(numbers);
        assertEquals(expectedPosition, actualPosition);

        System.out.println("MinimumValue test finish successful");
    }

    @Test
    public void productOfEvenNumbers() {
        System.out.println("ProductOfEvenNumbers test start");

        int [] numbers = {1, -2, -3, 4, 5};
        int expected = -8;
        int actual = Subtask3.productOfEvenNumbers(numbers);
        assertEquals(expected, actual);

        System.out.println("ProductOfEvenNumbers test finish successful");
    }
}
