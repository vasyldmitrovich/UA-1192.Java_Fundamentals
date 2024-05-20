package com.softserve.edu05.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CarTest {

    @Test
    void carsSort() {
        System.out.println("*".repeat(10) + "Testing method carsSort" +  "*".repeat(10) + "\n");
        Car[] cars = {
                new Car("Sedan", 2020, 2.0),
                new Car("Suv", 2014, 4.0),
                new Car("Liftback", 2018, 2.0),
                new Car("Coupe", 2021, 3.7),
        };

        Car[] actual = Car.carsSort(cars);

        Car[] expected = {
                new Car("Coupe", 2021, 3.7),
                new Car("Sedan", 2020, 2.0),
                new Car("Liftback", 2018, 2.0),
                new Car("Suv", 2014, 4.0),
        };

        System.out.println(Arrays.toString(actual));
        System.out.println(Arrays.toString(expected));

        Assertions.assertArrayEquals(expected,actual);

        System.out.println("\n" + "*".repeat(10) + "Method carsSort working well" +  "*".repeat(10));

    }


}