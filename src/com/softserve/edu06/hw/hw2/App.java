package com.softserve.edu06.hw.hw2;

public class App {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Josh", 27, 25372.09),
                new Developer("Nate", 25, 15765.48, "Junior Java Developer"),
        };
        for (var i : employees) {
            System.out.println(i.report());
        }
    }
}
