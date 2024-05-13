package com.softserve.edu05.hw;

import static org.junit.Assert.*;
import org.junit.*;

public class MonthsTest {
 @Test
    public void testTask1Months() {
    int expected = 28;
    int numOfMonth = 2;
    int actual = Months.getNumberOfDays(numOfMonth);

    assertEquals(expected, actual);
 }
}