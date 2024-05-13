package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Task53Test {
    Car[] cars =new Car[]{
            new Car("Dresla model Ge", 2025, 1500),
            new Car("Jeep Shyrokii", 2016, 2500),
            new Car("Mazda Lopata", 2016, 3500),
            new Car("Chevrolet Zvezdolet", 2025, 6400)};


    @Test
    void getByYear() {
        String expected = "[Dresla model Ge - 2025, Chevrolet Zvezdolet - 2025]";
        assertEquals(expected, Task53.getByYear(cars,2025).toString());

    }

    @Test
    void sortByYear() {
        String expected = "[Jeep Shyrokii - 2016, Mazda Lopata - 2016, Dresla model Ge - 2025, Chevrolet Zvezdolet - 2025]";
        String actual = Task53.sortByYear(cars).toString();
        assertEquals(expected, actual);
    }
}