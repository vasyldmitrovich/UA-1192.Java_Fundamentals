package com.softserve.edu05.hw;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AppTest {

    private static int[] monthDays;
    private static Car[] cars;

    @BeforeClass
    public static void setUpBeforeClass() {
        monthDays = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        cars = new Car[] {
                new Car("Coupe", 2016, 2.6),
                new Car("Sedan", 2017, 2.2),
                new Car("Sedan", 2020, 3.0),
                new Car("Coupe", 2011, 2.0),
                new Car("Minivan", 2020, 2.2)
        };
    }

    @Test
    public void getDaysInMonthTest() {
        System.out.println("getDaysInMonthTest start");

        int monthNumber = -2;
        int expected = 0;
        int actual = App.getDaysInMonth(monthNumber);
        assertEquals(expected, actual);

        monthNumber = 13;
        expected = 0;
        actual = App.getDaysInMonth(monthNumber);
        assertEquals(expected, actual);

        monthNumber = 12;
        expected = monthDays[11];
        actual = App.getDaysInMonth(monthNumber);
        assertEquals(expected, actual);

        System.out.println("getDaysInMonthTest finish successful");
        System.out.println();
    }

    @Test
    public void filterCarsByYear() {
        System.out.println("filterCarsByYear start");

        int year = 2009;
        Car[] expected = new Car[0];
        Car[] actual = App.filterCarsByYear(cars, year);
        assertArrayEquals(expected, actual);

        year = 2017;
        expected = new Car[] {
                new Car("Sedan", 2017, 2.2)
        };
        actual = App.filterCarsByYear(cars, year);
        assertArrayEquals(expected, actual);

        year = 2020;
        expected = new Car[] {
                new Car("Sedan", 2020, 3.0),
                new Car("Minivan", 2020, 2.2)
        };
        actual = App.filterCarsByYear(cars, year);
        assertArrayEquals(expected, actual);

        System.out.println("filterCarsByYear finish successful");
        System.out.println();
    }

    @Test
    public void sortCarsByYearTest() {
        System.out.println("sortCarsByYearTest start");

        Car[] expected = new Car[] {
                new Car("Coupe", 2011, 2.0),
                new Car("Coupe", 2016, 2.6),
                new Car("Sedan", 2017, 2.2),
                new Car("Sedan", 2020, 3.0),
                new Car("Minivan", 2020, 2.2)
        };
        //simplify with Cloneable implementation
        Car[] actual = new Car[] {
                new Car(cars[0].getType(), cars[0].getYearOfProd(), cars[0].getEngineCapacity()),
                new Car(cars[1].getType(), cars[1].getYearOfProd(), cars[1].getEngineCapacity()),
                new Car(cars[2].getType(), cars[2].getYearOfProd(), cars[2].getEngineCapacity()),
                new Car(cars[3].getType(), cars[3].getYearOfProd(), cars[3].getEngineCapacity()),
                new Car(cars[4].getType(), cars[4].getYearOfProd(), cars[4].getEngineCapacity()),
        };
        App.sortCarsByYear(actual);
        assertArrayEquals(expected, actual);

        System.out.println("sortCarsByYearTest finish");
        System.out.println();
    }
}
