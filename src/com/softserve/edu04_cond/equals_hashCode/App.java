package com.softserve.edu04_cond.equals_hashCode;

public class App {
    public static void main(String[] args) {
        Student st1 = new Student(25, "Ira");
        Student st2 = new Student(25, "Ira");
        System.out.println("st1 == st2: " + (st1 == st2)); // false
        System.out.println("st1.equals(st2): " + st1.equals(st2)); // false if running from Object
        System.out.println("st1 = " + st1.toString());
        System.out.println("st2 = " + st2);
        System.out.println("st1.hashCode() = " + st1.hashCode());
        System.out.println("st2.hashCode() = " + st2.hashCode());
    }
}
