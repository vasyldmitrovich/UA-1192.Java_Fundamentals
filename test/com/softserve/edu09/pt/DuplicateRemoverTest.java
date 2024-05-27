package com.softserve.edu09.pt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateRemoverTest {

    @Test
    public void testZeroes(){
        int[] zeroes = new int[]{0,0,0,0,0,0,};
        DuplicateRemover dr = new DuplicateRemover();

        assertEquals(1, dr.remove(zeroes).size());
    }

    @Test
    public void testOrdinary(){
        int[] numbers = new int[]{1,3,5,8,10,15};
        DuplicateRemover dr = new DuplicateRemover();

        assertEquals(6, dr.remove(numbers).size());

        numbers[2] = 10;
        assertEquals(5, dr.remove(numbers).size());
    }



}