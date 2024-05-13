package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PositionerTest {
    Positioner positioner = new Positioner();

    @Test
    void getSecondPosition() {
        int[] expected = new int[]{2, 1, 4, 1};
        int[] actual = new int[4];
        actual[0] = positioner.getSecondPosition(new int[]{6,-1,8,1,4,5});
        actual[1] = positioner.getSecondPosition(new int[]{8,2,-17,4,5});
        actual[2] = positioner.getSecondPosition(new int[]{-6,30,-18,-64,2,4});
        actual[3] = positioner.getSecondPosition(new int[]{3,10,0,-1,16,-5});
        assertArrayEquals(expected, actual);
    }

    @Test
    void getMins() {
        int[] expected = new int[]{-6, 4};
        int[] actual;
        int[] numbers = new int[]{0,8,18,33,-6,-3};

        actual = positioner.getMins(numbers);

        assertArrayEquals(expected, actual);
    }

    @Test
    void productOfEven() {
        int actual = positioner.productOfEven(new int[]{-2, 4, 6, 3, 2});

        assertEquals(-96, actual);

    }
}