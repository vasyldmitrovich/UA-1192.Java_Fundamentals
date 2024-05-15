package com.softserve.academy.edu05.pt.test;

import com.softserve.academy.edu05.pt.Pt5;
import org.junit.Test;

import static org.junit.Assert.*;

public class Pt5Test {

    @Test
    public void task1() {
        String[] expected = {"Cat", "Dog", "Elephant", "Lion", "Tiger"};
        assertArrayEquals(expected, Pt5.task1());

    }

    @Test
    public void task2() {
        int[] arrayInt = {25, 65, 32, 12, 45};
        assertEquals(35.8, Pt5.task2(arrayInt), 0.001);

    }

    @Test
    public void task3() {
        int[] arrayInt = {25, 65, 32, 12, 45};
        assertEquals(2, Pt5.task3(arrayInt));
        assertEquals(-1, Pt5.task3(arrayInt));

    }

    @Test
    public void task4() {
        assertTrue(Pt5.task4(23));
        assertFalse(Pt5.task4(25));
    }

    @Test
    public void task5() {
        int[] result = Pt5.task5();
        assertEquals(3, result.length);
    }
}