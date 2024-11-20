package com.softserve.edu07_oop2.hw;

import java.lang.reflect.Array;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {// Ok

//        task1();
        task2();

    }

    public static void task1() {
        Employee[] employees = {
                new ContractEmployee("5", "Ivan"),
                new ContractEmployee("4", "Kolya"),
                new SalariedEmployee("3", "Olga"),
                new SalariedEmployee("2", "Alex"),
                new ContractEmployee("1", "Egor")
        };


        Arrays.sort(employees, (o1, o2) -> {
            if ((o1 instanceof ContractEmployee || o1 instanceof SalariedEmployee) &&
                    (o2 instanceof ContractEmployee || o2 instanceof SalariedEmployee)) {

                return (int) (((Payment) o2).calculatePay() - ((Payment) o1).calculatePay());

            }
            throw new ClassCastException();
        });

        for (var employ : employees) {
            System.out.println(employ.toString());
        }
    }

    public static void task2() {

        Passengers[] passengers = {
                new Bus(40,"H66"),
                new Car(4, "Volt"),
                new Boat(6, 1600),
                new Motorcycle(1, 280),
                new Liner(3500, 5),
                new Plane(150, 900),
                new Helicopter(4, 4000, 1800),
                new Car(7, "Transit"),
                new Plane(350, 1200)

        };

        for (Passengers num : passengers) {
            System.out.println("Our Vehicle is " + num.getClass().getSimpleName() );
            System.out.println("Quantity of passengers is " + num.getPassengers() + " " + num);

        }
    }
}
