package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    public void testSumCalculation() {

        double firstNumber = 5.0;
        double secondNumber = 3.0;
        String input = "N\n";

        ByteArrayInputStream in = new ByteArrayInputStream((firstNumber + "\n" + secondNumber + "\n" + input).getBytes());
        System.setIn(in);

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        App.task2();

        assertEquals("""
                Input first number:\s
                Input second number: \

                Sum of calculated numbers: 8.0
                Do you want to continue? (Y/N):\s
                """, out.toString());
    }

    @Test
    public void testSortingByYearOfProduction() {
        Car[] cars = {
                new Car(CarType.HEAVY_DUTY_TRUCK, 2012, 5.5f),
                new Car(CarType.BUS, 2009, 2.0f),
                new Car(CarType.AUTOMOBILE, 2019, 1.8f),
                new Car(CarType.PICKUP, 2022, 3.6f)
        };

        Car[] expected = {
                new Car(CarType.BUS, 2009, 2.0f),
                new Car(CarType.HEAVY_DUTY_TRUCK, 2012, 5.5f),
                new Car(CarType.AUTOMOBILE, 2019, 1.8f),
                new Car(CarType.PICKUP, 2022, 3.6f)
        };


        Arrays.sort(cars, Comparator.comparing(Car::getYearOfProduction));

        assertArrayEquals(expected, cars);
    }
}