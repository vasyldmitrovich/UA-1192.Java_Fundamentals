package com.softserve.edu03.hw;

public class hw3 {
    public static void main() {

        System.out.println();
        System.out.println("Input details for persons 1");
        Person person1 = new Person();
        person1.input();

        System.out.println();
        System.out.println("input details for person 2 ");
        Person person2 = new Person();
        person2.input();

        System.out.println();
        System.out.println("Input details for person 3");
        Person person3 = new Person();
        person3.input();

        System.out.println();
        System.out.println("Input details for person 4 ");
        Person person4 = new Person();
        person4.input();

        System.out.println();
        System.out.println("Input details for person 5");
        Person person5 = new Person();
        person5.input();

        System.out.println();
        System.out.println("Information about person: ");

        System.out.println("Person 1");
        person1.output();
        System.out.println();

        System.out.println("Person 2");
        person2.output();
        System.out.println();

        System.out.println("Person 3");
        person3.output();
        System.out.println();

        System.out.println("Person 4");
        person4.output();
        System.out.println();

        System.out.println("Person 5");
        person5.output();
        System.out.println();
    }
}
