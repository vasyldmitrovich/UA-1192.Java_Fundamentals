package com.softserve.edu05.hw;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Task52Test {

    private final InputStream systemIn = System.in;

    @Before
    public void setUp() {
        String input = "6\n9\nno\n";
        ByteArrayInputStream testIn = new ByteArrayInputStream(input.getBytes());
        System.setIn(testIn);
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
    }


    @Test
    public void testCalculate() {
        int result = Task52.calculate();
        assertEquals(15, result);
    }
}