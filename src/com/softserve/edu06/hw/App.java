package com.softserve.edu06.hw;

import com.softserve.edu06.pt.Line;

public class App {

    public static void main(String[] args){// Ok

        task1();
        task2();

    }

    public static void task1(){

        System.out.println("Homework 06 Task 1");

        Bird arr[] = {
                new Swallow("black", true),
                new Swallow("grey", true),
                new Eagle("grey", true),
                new Eagle("white", true),
                new Kiwi("small", true),
                new Penguin("small", true),
                new Penguin("small", true),
        };

        for (Bird birds : arr) {
            birds.fly();
            birds.print();

        }
    }

    public static void task2() {


        System.out.println("Homework 06 Task 2");

        Empolyee arr[] = {
                new Empolyee("Alex", 40, 25000),
                new Empolyee("Dimon", 21, 20000),
                new Empolyee("Olya", 25, 24000),
                new Developer("Kris", 30, 32000),
                new Developer("Sanya", 30, 30000, "Junior"),
                new Developer("Sanya", 30, 30000, "Middle"),

        };
        for (Empolyee empolyee : arr) {
            System.out.println( empolyee.report());


        }

    }
}
