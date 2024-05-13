package com.softserve.edu05.hw;

import static org.junit.Assert.*;

import org.junit.*;

public class SumProductTest {
    @Test
    public void testGetSumOrProduct() {
        int[] arr = new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
        int expected = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
        int actual = SumProduct.getSumOrProduct(arr);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetSumOrProduct2() {
        int[] arr1 = new int[]{-1, -1, -2, 2, 3, 3, 4, 4, 5, 5};
        int expected1 = arr1[5] * arr1[6] * arr1[7] * arr1[8] * arr1[9];
        int actual1 = SumProduct.getSumOrProduct(arr1);

        assertEquals(expected1, actual1);

    }

}