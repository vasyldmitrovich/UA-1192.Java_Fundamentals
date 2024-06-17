package com.softserve.edu06.hw;

public class hw2 {
    public static void main() {
        Emploee[] employees = {
                new Emploee("Taras", 32, 32735.35),
                new Developer("Andrew", 29, 39983.22, "Developer"),
                new Developer("Julia", 29, 353483.22, "Developer")
        };
        for (var i : employees) {
            System.out.println(i.report());
        }
    }
}
