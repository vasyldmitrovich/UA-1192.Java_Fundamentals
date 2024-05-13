package com.softserve.edu05.hw;

import org.junit.Test;

import static org.junit.Assert.*;


public class CarTest {

    @Test
    public void testSort() {
        Car[] actual1 = {
                new Car("Sedan", 2012, 2.5),
                new Car("Coupe", 2015, 2.5),
                new Car("Hatchback", 2018, 1.8),
                new Car("Truck", 2016, 3.0),
        };

        Car[] expected1 = {
                new Car("Hatchback", 2018, 1.8),
                new Car("Truck", 2016, 3.0),
                new Car("Coupe", 2015, 2.5),
                new Car("Sedan", 2012, 2.5),

        };
        Car.sort(actual1);
        assertArrayEquals(expected1, actual1);
    }

}