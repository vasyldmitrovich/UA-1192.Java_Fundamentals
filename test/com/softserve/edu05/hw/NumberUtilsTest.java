package com.softserve.edu05.hw;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberUtilsTest {

    //is it better to check all method's cases in one test or create separate tests:
    //stringToIntegersThrow, stringToIntegersEmpty and stringToIntegersCorrect?????
    @Test
    public void stringToIntegersTest() {
        System.out.println("stringToIntegersFailTest start");

        String stringNumbersFail = "23 sd 21";
        assertThrows(NumberFormatException.class, () -> NumberUtils.stringToIntegers(stringNumbersFail));

        String stringNumbers = " ";
        int[] expected = new int[0];
        int[] actual = NumberUtils.stringToIntegers(stringNumbers);
        assertNotNull(actual);
        assertEquals(0, actual.length);
        assertArrayEquals(expected, actual);

        stringNumbers = "23 12 21";
        expected = new int[] {23, 12, 21};
        actual = NumberUtils.stringToIntegers(stringNumbers);
        assertNotNull(actual);
        assertArrayEquals(expected, actual);

        System.out.println("stringToIntegersFailTest finish successful");
        System.out.println();
    }

    @Test
    public void getIntegersSumOrMultTest() {
        System.out.println("getIntegersSumOrMultTest start");

        int[] numbers = {1};
        int expected = 0;
        int actual = NumberUtils.getIntegersSumOrMult(numbers);
        assertEquals(expected, actual);

        numbers = new int[] {-1};
        expected = 0;
        actual = NumberUtils.getIntegersSumOrMult(numbers);
        assertEquals(expected, actual);

        //even count - sum
        numbers = new int[] {1, 2, 3, -3, 2, -1};
        expected = 6;
        actual = NumberUtils.getIntegersSumOrMult(numbers);
        assertEquals(expected, actual);

        //even count - product
        numbers = new int[] {-5, 3, 1, 4, -6, -3};
        expected = 72;
        actual = NumberUtils.getIntegersSumOrMult(numbers);
        assertEquals(expected, actual);

        //odd count - sum
        numbers = new int[] {4, 3, 6, -10, -5};
        expected = 7;
        actual = NumberUtils.getIntegersSumOrMult(numbers);
        assertEquals(expected, actual);

        //odd count - product
        numbers = new int[] {-6, -3, -4, -3, -4};
        expected = 12;
        actual = NumberUtils.getIntegersSumOrMult(numbers);
        assertEquals(expected, actual);

        System.out.println("getIntegersSumOrMultTest finish successful");
        System.out.println();
    }

    @Test
    public void getSecondPositivePosTest() {
        System.out.println("getSecondPositivePosTest start");

        int[] numbers = new int[0];
        int expected = -2;
        int actual = NumberUtils.getSecondPositivePos(numbers);
        assertEquals(expected, actual);

        numbers = new int[] {-6, -3, -4, -3, -4};
        expected = -2;
        actual = NumberUtils.getSecondPositivePos(numbers);
        assertEquals(expected, actual);

        numbers = new int[] {-6, -3, 4, -3, -4};
        expected = -1;
        actual = NumberUtils.getSecondPositivePos(numbers);
        assertEquals(expected, actual);

        numbers = new int[] {-6, -3, 4, -3, 4};
        expected = 4;
        actual = NumberUtils.getSecondPositivePos(numbers);
        assertEquals(expected, actual);

        System.out.println("getSecondPositivePosTest finish successful");
        System.out.println();
    }

    @Test
    public void getMinimalPosTest() {
        System.out.println("getMinimalPosTest start");

        int[] numbers = new int[0];
        int expected = -1;
        int actual = NumberUtils.getMinimalPos(numbers);
        assertEquals(expected, actual);

        numbers = new int[] {-6, -3, 4, -3, 4};
        expected = 0;
        actual = NumberUtils.getMinimalPos(numbers);
        assertEquals(expected, actual);

        System.out.println("getMinimalPosTest finish successful");
        System.out.println();
    }

    @Test
    public void getProductOfEvensTest() {
        System.out.println("getProductOfEvensTest start");

        int[] numbers = new int[0];
        int expected = 0;
        int actual = NumberUtils.getProductOfEvens(numbers);
        assertEquals(expected, actual);

        numbers = new int[] {1, -3, 5};
        expected = 0;
        actual = NumberUtils.getProductOfEvens(numbers);
        assertEquals(expected, actual);

        numbers = new int[] {1, -2, 3};
        expected = -2;
        actual = NumberUtils.getProductOfEvens(numbers);
        assertEquals(expected, actual);

        numbers = new int[] {1, -2, 2};
        expected = -4;
        actual = NumberUtils.getProductOfEvens(numbers);
        assertEquals(expected, actual);

        System.out.println("getProductOfEvensTest finish successful");
        System.out.println();
    }
}
