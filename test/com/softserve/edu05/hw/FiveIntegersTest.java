package com.softserve.edu05.hw;

import static org.junit.Assert.*;
import org.junit.*;

public class FiveIntegersTest {
    int arr[] = new int[] {-1, -3, 4, 6, -9};
    @Test
    public void testFindSecondPositive() {
        int expected = 4;
        int actual = FiveIntegers.findSecondPositive(arr);
        assertEquals(expected, actual);
    }
    @Test
    public void testFindMin() {
        int expected1 = -9;
        int actual1 = FiveIntegers.findMin(arr);
        assertEquals(expected1, actual1);

    }

    @Test
    public void testFindMinPos() {
        int expected2 = 5;
        int actual2 = FiveIntegers.findMinPos(arr);
        assertEquals(expected2, actual2);
    }

    @Test
    public void testFindEvenProduct() {
        int expected3 = 24;
        int actual3 = FiveIntegers.findEvenProduct(arr);
        assertEquals(expected3, actual3);
    }

}