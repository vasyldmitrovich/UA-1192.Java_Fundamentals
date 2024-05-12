package com.softserve.edu05.hw;

import static org.junit.Assert.*;
import org.junit.*;

public class Task11Test {
    @Test
    public void getDaysByMonth() {
        System.out.println("The test of the getDaysByMonth method is running ");
        int expected = 31;
        int number = 1;
        int actual = Task11.GetDaysByMonth(number);

        assertEquals(expected,actual);
        System.out.println("The test of the getDaysByMonth method is finished ");
        System.out.println("**************************************************************** ");


    }
}