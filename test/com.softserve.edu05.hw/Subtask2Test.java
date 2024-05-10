package com.softserve.edu05.hw;

import static org.junit.Assert.*;
import org.junit.Test;

public class Subtask2Test {

    @Test
    public void sumTest() {
        System.out.println("sum test start");
        int [] numbers = {2, 5, 9, -3, -8, 12, -2, 1, 10, 4};
        int expected = 12 * -2 * 10 * 4;
        int actual = Subtask2.sum(numbers);
        assertEquals(expected, actual);

        System.out.println("sum test finish successful");
    }

}
