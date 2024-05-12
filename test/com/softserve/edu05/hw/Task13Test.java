package com.softserve.edu05.hw;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task13Test {

    @Test
    public void findSecondPoz() {
        System.out.println("The test of the findSecondPoz method  is running");
        int [] array = new int[]{2,31,5,3,5};
        int expected = 2;
        int value = Task13.findSecondPoz(array);

        assertEquals(expected,value);
        System.out.println("The test of the findSecondPoz method is finished ");
        System.out.println("**************************************************************** ");


    }

    @Test
    public void findMin() {
        System.out.println("The test of the findMin method  is running");
        int [] array = new int[]{2,31,5,3,5};
        int expected = 2;
        int value = Task13.findMin(array);

        assertEquals(expected,value);
        System.out.println("The test of the findMin method is finished ");
        System.out.println("**************************************************************** ");

    }

    @Test
    public void productCalculate() {
        System.out.println("The test of the productCalculate method  is running");
        int [] array = new int[]{2,31,10,3,5};
        int expected = 20;
        int value = Task13.productCalculate(array);

        assertEquals(expected,value);
        System.out.println("The test of the productCalculate method is finished ");
        System.out.println("**************************************************************** ");

    }
}