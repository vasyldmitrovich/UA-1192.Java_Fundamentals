package com.softserve.edu05.hw;


import static org.junit.Assert.*;
import org.junit.Test;


public class Subtask1Test {

    @Test
    public void  getDaysTest() {
        System.out.println("getDays test start");
        int month = 13;
        int expected = 0;
        int actual = Subtask1.getDays(month);
        assertEquals(expected, actual);

        System.out.println("getDays test finish successful");
    }
}
