package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DaysOfMonthTest {

    @Test
    void getDays() {
        int[] expected = new int[]{28, 31, 30, 31};
        int[] actual = new int[4];

        for (int i=1; i<5; i++ ){
            actual[i-1] = DaysOfMonth.getDays(i+1);
        }
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(expected, actual);
    }
}