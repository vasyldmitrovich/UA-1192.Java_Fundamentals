package com.softserve.academy.edu05.hw;

import com.softserve.academy.edu05.hw.task_1.ArrayMaxMin;
import com.softserve.academy.edu05.hw.task_1.CalculatesNumberOfDays;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        System.out.println("Task 1");
        System.out.println(CalculatesNumberOfDays.execute());
        System.out.println(Arrays.toString(ArrayMaxMin.execute()));

        System.out.println("Task 2");
        (new HW5()).task2();// Make methods static to avoid creating of objects

        System.out.println("Task 3");
        (new HW5()).task3();// Make methods static to avoid creating of objects

        System.out.println("Task 4");
        (new HW5()).task4();// Make methods static to avoid creating of objects
    }
}
