package com.softserve.edu05.test;

import com.softserve.edu05.hw.hw1.ActionWith5Int;
import org.junit.Test;

import static org.junit.Assert.*;


public class ActionWith5IntTest {

    @Test
    public void SecondPositivNumInArrIs4() {
        int[] arr = {-5,9,-3,-4,6};
        int result = ActionWith5Int.getPositionSecondPositivNumInArr(arr);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void minInArrayIs5() {
        int[] arr = {-5,9,-3,-4,6};
        int result = ActionWith5Int.getMin(arr);
        int expected = -5;
        assertEquals(expected, result);
    }

    @Test
    public void indexMinIs0() {
        int[] arr = {-5,9,-3,-4,6};
        int result = ActionWith5Int.getIndexMin(arr);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    public void getProductEvenNum() {
        int[] arr = {-5,9,-3,-4,6};
        int result = ActionWith5Int.getProductEvenNum(arr);
        int expected = -24;
        assertEquals(expected, result);
    }
}