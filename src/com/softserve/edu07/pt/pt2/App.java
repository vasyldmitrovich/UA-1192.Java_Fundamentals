package com.softserve.edu07.pt.pt2;

public class App {
    public static void main(String[] args) {
        Person[] persons = {
                new Student("Jack"),
                new Student("Anna"),
                new Teacher("Mr.Oliver", 25345.54),
                new Teacher("Mrs.Jackson", 25742.34),
                new Cleaner("Dakota", 15000.00),
                new Cleaner("Erevan", 15000.00),
        };
        for (var pers : persons) {
            pers.print();
            if (pers instanceof Staff) {
                System.out.println("Salary: " + ((Staff) pers).salary());
            }
        }
    }
}
