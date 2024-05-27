package com.softserve.edu07.pt;

import com.softserve.edu07.pt.practicaltask1.Animal;
import com.softserve.edu07.pt.practicaltask1.Cat;
import com.softserve.edu07.pt.practicaltask1.Dog;
import com.softserve.edu07.pt.practicaltask2.*;

import java.util.Objects;
import java.util.Scanner;

public class App {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {// Nice to see code like that
        practicalTask1();
        System.out.println("End of first practical task");
        practicalTask2();
        System.out.println("End of second practical task");
    }

    public static void practicalTask1 () {
        Animal [] animals = new Animal[4];
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();
        animals [0] = dog1;
        animals [1] = cat1;

        System.out.println("Enter the name for the dog");
        String name = sc.nextLine();
        System.out.println("Enter the breed for the dog");
        String breed = sc.nextLine();
        animals [2] = new Dog(name, breed);
        System.out.println("Enter the name for the cat");
        name = sc.nextLine();
        System.out.println("Enter the breed for the cat");
        breed = sc.nextLine();
        animals [3] = new Cat(name, breed);

        for (Animal item : animals) {
            System.out.println(item.toString());
            item.voice();
            item.feed();
        }
    }

    public static void practicalTask2() {
        int salary = 0;
        Person [] people = new Person[6];
        people [0] = new Student();
        people [1] = new Teacher();
        people [2] = new Cleaner();

        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        people [3] = new Student(name);
        System.out.println("Enter the name of the teacher");
        name = sc.nextLine();
        System.out.println("Enter the salary for the teacher");

        try {
            salary = sc.nextInt();
            people [4] = new Teacher(name, salary);
            sc.nextLine();
            System.out.println("Enter the name of the cleaner");
            name = sc.nextLine();
            System.out.println("Enter the salary for the cleaner");
            salary = sc.nextInt();
            people [5] = new Cleaner(name, salary);


            for (Person item : people) {
                item.print();
                if (item instanceof Staff) {
                    ((Staff) item).salary();
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
