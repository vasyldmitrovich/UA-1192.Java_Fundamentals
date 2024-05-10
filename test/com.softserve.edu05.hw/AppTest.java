package com.softserve.edu05.hw;

import static org.junit.Assert.*;
import org.junit.Test;
public class AppTest {

    @Test
    public void sortByYearTest() {
        System.out.println("sortByYear test start");

        Car [] cars = {new Car("BMW", 2021, 1900),
                new Car("Mazda", 2012, 2400),
                new Car("Porsche", 2020, 4500)};
        Car [] expected = {new Car("Mazda", 2012, 2400),
                new Car("Porsche", 2020, 4500),
                new Car("BMW", 2021, 1900)};
        App.sortByYear(cars);
        assertArrayEquals(cars, expected);

        System.out.println("sortByYear test finish successful");
    }
}
