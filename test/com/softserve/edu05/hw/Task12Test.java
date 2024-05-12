package com.softserve.edu05.hw;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Task12Test {

    @Test
    public void sumOrProdSum() {
        System.out.println("The test of the sumOrProd method when sum is running");

        int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int expected = arr[0]+arr[1]+arr[2]+arr[3]+arr[4];
        int value = Task12.sumOrProd(arr);

        assertEquals(expected,value);
        System.out.println("The test of the sumOrProdSum method is finished ");
        System.out.println("**************************************************************** ");
    }
    @Test
    public void sumOrProdProd() {
        System.out.println("The test of the sumOrProd method when prod is running");
        int [] arr2 = new int[]{1,-2,3,4,5,6,7,8,9,10};
        int expected2 = arr2[5]*arr2[6]*arr2[7]*arr2[8]*arr2[9];
        int value2 = Task12.sumOrProd(arr2);
        assertEquals(expected2,value2);
        System.out.println("The test of the sumOrProdProd method is finished ");
        System.out.println("**************************************************************** ");
    }
}