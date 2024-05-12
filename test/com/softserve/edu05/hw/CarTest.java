package com.softserve.edu05.hw;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void arrSort() {
        System.out.println("The test of the arrSort method is running ");
        Car [] arr = {
                new Car("Passenger", 2012, 500),
                new Car("Passenger", 2015, 150),
                new Car("Truck", 2016, 400),
                new Car("Truck", 2012, 600),
        };
        Car [] expected = {
                new Car("Truck", 2016, 400),
                new Car("Passenger", 2015, 150),
                new Car("Passenger", 2012, 500),
                new Car("Truck", 2012, 600),
        };
        Car.arrSort(arr);
        assertArrayEquals(arr,expected);
        System.out.println("The test of the arrSort method is finished ");
        System.out.println("**************************************************************** ");

    }

    @Test
    public void getCarsByYear() {
        System.out.println("The test of the getCarsByYear method is running ");
        Car [] arr = {
                new Car("Passenger", 2012, 500),
                new Car("Passenger", 2015, 150),
                new Car("Truck", 2016, 400),
                new Car("Truck", 2012, 600),
        };
        Car [] value = Car.getCarsByYear(arr,2012);
        Car [] expected = {
                new Car("Passenger", 2012, 500),
                new Car("Truck", 2012, 600),
        };
        assertArrayEquals(value,expected);
        System.out.println("The test of the getCarsByYear method is finished ");
        System.out.println("**************************************************************** ");

    }
}