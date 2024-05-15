package com.softserve.academy.edu04.hw.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.softserve.academy.edu04.hw.HW4;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class HW4Test {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void checkRange() {
        HW4.checkRange(1.0f, 2.0f, 3.0f);
        assertEquals("All numbers belong to the range [-5, 5]\n", outContent.toString());

        outContent.reset();

        HW4.checkRange(6.0f, 2.0f, 3.0f);
        assertEquals("Not all numbers belong to the range [-5, 5]\n", outContent.toString());
    }


    @Test
    public void testFindMaxMin() {
        HW4.findMaxMin(1, 2, 3);
        assertEquals("Max: 3, Min: 1\n", outContent.toString());

        outContent.reset();

        HW4.findMaxMin(3, 2, 1);
        assertEquals("Max: 3, Min: 1\n", outContent.toString());
    }

    @Test
    public void testPrintHTTPError() {
        HW4.printHTTPError(400);
        assertEquals("BAD_REQUEST\n", outContent.toString());

        outContent.reset();

        HW4.printHTTPError(999);
        assertEquals("Unknown error code999\n", outContent.toString());
    }

    @After
    public void restoreStreamsFindMaxMin() {
        System.setOut(originalOut);
    }
}
